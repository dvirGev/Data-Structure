import java.util.Stack;

public class thor {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public thor() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void Enqueue(int x){
        stack1.push(x);
    }
    public int Dequeue(){
        if (!stack2.empty()) {
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    public boolean isEmpty(){
        return stack1.empty() && stack2.empty();
    }
}
