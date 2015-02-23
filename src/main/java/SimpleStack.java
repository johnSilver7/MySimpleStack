/**
 * Created by 21105311 on 23/02/2015.
 */
import java.util.*;
import java.util.Stack;
public interface SimpleStack {
    Stack st = new Stack();

    /*Tests if stack is empty*/
    public boolean isEmpty();

    /*Returns the number of items in the stack*/
    public int getSize();

    /*Pushes an item onto the top of this StackItem
    null item is allowed
     */
    public void push(int item);

    /*Looks at the object at the top of this stack without removing it from the stack.*/
    public int peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public int pop() throws EmptyStackException;
}



