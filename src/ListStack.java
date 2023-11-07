import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.Iterator;

public class ListStack implements BKStack, Iterable {

    private ListStackNode head; // Represents a pointer to the start of the linked list
    private int count; // Count of the items in the linked list

    /*
        Constructor method that creates an empty node object
    */
    public ListStack(){
        head = null;
        count = 0;
    }

    /*
        Returns true if there are no elements in the linked list, false otherwise
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
        Returns the number of elements in the list
    */
    @Override
    public int count() {
        int counter = 0;

        for(Object b : this){
            counter++;
        }

        return counter;
    }

    /*
        Adds a node to the start of the linked list, becoming the new head of the list.
        Increase the count of elements in the list
    */
    @Override
    public void push(double d) {
        if(count == 0){
            head = new ListStackNode(d);
            count++;
        } else {
            ListStackNode newHead = new ListStackNode(d);
            newHead.next = head;
            head = newHead;
            count++;
        }

    }

    /*
        Removes the start of the linked list and sets the head to the next value and
        decrease the count of elements to 0
    */
    @Override
    public double pop() {
        if(count == 0){
            throw new EmptyStackException();
        } else{
            double temp = head.value;
            head = head.next;
            count--;
            return temp;
        }
    }

    /*
        Returns the value of the head of the linked list
    */
    @Override
    public double peek() {
        if(count == 0){
            throw new EmptyStackException();
        } else{
            return head.value;
        }

    }

    public class ListIterator implements Iterator {
        ListStackNode currNode; // Points to a node in the linked list

        public ListIterator(ListStack listStack){
            currNode = listStack.head;
        }
        /*
            Checks whether or not the current node has a .next value
        */
        public boolean hasNext(){
            if(currNode.next != null){
                return true;
            } else {
                return false;
            }
        }
        /*
            Shifts to the next node in the linked list and now points to it
        */
        public Object next () {
            double data = currNode.value;
            currNode = currNode.next;
            return data;
        }

        public void remove(){
            throw new ConcurrentModificationException(); // Stops Concurrent Modification
        }
    }

    @Override
    public Iterator<ListStack> iterator() {
        return new ListIterator(this);
    } // Use the Iterator class

}
