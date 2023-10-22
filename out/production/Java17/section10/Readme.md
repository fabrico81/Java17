List, ArrayList, LinkedList, Iterator, Autoboxing.

Collections.
Big-O notation.

An array is a fixed length data structure that stores elements of the same type.
An array is mutable, meaning that the elements of the array can be changed.
Could not be changed the size of the array.


List is an interface that extends Collection.
List is an ordered collection (also known as a sequence).
The user of this interface has precise control over where in the list each element is inserted.
The user can access elements by their integer index (position in the list), and search for elements in the list.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html#method-summary.


The ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.
Maintains an array in memory.
When the array is full, it creates a new array with a larger capacity and copies the contents of the old array to the new array.

What is the record keyword:
https://docs.oracle.com/en/java/javase/17/language/records.html

The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
Big difference between the two is that the LinkedList class also has all of the methods defined in the Queue interface.
The LinkedList class can be used as a list and queue.

LinkedList structure:

https://www.geeksforgeeks.org/linked-list-in-java/


Big-O notation:
https://www.bigocheatsheet.com/

Cost of operations:
An ArrayList is usually used when there are more get operations than add/remove operations.
A LinkedList is usually used when there are more add/remove operations than get operations.
if you want to access random items frequently by index, ArrayList should be choice.
If you want to add/remove items frequently, LinkedList should be used.

##### ArrayList vs LinkedList:
https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/

An ArrayList's index is an int, while a LinkedList's index is a long.
An ArrayList is a resizable array, while a LinkedList is a list of nodes.
An ArrayList is faster for most cases, while a LinkedList is faster when you have to make many modifications to the list.
An Arraylist's memory usage is more efficient, while a LinkedList's memory usage is less efficient.
An ArrayList's index is an int, so the ArrayList can only have Integer.MAX_VALUE elements,
while a LinkedList's index is a long, so a LinkedList can have Integer.MAX_VALUE * Integer.MAX_VALUE elements.

An arrayList is implemented on top of an array. A linkedList is a doubly linked list. 
Both implement the List interface. But the linkedList also implements the Queue and the Stack interface as well.

A Queue is a collection for holding elements prior to processing. Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner.
Ordering is not a fundamental part of the Queue interface. It is part of the contract of the LinkedList class that it maintains order.
FifoQueue is a class that extends LinkedList and implements Queue. It is a FIFO queue. LIFO queue is a stack.
A stack is a collection for holding elements prior to processing. Stacks typically, but do not necessarily, order elements in a LIFO (last-in-first-out) manner.

##### Iterator: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Iterator.html.

We can use an iterator to iterate through all the elements of a collection.
We've mainly used the for loops to traverse through a collection. With index or with for-each loop.
But Java provides us with another way to traverse through a collection.
Two alternatives are the Iterator and the ListIterator.
If familiar with database cursors, then you can think of an iterator as a cursor.
The iterator is pretty simple to use. It has three methods: hasNext(), next(), and remove().
The hasNext() method returns true if there are more elements in the collection to iterate over.
The next() method returns the next element in the collection.
The remove() method removes the last element that was returned by next() from the collection.
When an iterator is created, it is positioned <b>before</b> the first element in the collection.
The first call to next() returns the first element in the collection.
Subsequent calls to next() return the next element in the collection.
When there are no more elements in the collection, the next() method throws a NoSuchElementException.
The remove() method removes the last element that was returned by next() from the collection.
The remove() method can only be called once per call to next().
If you call remove() twice in a row, you will get an IllegalStateException.
The remove() method can only be called after next() has been called.
If you call remove() before calling next(), you will get an IllegalStateException.

##### ListIterator vs Iterator:

An iterator can only traverse a collection in the forward direction, and only has remove() method.
A ListIterator can traverse a collection in either the forward or backward direction, and in addition to the 
remove method, it also supports the add and set methods.

