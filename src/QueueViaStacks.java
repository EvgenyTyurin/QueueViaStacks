/**
 * Queue via two stacks demo
 */

public class QueueViaStacks {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push("1");
        myQueue.push("2");
        myQueue.push("3");
        System.out.println(myQueue.pop()); // 1
        System.out.println(myQueue.pop()); // 2
        System.out.println(myQueue.pop()); // 3
    }

}
