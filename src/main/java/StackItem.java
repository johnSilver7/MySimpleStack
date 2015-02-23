import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21105311 on 23/02/2015.
 */
public class StackItem implements SimpleStack {

    Stack<Integer> uneStack;

    public boolean isEmpty() {
        return this.uneStack.empty();
    }

    public int getSize() {
        return this.uneStack.size();
    }

    public void push(int unItem) {
        uneStack.push(unItem);
    }

    /*Looks at the object at the top of this stack without removing it from the stack.*/
    public int peek() throws EmptyStackException {
        return this.uneStack.peek();
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     */
    public int pop() throws EmptyStackException {
        return this.uneStack.pop();
    }


}
