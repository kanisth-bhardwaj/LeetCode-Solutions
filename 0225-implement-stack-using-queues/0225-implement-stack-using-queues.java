
import java.util.*;

class MyStack {

    Queue<Integer> s1 = new LinkedList<>();
    Queue<Integer> s2 = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {

        s2.add(x);

        while (!s1.isEmpty()) {
            s2.add(s1.remove());
        }

        Queue<Integer> temp = s1;
        s1 = s2;
        s2 = temp;
    }

    public int pop() {
        return s1.remove();
    }

    public int top() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
