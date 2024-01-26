package Stacks;

public class ValidParenthesis {

}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(isOpening(curr)){
                st.push(curr);
            }else{
                if(st.isEmpty()){
                    return false;
                }else if(isMatching(st.peek(), curr)){
                    st.pop();
                }else{
                    st.push(curr);
                }
            }
        }
        return st.isEmpty();
    }
    public boolean isOpening(char c){
        return c=='(' || c=='[' || c=='{';
    }
    public boolean isMatching(char c1, char c2){
        return (c1=='(' && c2==')') || (c1=='[' && c2==']') || (c1=='{' && c2=='}');
    }
}
