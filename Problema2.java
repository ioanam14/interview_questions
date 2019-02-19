import java.util.Stack;

/**
 * Created by Ioana on 13-Feb-19.
 */
public class Problema2 {
    private Stack<Integer> newStack, oldStack;

    public Problema2() {
        newStack = new Stack<>();
        oldStack = new Stack<>();
    }

    public int size() {
        return newStack.size() + oldStack.size();
    }

    public void add (Integer value) {
        newStack.push(value);
    }

    private void moveElements() {
        if (oldStack.isEmpty()) {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }

    public Integer peek() {
        moveElements();
        return oldStack.peek();
    }

    public Integer remove() {
        moveElements();
        return oldStack.pop();
    }
}
