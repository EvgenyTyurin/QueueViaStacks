import java.util.Stack;

/**
 * Queue via two stacks realization
 */

public class MyQueue {

    Stack pushStack = new Stack();
    Stack popStack = new Stack();

    // Push as usual to push stack
    public void push(Object item) {
        pushStack.push(item);
    }

    // On pop transfer all elements from push stack
    // to pop stack (the order will be reversed automatically)
    // and pop from it
    public Object pop() {
        if (!popStack.empty()) {
            return popStack.pop();
        } else {
            while (!pushStack.empty()) {
                popStack.push(pushStack.pop());
            }
            if (!popStack.empty())
                return popStack.pop();
            else
                return null;
        }
    }

}
