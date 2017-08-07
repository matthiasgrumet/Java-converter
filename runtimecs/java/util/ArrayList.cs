namespace java.util 
{
	public class ArrayList: AbstractList
	{        
        private System.Object[] buffer;
        private int len;
    
        public ArrayList() : base() {
            buffer = new System.Object[10];
            len = 0;            
        }
        
        public ArrayList(Collection collection) : this() {
            addAll(collection);
        }
        
        public override System.Object get(int index) { 
            if (index<0 || index>=len) throw new System.IndexOutOfRangeException();
            return buffer[index];
        }

        public override System.Object set(int index, System.Object element) { 
            if (index<0 || index>=len) throw new System.IndexOutOfRangeException();
            System.Object prev = buffer[index];
            buffer[index] = element;
            return prev; 
        }
        
        public override void add(int index, System.Object element) {
            if (index<0 || index>len) throw new System.IndexOutOfRangeException();
            if (len>=buffer.Length) {
                System.Object[] newbuffer = new System.Object[buffer.Length*2];
                System.Array.Copy(buffer,0, newbuffer,0, buffer.Length);
                buffer = newbuffer;
            }            
            if (index<len) {
                System.Array.Copy(buffer, index, buffer, index+1, len-index);
            }
            buffer[index] = element;
            len++;
        }

        public override System.Object remove(int index) { 
            if (index<0 || index>=len) throw new System.IndexOutOfRangeException();        
            System.Object prev = buffer[index];
            if (index<len-1) {
                System.Array.Copy(buffer, index+1, buffer, index, len-1-index);
            }
            len--;
            buffer[len] = null;
            return prev;
        }
        
        public override int size() {
            return len;
        }
        
        public virtual void trimToSize() {
            if (len < buffer.Length) {
                System.Object[] newbuffer = new System.Object[len];
                System.Array.Copy(buffer,0, newbuffer,0, len);
                buffer = newbuffer;
            }            
        }
        
	}	
}
