import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackWithQueue(){
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    public void push(int num){
        queue1.add(num);
    }
    public int pop() {
        if (queue1.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int size = queue1.size()-1;
        for (int i = 0; i < size; i++) {
            queue2.add(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return queue2.poll();
    }
}
