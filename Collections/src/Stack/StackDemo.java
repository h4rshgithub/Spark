package Stack;

import java.util.Stack;

public class StackDemo {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);
    }
}
