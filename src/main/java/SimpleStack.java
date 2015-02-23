/**
 * Created by 21105311 on 23/02/2015.
 */
import java.util.*;
import java.lang.Object;

public interface SimpleStack {
    Stack st = new Stack();

    /*Tests if stack is empty*/
    public boolean isEmpty();

    /*Returns the number of items in the stack*/
    public int getSize();

    /*Pushes an item onto the top of this Stack
    null item is allowed
     */
    public void push(Stack item);

    /*Looks at the object at the top of this stack without removing it from the stack.*/
    public Stack peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Stack pop() throws EmptyStackException;
}



