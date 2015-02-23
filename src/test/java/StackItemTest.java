import junit.framework.TestCase;
import java.util.EmptyStackException;
import java.util.Stack;
public class StackItemTest extends TestCase {

    Stack <Integer> uneStackTest = new Stack();

    public boolean testIsEmpty() throws Exception {
        return uneStackTest.isEmpty();
    }

    public int testGetSize() throws Exception {
        return uneStackTest.size();
    }

    public void testPush(int unItem) throws Exception {
        uneStackTest.push(unItem);
    }

    public int testPeek() throws Exception {
       return uneStackTest.peek();
    }

    public int testPop() throws Exception {
        return uneStackTest.pop();
    }
}