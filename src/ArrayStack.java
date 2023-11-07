import java.util.EmptyStackException;

public class ArrayStack implements BKStack{
    private final int INITIAL_CAPACITY = 999; // Initial capacity of the array
    private double [] ArrayStack; // Array that holds elements
    private int count; // Count of the elements in the array

    /*
        Constructor that initializes the array to a size of 200 and sets the size of the elements to 0
    */
    public ArrayStack(){
        ArrayStack = new double[INITIAL_CAPACITY];
        count = 0;
     }
    /*
        Method that returns true if there are no elements in the array, false otherwise.
    */
     @Override
    public boolean isEmpty() {
        if(count == 0){
            return true;
        } else {
            return false;
        }
    }
    /*
        Returns array element count
    */
    @Override
    public int count() {
        return count;
    }
    /*
        Add an element to the end of the array. If the size of the elements ever reaches the max
        capacity of the array, double the length of the array. Then, increase count of elements
    */
    @Override
    public void push(double d) {
        if(count == ArrayStack.length){
            doubleCapacity(ArrayStack);
        }

        ArrayStack[count] = d;
        count++;
    }
    /*
        Removes element at the end of the array, returns the element removed, and decreases the
        count of elements by one
    */
    @Override
    public double pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        double temp = ArrayStack[count];
        ArrayStack[count] = 0.0;
        count--;
        return temp;
    }
    /*
        Returns the last element of the array
    */
    @Override
    public double peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return ArrayStack[count];
    }
    /*
        Sets a temporary array with the size of 2 times the length of the original array, copies all items
        into the temp array, and sets the global ArrayStack equal into the temporary array
    */
    public void doubleCapacity(double [] originalArr){
        double [] tempArr = new double[originalArr.length * 2];

        for(int k = 0; k < originalArr.length; k++){
            tempArr[k] = originalArr[k];
        }

        this.ArrayStack = tempArr;
    }
}
