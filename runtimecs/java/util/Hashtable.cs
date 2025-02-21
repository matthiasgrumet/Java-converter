namespace java.util { public class Hashtable : HashMapImpl
{
    public Hashtable() : base() 
    {
    }
        
    public Hashtable(Map m) : base(m) 
    {
    }
     
    // add locking to existing implementations 
    public override void clear() 
    {   lock(this) { base.clear(); }
    }
        
    public override bool containsKey(System.Object key) 
    {   lock(this) { return base.containsKey(key); }
    }
        
    public override bool containsValue(System.Object value) 
    {   lock(this) { return base.containsValue(value); }
    }
            
    public override bool Equals(System.Object o) 
    {   lock(this) { return base.Equals(o); }
    }
        
    public override System.Object get(System.Object key) 
    {   lock(this) { return base.get(key); }
    }
    
    public override int GetHashCode() 
    {   lock(this) { return base.GetHashCode(); }
    }
        
    public override bool isEmpty() 
    {   lock(this) { return base.isEmpty(); }
    }
        
    public override Set keySet() 
    {   lock(this) { return base.keySet(); }
    }
        
    public override System.Object put(System.Object key, System.Object value) 
    {   lock(this) { return base.put(key,value); }
    }
        
    public override void putAll(Map m) 
    {   lock(this) { base.putAll(m); }
    }
        
    public override System.Object remove(System.Object key) 
    {   lock(this) { return base.remove(key); }
    }
        
    public override int size() 
    {   lock(this) { return base.size(); }
    }
        
    public override System.String ToString() 
    {   lock(this) { return base.ToString(); }
    }

    public override Collection values() 
    {   lock(this) { return base.values(); }
    }        

     
    // extra methods available for Hashtable
    public virtual System.Object Clone() 
    {   lock(this) { return new Hashtable(this); }
    }
    
    public virtual bool contains(System.Object value) 
    {   lock(this) { return base.containsValue(value); }
    }
        
    public virtual Enumeration elements() 
    {   lock(this) { return new HashMapIterator(this,false); }
    }
    
    public virtual Enumeration keys() 
    {   lock(this) { return new HashMapIterator(this,true); }
    }          
}}
