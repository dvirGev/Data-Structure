import java.util.Stack;

public class Ex2 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    public Ex2() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public boolean isEmpty(){
        return stack1.empty() && stack2.empty();
    }
    //זמן ריצה O(1)
    
    public void Enqueue(int x){
        stack1.push(x);
    }
    // זמן ריצה O(1)

    public int Dequeue(){
        if (!stack2.empty()) {
                return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    //זמן ריצה O(n)
    
}