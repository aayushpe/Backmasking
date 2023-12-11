A backmasking algorithim written in Java that uses the stack data structure to reverse a sound file.





The Back Masking algorithm takes data from both the .dat files and pushes the parsed data into an abstract stack data type. The algorithm then pops each element off the stack and writes the result into an output.dat file, effectively reversing the data of the original .dat sound file. When converting the output.dat file, the audio will be reversed. To implement this abstract stack data type, both array and linked list implementations were used. 


Array Implementation:

The Implementation defines a class named ArrayStack that implements the provided BKStack interface.

The stack has an initial capacity of 999, and it dynamically resizes by doubling its capacity when it reaches its limit in order facilitate constantly appending an item at the end of the array. The isEmpty method checks if the stack does not have any elements, while count returns the current number of elements. This Method is O(1) because it only compares one variable.

Pushing appends an element to the end of the array, (this would be O(1)) increasing the count and potentially triggering a capacity expansion with the doubleCapacity method. The doubleCapacity method facilitates the resizing process by creating a new array with twice the length of the original and copying elements over. This method causes the push method to be O(n) worst case as it needs to loop through the array in order to double and copy the array.

Popping removes and returns the last element, and peeking retrieves the last element without removing it. Both these methods are O(1) since itÕs accessing a specific index of the array.

Additionally, appropriate exceptions are raised for operations on an empty stack. All of these work together to simulate the first in, last out sequence like a stack data type.


Linked List Implementation: 

The Implementation defines a class named ListStack Node that also implements the provided BKStack. 

The ListStackNode class utilizes another class that emulates a node in a linked list. This class, ListStackNode contains the double value it holds, and a variable that points to another ListStackNode object.

Pushing elements in this case, would be O(1) since it always adds to the start of the linked list. When pushing the element, the newly added node becomes the new head and now points to the old head of the list, effectively making it the new start if the list. The pop method would also be O(1) as it removes the node from the start of the linked list. The peek method, similar to the pop method returns the first element of the list in O(1) time.

The count method of the ListStack class uses an enhanced for loop through the Iterator interface in order to return the size of the list in O(n) time. This time complexity can be reduced if a variable changing count variable is used when pushing and popping data, similar to the Array implementation. 

The ListIterator class implements the Iterator Interface in order to facilitate looping through the list. It holds a currentNode object as a pointer through the list. The Has next checks if there is another element after the current node pointer while the next method shifts to the next node. Using these methods in tandem can loop through the linked list. Both these methods are O(1).
