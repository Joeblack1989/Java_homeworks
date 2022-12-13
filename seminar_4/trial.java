package seminar_4;

import stack;

public class trial {
    public static void main (String[] args) throws Exception {
        stack<Integer> massive = new stack<>(10);
        System.out.println(massive.size());
        massive.push(1);
        massive.push(2);
        massive.push(3);
        System.out.println(massive.pop());
        System.out.println(massive.peek());
        System.out.println(massive.size());
    }
}
