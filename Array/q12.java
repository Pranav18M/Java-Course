package DSA;

public class Array {
    int [] arr;
    int size;
    int capacity;
    Array(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }
    
    boolean insert ( int index , int element) {
        if (index < 0 || index > size || size == capacity) {
            return false;
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        size++;
        return true;
    }
    public static void main(String[] args) {
        Array arr1 = new Array(5);
        


    }
}
