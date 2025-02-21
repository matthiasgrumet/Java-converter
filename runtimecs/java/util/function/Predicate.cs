namespace java.util.function { public interface Predicate
{
    Predicate and(Predicate other);
    Predicate negate();
    Predicate or(Predicate other);
    bool test(System.Object s);
}}
namespace java.util.function { public static class Predicate_c
{
    public static Predicate and(Predicate @this, Predicate other)
    {   if (@this==null) throw new System.NullReferenceException();    
        if (other==null) throw new System.ArgumentNullException();
        return new PredicateAnd(@this,other);
    }
    
    public static Predicate negate(Predicate @this)
    {   if (@this==null) throw new System.NullReferenceException();    
        return new PredicateNegate(@this);
    }
    
    public static Predicate or(Predicate @this, Predicate other)
    {   if (@this==null) throw new System.NullReferenceException();    
        if (other==null) throw new System.ArgumentNullException();
        return new PredicateOr(@this,other);
    }
    
    public static Predicate isEqual(System.Object tobj) 
    {   return new PredicateIsEqual(tobj);
    }
}}

namespace java.util.function { public class PredicateIsEqual : Predicate
{
    private readonly System.Object tobj;
    public PredicateIsEqual(System.Object tobj) 
    {   this.tobj = tobj;
    }
    public virtual bool test(System.Object o)
    {   return tobj==null ? o==null : tobj.Equals(o);
    }
    public virtual Predicate and(Predicate other)
    {   return Predicate_c.and(this,other);
    }
    public virtual Predicate negate()
    {   return Predicate_c.negate(this);
    }
    public virtual Predicate or(Predicate other)
    {   return Predicate_c.or(this,other);
    }
}}        

namespace java.util.function { public class PredicateAnd : PredicateIsEqual
{
    private readonly Predicate a;
    private readonly Predicate b;
    public PredicateAnd(Predicate a, Predicate b) : base(null)
    {   this.a = a;
        this.b = b;
    }
    public override bool test(System.Object o)
    {   return a.test(o) && b.test(o);
    }
}}        

namespace java.util.function { public class PredicateNegate : PredicateIsEqual
{
    private readonly Predicate a;
    public PredicateNegate(Predicate a) : base(null)
    {   this.a = a;
    }
    public override bool test(System.Object o)
    {   return !a.test(o);
    }
}}        

namespace java.util.function { public class PredicateOr : PredicateIsEqual
{
    private readonly Predicate a;
    private readonly Predicate b;
    public PredicateOr(Predicate a, Predicate b) : base(null)
    {   this.a = a;
        this.b = b;
    }
    public override bool test(System.Object o)
    {   return a.test(o) || b.test(o);
    }
}}        
