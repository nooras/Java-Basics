/*
QUEUE INTERFACE

1. Particular orderd is maintained
2. Typically FIFO orders
3. Add elements from front of queue

METHODS
1. For addinng elemnts:
boolean add(obj) - exception when size is full
boolean offer(obj) - no exception but return false

2. For removing 
E remove - exception when size is empty - NOSUCHELEMENT
E poll - No exception but return null

3. For accessing front most element
E element() - Exception when q is empty
E peek() - No exception but returns null

push()
pop()
----------------------------------------------

DEQUE INTERFACE

1. Double ended queue
2. Insertion and removal from both end i.e front and back
3.

METHODS:

addFirst(data)
addLast(data)
removeFirst(data)
removeLast(data)

push(data)
pop(data)
peek(data) - return data
-----------------------------------------------

ArrayDeques class:

1. implements the deque interface which allow adding elemnets in both FIFO or LIFO order
2. arrayDeque can be implemented as both stack and queue
3. Array double ended queeue
4. no capacity restriction
5. Does not allow null values to be stored 
*/
package DayNine;

public class QueueInterfaceIntro {

}
