
public class MyOwnArrayList{

    private Object[] elementData;  //Making one array to hold data
    private int size;
    
    public MyOwnArrayList() {
    	this.elementData = (Object[])new Object[10];
    }

    public boolean add(Object obj) {
        validateCapacity(size + 1);  
        elementData[size++] = obj;
        return true;
    }

    public Object get(int index) {
        Object obj=elementData[index];
        return obj;
    }

    public int size() {
        return size;
    }
    public void validateCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        if (minCapacity > oldCapacity) {
            Object oldData[] = elementData;
            int newCapacity = (oldCapacity * 3)/2 + 1; //Size increases by 1.5 times+1.

            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elementData = (Object[])new Object[newCapacity];            
            System.arraycopy(oldData, 0, elementData, 0, size); //src, srcPos, dest, destPos, length
            //System.arraycopy(src, srcPos, dest, destPos, length);
        }
    }
}
