package com.greentube.convertertestjava5;
import com.greentube.convertertest.Test;
import static com.greentube.convertertestjava5.StaticExporter.*;

public class TestJava5 extends Test {

	
    public static void main(String[] args) {
    	Test.main(args);   
    	
        System.out.println ("-- converter test suite for java 1.5" );
        enumtest();
        staticimportstest();
        varargstest();
    }
        
	public static void enumtest() {
    	System.out.println("- enum");

		Day day1 = Day.MONDAY;
		Day day2 = Day.FRIDAY;
		Day day3 = Day.FRIDAY;
		Day day4 = Day.SUNDAY;
		Day day5  = null;
		
		switch (day1) {
			case MONDAY:  
				break;
			default:      
				assertB(false);
		}
		switch (day2) {
		case MONDAY:  
			assertB(false); 
			break;
		default:      
			assertB(true);
		}
		
		assertB(day1 != day2);
		assertB(day2 == day3);
		assertB(! day1.equals(day2));
		assertB(day1.equals(Day.MONDAY));
		assertB(!day1.equals(Day.TUESDAY));
		assertB(!day2.equals(Day.MONDAY));
		assertB(day2.equals(Day.FRIDAY));
		assertB(day3.equals(day2));
		assertB(!day3.equals(day5));
		
		assertO(day1.name(), "MONDAY");
		assertO(day2.name(), "FRIDAY");
		assertO(Day.TUESDAY.name(), "TUESDAY");
		assertO(Day.TUESDAY.name(), "TUESDAY");
		assertI(day1.ordinal(), 1);
		assertI(day2.ordinal(), 5);
		
		assertB(!day1.isWeekend());
		assertB(day4.isWeekend());
		Day[] w = Day.workingDays();
		assertI(w.length,5);
		assertO(w[0],Day.MONDAY);
		assertO(w[1].toString(),"TUESDAY");
				
		Animal a1 = Animal.ELEPHANT;
		Animal a2 = Animal.GIRAFFE;
		assertB(a1.isMammal());
		assertB(!a1.isReptile());
		assertO(a2.name(), "GIRAFFE");
		assertO(a2.toString(), "GIRAFFE!");
		assertB(Animal.FROG.isAmphibian());
		assertO(Animal.FROG.toString(), "Kermit");
		
		Animal[] animals = Animal.values();
		assertI(animals.length,5);
		assertO(animals[1],Animal.GIRAFFE);
	}
	
	public static void staticimportstest() {
    	System.out.println("- static imports");
    	
    	assertI(XXX, 3);
    	assertI(YYY, 4);
    	assertI(ZZZ, 5);
    	ZZZ = 7;
    	assertI(ZZZ, 7);    	
	}
	
	public static void varargstest() {
    	System.out.println("- var args");
	
    	assertI(sum(1,2,3,4,5), 15);
    	assertI(letters(2,"some","more","advice"), 28);
	}
	
	
	private static int sum(int... a) {
		int s=0;
		for (int i=0; i<a.length; i++) {
			s += a[i];
		}
		return s;
	}
	
	private static int letters(int multiplier, String... a) {
		int s=0;
		for (int i=0; i<a.length; i++) {
			s += multiplier*a[i].length();
		}
		return s;
	}
	
}
