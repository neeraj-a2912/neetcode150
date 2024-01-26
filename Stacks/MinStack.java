package Stacks;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public void push(int val) {
        if(st.isEmpty() || val<=minSt.peek()){
            minSt.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.peek().equals(minSt.peek())){
            minSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
