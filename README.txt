# Backmasking Algorithm in Java

The Backmasking algorithm in Java employs the stack data structure to reverse a sound file. The algorithm parses data from .dat files and utilizes an abstract stack data type to achieve the reversal, ultimately producing an output.dat file with reversed audio.

## Array Implementation

The array implementation involves a class named `ArrayStack` that implements the provided `BKStack` interface.

- **Stack Capacity:** The stack has an initial capacity of 999, dynamically resizing by doubling its capacity when reaching the limit.
- **isEmpty and count Methods:** `isEmpty` checks if the stack has no elements, while `count` returns the current number of elements. The time complexity for both methods is O(1).
- **Push Operation:** Appending an element to the end of the array (O(1)), potentially triggering a capacity expansion with the `doubleCapacity` method.
- **doubleCapacity Method:** Resizes the stack by creating a new array with twice the length and copying elements. The worst-case time complexity is O(n) as it requires looping through the array.
- **Pop and Peek Operations:** Removing and returning the last element (O(1)), and retrieving the last element without removal (O(1)).
- **Exception Handling:** Appropriate exceptions are raised for operations on an empty stack.

## Linked List Implementation

The linked list implementation involves a class named `ListStackNode` that also implements the provided `BKStack`.

- **Node Class:** Utilizes a class emulating a node in a linked list, containing a double value and a variable pointing to another `ListStackNode` object.
- **Push Operation:** Adding elements to the start of the linked list (O(1)), updating the head to the newly added node.
- **Pop and Peek Operations:** Removing the node from the start of the linked list (O(1)), and retrieving the first element without removal (O(1)).
- **Count Method:** Utilizes an enhanced for loop through the `Iterator` interface to return the size of the list in O(n) time.
- **ListIterator Class:** Implements the `Iterator` Interface to loop through the linked list (O(1)).

Both implementations simulate a first-in, last-out sequence characteristic of a stack data type, providing flexibility for the Backmasking algorithm in reversing sound files.
