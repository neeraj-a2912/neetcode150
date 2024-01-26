package Stacks;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int top = st.pop();
                result[top] = i-top;
            }
            st.push(i);
        }
        return result;
    }
}

