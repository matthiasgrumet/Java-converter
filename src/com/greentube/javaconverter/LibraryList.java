package com.greentube.javaconverter;

import java.util.*;

public class LibraryList 
{   
    static String[][] supported = 
    {   
        // normal classes/interfaces and methods
        {   "java.io.PrintStream",
            
            "void print(boolean)",
            "void print(double)",
            "void print(char)",
            "void print(int)",
            "void print(java.lang.Object)",
            "void print(java.lang.String)",
            "void println()",
            "void println(boolean)",
            "void println(double)",
            "void println(char)",
            "void println(int)",
            "void println(java.lang.Object)",
            "void println(java.lang.String)",
        },
        {   "java.lang.AutoCloseable",
            
            "void close()",
        },
        {   "java.lang.Boolean",
            
            "<init>(boolean)", 
            "boolean booleanValue()",     
            "java.lang.String toString(boolean)",
            "java.lang.Boolean valueOf(boolean)",
            "FALSE",
            "TRUE",
        },
        {   "java.lang.Byte",
            
            "<init>(byte)",
            "byte byteValue()",
            "java.lang.String toString(byte)",
            "java.lang.Byte valueOf(byte)",
            "MIN_VALUE",
            "MAX_VALUE",
        },
        {   "java.lang.Character",
            
            "<init>(char)",
            "char charValue()",
            "java.lang.String toString(char)",
            "java.lang.Character valueOf(char)",
            "MIN_VALUE",
            "MAX_VALUE",
        },
        {   "java.lang.Double",
            
            "<init>(double)",
            "double doubleValue()",
            "boolean isInfinite()",
            "boolean isInfinite(double)",
            "boolean isNaN()",
            "boolean isNaN(double)",
            "double parseDouble(java.lang.String)",
            "java.lang.String toString(double)",
            "java.lang.Double valueOf(double)",
            "MIN_VALUE",
            "MAX_VALUE",
            "POSITIVE_INFINITY",
            "NEGATIVE_INFINITY",
        },
        {   "java.lang.Enum",
            
            "java.lang.String name()", 
            "int ordinal()", 
        },
        {   "java.lang.Integer",
            
            "<init>(int)",
            "int intValue()",
            "int parseInt(java.lang.String)",
            "java.lang.String toString(int)",
            "java.lang.String toHexString(int)",
            "java.lang.Integer valueOf(int)",
            "MIN_VALUE",
            "MAX_VALUE",
        },
        {   "java.lang.Iterable",
            
            "java.util.Iterator iterator()",
            "void forEach(java.util.function.Consumer)",
        },
        {   "java.lang.Math",
            
            "double abs(double)",
            "int abs(int)",
            "double acos(double)", 
            "double asin(double)", 
            "double atan(double)", 
            "double atan2(double, double)", 
            "double ceil(double)", 
            "double cos(double)", 
            "double cosh(double)", 
            "double exp(double)", 
            "double floor(double)",
            "double hypot(double, double)",
            "double IEEEremainder(double, double)",
            "double log(double)", 
            "double log10(double)", 
            "double max(double, double)", 
            "int max(int, int)", 
            "double min(double, double)", 
            "int min(int, int)", 
            "double pow(double, double)", 
            "double rint(double)", 
            "long round(double)",  // only allowed if immediately casting the result to double or int
            "double signum(double)",
            "double sin(double)", 
            "double sinh(double)", 
            "double sqrt(double)", 
            "double tan(double)", 
            "double tanh(double)", 
            "double toDegrees(double)",
            "double toRadians(double)",
            "E",
            "PI",
        },
        {   "java.lang.Object",
            
            "<init>()",
        },
        {   "java.lang.Runnable",
            
            "void run()",
        },
        {   "java.lang.Short",
            
            "<init>(short)",
            "short shortValue()",
            "java.lang.String toString(short)",
            "java.lang.Short valueOf(short)",
            "MIN_VALUE",
            "MAX_VALUE",
        },
        {   "java.lang.String",
            
            "<init>(char[])",
            "<init>(char[], int, int)",
            "char charAt(int)",
            "int compareTo(java.lang.String)",
            "boolean contains(java.lang.CharSequence)",
            "java.lang.String concat(java.lang.String)",
            "boolean endsWith(java.lang.String)",
            "int indexOf(java.lang.String)",        
            "int indexOf(int)",        
            "int indexOf(java.lang.String, int)",
            "int indexOf(int, int)",
            "boolean isEmpty()",
            "java.lang.String join(java.lang.CharSequence, java.lang.CharSequence[])",
            "int lastIndexOf(java.lang.String)",
            "int lastIndexOf(int)",
            "int lastIndexOf(java.lang.String, int)",
            "int lastIndexOf(int, int)",
            "int length()",            
            "java.lang.String replace(char, char)",
            "java.lang.String replace(java.lang.CharSequence, java.lang.CharSequence)",
            "java.lang.String[] split(java.lang.String)",
            "java.lang.String[] split(java.lang.String, int)",
            "boolean startsWith(java.lang.String)",
            "java.lang.String substring(int)",
            "java.lang.String substring(int, int)",
            "char[] toCharArray()",
            "java.lang.String trim()",
        },
        {   "java.lang.StringBuffer",
            
            "<init>()",
            "<init>(java.lang.String)",
            "java.lang.StringBuffer append(java.lang.Object)",
            "java.lang.StringBuffer append(java.lang.String)",
            "java.lang.StringBuffer append(boolean)",
            "java.lang.StringBuffer append(char)",
            "java.lang.StringBuffer append(int)",
            "java.lang.StringBuffer append(double)",
            "java.lang.StringBuffer append(char[])",            
            "int length()",			
        },
        {   "java.lang.StringBuilder",
            
            "<init>()",
            "<init>(java.lang.String)",
            "java.lang.StringBuilder append(java.lang.Object)",
            "java.lang.StringBuilder append(java.lang.String)",
            "java.lang.StringBuilder append(boolean)",
            "java.lang.StringBuilder append(char)",
            "java.lang.StringBuilder append(int)",
            "java.lang.StringBuilder append(double)",
            "java.lang.StringBuilder append(char[])",            
            "int length()",			
        },
        {   "java.lang.System",
            
            "out",
            "err",
            "void arraycopy(java.lang.Object, int, java.lang.Object, int, int)",
            "void exit(int)",
            "long currentTimeMillis()", // only allowed if immediately casting the result to double or int
        },
        {   "java.util.AbstractCollection",
            
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",        
            "int size()",
            "java.lang.Object[] toArray()",
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",
        },
        {   "java.util.AbstractList",
            
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",

            "boolean add(java.lang.Object)",
            "void add(int, java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "java.lang.Object get(int)",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "java.lang.Object remove(int)",
            "boolean removeAll(java.util.Collection)",
            "void replaceAll(java.util.function.UnaryOperator)",
            "boolean retainAll(java.util.Collection)",
            "java.lang.Object set(int, java.lang.Object)",
            "void sort(java.util.Comparator)",              
        },
        {   "java.util.ArrayList",
            
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",

            "boolean add(java.lang.Object)",
            "void add(int, java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "java.lang.Object get(int)",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "java.lang.Object remove(int)",
            "boolean removeAll(java.util.Collection)",
            "void replaceAll(java.util.function.UnaryOperator)",
            "boolean retainAll(java.util.Collection)",
            "java.lang.Object set(int, java.lang.Object)",
            "void sort(java.util.Comparator)",              

            "<init>()",
            "<init>(java.util.Collection)",			
            "void trimToSize()",						
        },
        {   "java.util.Arrays",
            
            "java.util.List asList(java.lang.Object[])",
            "void sort(java.lang.Object[], java.util.Comparator)", 
            "void sort(java.lang.Object[], int, int, java.util.Comparator)", 
        },
        {   "java.util.Collection",
            
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",
        },
        {   "java.util.Comparator",
            
            "int compare(java.lang.Object, java.lang.Object)",
            "java.util.Comparator thenComparing(java.util.Comparator)",
            "java.util.Comparator reversed()",
        },
        {   "java.util.Enumeration",
            
            "boolean hasMoreElements()",		
            "java.lang.Object nextElement()",			
        },
        {   "java.util.HashMap",
            
            "<init>()",
            "<init>(java.util.Map)",
            "void clear()",        
            "boolean containsKey(java.lang.Object)", 
            "boolean containsValue(java.lang.Object)",   
            "void forEach(java.util.function.BiConsumer)",                 
            "java.lang.Object get(java.lang.Object)",        
            "java.lang.Object getOrDefault(java.lang.Object, java.lang.Object)",
            "boolean isEmpty()",
            "java.util.Set keySet()",
            "java.lang.Object put(java.lang.Object, java.lang.Object)", 
            "void putAll(java.util.Map)",
            "java.lang.Object remove(java.lang.Object)", 
            "int size()",
            "java.util.Collection values()",        
        },
        {   "java.util.HashSet",
            
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",

            "<init>()",
            "<init>(java.util.Collection)",
            "boolean add(java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "void clear()",                
            "boolean remove(java.lang.Object",
            "boolean removeAll(java.util.Collection",			
            "boolean retainAll(java.util.Collection",
        },
        {   "java.util.Hashtable",
            
            "<init>()",
            "<init>(java.util.Map)",
            "void clear()",        
            "boolean containsKey(java.lang.Object)", 
            "boolean containsValue(java.lang.Object)",                    
            "void forEach(java.util.function.BiConsumer)",                 
            "java.lang.Object get(java.lang.Object)",        
            "java.lang.Object getOrDefault(java.lang.Object, java.lang.Object)",
            "boolean isEmpty()",
            "java.util.Set keySet()",
            "java.lang.Object put(java.lang.Object, java.lang.Object)", 
            "void putAll(java.util.Map)",
            "java.lang.Object remove(java.lang.Object)", 
            "int size()",
            "java.util.Collection values()",        

            "java.lang.Object clone()",
            "boolean contains(java.lang.Object)",
            "java.util.Enumeration elements()",
            "java.util.Enumeration keys()",
        },
        {   "java.util.Iterator",
            
            "boolean hasNext()",		
            "java.lang.Object next()",
            "void remove()",
        },
        {   "java.util.LinkedList",
            
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",

            "boolean add(java.lang.Object)",
            "void add(int, java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "java.lang.Object get(int)",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "java.lang.Object remove(int)",
            "boolean removeAll(java.util.Collection)",
            "void replaceAll(java.util.function.UnaryOperator)",
            "boolean retainAll(java.util.Collection)",
            "java.lang.Object set(int, java.lang.Object)",
            "void sort(java.util.Comparator)",              

            "<init>()",
            "<init>(java.util.Collection)",
            "void addFirst(java.lang.Object)",
            "void addLast(java.lang.Object)",
            "java.lang.Object getFirst()",
            "java.lang.Object getLast()",
            "java.lang.Object removeFirst()",
            "java.lang.Object removeLast()",			
        },
        {   "java.util.List",
        
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",

            "boolean add(java.lang.Object)",
            "void add(int, java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "java.lang.Object get(int)",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "java.lang.Object remove(int)",
            "boolean removeAll(java.util.Collection)",
            "void replaceAll(java.util.function.UnaryOperator)",
            "boolean retainAll(java.util.Collection)",
            "java.lang.Object set(int, java.lang.Object)",
            "void sort(java.util.Comparator)",    		    
        },
        {   "java.util.Map",
        
            "void clear()",
            "boolean containsKey(java.lang.Object)",	
            "boolean containsValue(java.lang.Object)",
            "void forEach(java.util.function.BiConsumer)",                 
            "java.lang.Object get(java.lang.Object)",
            "java.lang.Object getOrDefault(java.lang.Object, java.lang.Object)",
            "boolean isEmpty()",
            "java.util.Set keySet()",
            "java.lang.Object put(java.lang.Object, java.lang.Object)",
            "void putAll(java.util.Map)",
            "java.lang.Object remove(java.lang.Object)",
            "int size()",
            "java.util.Collection values()",
        },
        {   "java.util.Set",
        
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",
        },
        {   "java.util.Vector",
        
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	
            "java.lang.Object[] toArray(java.lang.Object[])",
            "boolean removeIf(java.util.function.Predicate)",

            "boolean add(java.lang.Object)",
            "void add(int, java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "java.lang.Object get(int)",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "java.lang.Object remove(int)",
            "boolean removeAll(java.util.Collection)",
            "void replaceAll(java.util.function.UnaryOperator)",
            "boolean retainAll(java.util.Collection)",
            "java.lang.Object set(int, java.lang.Object)",
            "void sort(java.util.Comparator)",              

            "<init>()",
            "<init>(java.util.Collection)",
            "void addElement(java.lang.Object)",
            "java.lang.Object clone()",
            "void copyInto(java.lang.Object[])",        
            "java.lang.Object elementAt(int)",
            "java.util.Enumeration elements()",
            "java.lang.Object firstElement()",
            "int indexOf(java.lang.Object, int)",
            "void insertElementAt(java.lang.Object, int)",
            "java.lang.Object lastElement()",
            "int lastIndexOf(java.lang.Object, int)",
            "void removeAllElements()",
            "boolean removeElement(java.lang.Object)",
            "void removeElementAt(int)",
            "void setElementAt(java.lang.Object, int)",
            "void setSize(int)",
            "void trimToSize()",                                    
        },
        {   "java.util.function.BiConsumer",
        
            "void accept(java.lang.Object, java.lang.Object)",
            "java.util.function.BiConsumer andThen(java.util.function.BiConsumer)",
        },
        {   "java.util.function.Consumer",
              
            "void accept(java.lang.Object)",
            "java.util.function.Consumer andThen(java.util.function.Consumer)",
        },
        {   "java.util.function.Function",
            
            "java.util.function.Function andThen(java.util.function.Function)",
            "java.lang.Object apply(java.lang.Object)",
            "java.util.function.Function compose(java.util.function.Function)",
            "java.util.function.Function identity()",            
        },
        {   "java.util.function.UnaryOperator",
        
            "java.util.function.Function andThen(java.util.function.Function)",
            "java.lang.Object apply(java.lang.Object)",
            "java.util.function.Function compose(java.util.function.Function)",
            "java.util.function.Function identity()",            
        },        
        {   "java.util.function.Predicate",
            
            "java.util.function.Predicate and(java.util.function.Predicate)",
            "java.util.function.Predicate isEqual(java.lang.Object)",
            "java.util.function.Predicate negate()",
            "java.util.function.Predicate or(java.util.function.Predicate)",        
            "boolean test(java.lang.Object)",
        },
        {   "java.util.function.Supplier",
            
            "java.lang.Object get()",
        },
        
        // exceptions
        {   "java.lang.Throwable",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.Exception",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.RuntimeException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.ArithmeticException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.ArrayStoreException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.ClassCastException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.IllegalArgumentException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.IllegalStateException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },
        {   "java.lang.IndexOutOfBoundsException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },   
        {   "java.lang.NegativeArraySizeException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },       
        {   "java.util.NoSuchElementException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },       
        {   "java.lang.NullPointerException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },        
        {   "java.lang.NumberFormatException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },       
        {   "java.lang.UnsupportedOperationException",
            
            "java.lang.String getMessage()",
            "void printStackTrace()",
            
            "<init>()",            
            "<init>(java.lang.String)",            
        },       
        
        // annotations
        {   "java.lang.Deprecated"
        },
        {   "java.lang.FunctionalInterface"
        },
        {   "java.lang.Override"
        },
        {   "java.lang.SafeVarargs"
        },
        {   "java.lang.SuppressWarnings"
        },

    };


    private static HashMap<String,HashSet<String>> map = null;

    private static void buildList() 
    {   
        map = new HashMap<>();
        for (int i=0; i<supported.length; i++) 
        {   String classname = supported[i][0];
            HashSet<String> members = new HashSet<>();
            map.put(classname,  members);
            
            for (int j=1; j<supported[i].length; j++) 
            {   members.add(supported[i][j]);
            }
        }          
    }
    

    public static boolean isAllowed(String fullclassname)
    {
        // generate map at first call for fast retrieval if not done already
        if (map==null) { buildList(); }
        
        // everything from outside any java. package is assumed to be valid
        if (!fullclassname.startsWith("java.")) return true;
        // only allow white-listed classes
        return map.containsKey(fullclassname);            
    }

    public static boolean isAllowed(String fullclassname, String membername)
    {   
        // generate map at first call for fast retrieval if not done already
        if (map==null) { buildList(); }

        // trim away the generic signature part
        int idx;
        while ( (idx = membername.indexOf("<?"))>=0) 
        {   membername = membername.substring(0,idx) 
                + membername.substring(membername.indexOf('>',idx)+1);
        }

        // support these on any object:
        if 
        (   membername.equals("boolean equals(java.lang.Object)")
            || membername.equals("int hashCode()")
            || membername.equals("java.lang.String toString()") 
        )
        {   return true;
        }
        
        // support these on the abstract intermediary classes
        if (fullclassname.equals("java.lang.AbstractStringBuilder") && membername.equals("int length()"))
        {    return true;
        } 
        if (fullclassname.equals("java.util.AbstractSequentialList") && membername.equals("java.util.Iterator iterator()"))
        {    return true;
        } 
        
        // everything from outside any java. package is assumed to be valid
        if (!fullclassname.startsWith("java.")) { return true; }
        // only allow white-listed classes
        if (!map.containsKey(fullclassname)) { return false; }            
        // provided class only allows whitelisted members
        return map.get(fullclassname).contains(membername);	
    }
    
    public static List<String> getRuntimeClassList()
    {
        if (map==null) { buildList(); }
        
        ArrayList<String> l = new ArrayList<>();
        for (String s:map.keySet())
        {   l.add(s);            
        }
        return l;        
    }
    
}
