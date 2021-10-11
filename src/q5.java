import java.util.LinkedList;
import java.util.Queue;

public class q5 {
    public static void main(String[] args) {
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            Q1.add(rand());
        }
        for (int i = 0; i < 5; i++) {
            Q2.add(rand());
        }
        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);
        f(Q1, Q2);
        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);

    }
    public static void f(Queue<Integer> Q1, Queue<Integer> Q2){
            while(!Q2.isEmpty()){
                int size = Q1.size();
                int n2 = Q2.poll();
                for (int i = 0; i < size; i++) {
                    int n1 = Q1.poll();
                    if (n1!=n2) {
                        Q1.add(n1);
                    }
                }
            }
    }
    public static int rand(){
        return (int)(Math.random() * 10);
    }
}
