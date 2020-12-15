import java.util.Arrays;
class DynamicArray{
    private int array[];
    // holds the current size of array
    private int size;
    // holds the total capacity of array
    private int capacity;
     
    // default constructor to initialize the array and values
    public DynamicArray(){
        array = new int[2];
        size=0;
        capacity=2;
    }
     
    // to add an element at the end
    public void addElement(int element){
        // double the capacity if all the allocated space is utilized
        if (size == capacity){
            ensureCapacity(2); 
        }
        array[size] = element;
        size++;
    }
     
    // to add an element at a particular index
    public void addElement(int index, int element){
        // double the capacity if all the allocated space is utilized
        if (size == capacity){
            ensureCapacity(2); 
        }
        // shift all elements from the given index to right
        for(int i=size-1;i>=index;i--){
            array[i+1] = array[i];
        }
        // insert the element at the specified index
        array[index] = element;
        size++;
    }
 
    // to get an element at an index
    public int getElement(int index){
        return array[index];
    }
     
    // to remove an element at a particular index
    public void remove(int index){
        if(index>=size || index<0){
            System.out.println("No element at this index");
        }else{
            for(int i=index;i<size-1;i++){
                array[i] = array[i+1];
            }
            array[size-1]=0;
            size--;
        }
    }
     
    /* method to increase the capacity, if necessary, to ensure it can hold at least the 
    *  number of elements specified by minimum capacity arguement
    */
    public void ensureCapacity(int minCapacity){
        int temp[] = new int[capacity*minCapacity];
        for (int i=0; i < capacity; i++){
            temp[i] = array[i];
        }
        array = temp;
        capacity = capacity * minCapacity;
    }
     
    /*
    *  Trim the capacity of dynamic array to the current size. i.e. remove unused space
    */
    public void trimToSize(){
        System.out.println("Trimming the array");
        int temp[] = new int[size];
        for (int i=0; i < size; i++){
            temp[i] = array[i];
        }
        array = temp;
        capacity = array.length;
         
    }
     
    // to get the current size
    public int size(){
        return size;
    }
     
    // to get the current capacity
    public int capacity(){
        return capacity;
    }
     
    // method to print elements in array
    public void printElements(){
        System.out.println("elements in array are :"+Arrays.toString(array));
    }
}

public class dynamic_array {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        // adding elements at index 0 and 1
        array.addElement(1);
        array.addElement(2);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());
         
        array.addElement(3);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());
        array.printElements();
         
        // add element at index 1
        array.addElement(1,5);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();
         
        // add element at index 2
        array.addElement(2,6);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();
         
        array.remove(2);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();      
 
        array.remove(2);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();
 
        array.remove(1);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();      
         
        array.remove(2);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();
        array.remove(1);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();      
 
        // Trim the array
        array.trimToSize();
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());        
        array.printElements();      
        array.addElement(2);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());
        array.printElements();
        array.addElement(3);
        System.out.println("Size :"+array.size()+
            " and Capacity :"+array.capacity());
        array.printElements();
    }
}
