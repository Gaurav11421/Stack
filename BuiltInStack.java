package Stack;

import java.util.Stack;
class Main{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        System.out.println(st);
        Stack<Integer> st2 = new Stack<Integer>();
        while(st.size() > 0){
            st2.push(st.pop());  
        }
        //System.out.println(st2);
        Stack<Integer> st3 = new Stack<Integer>();
        while(st2.size() > 0){
            st3.push(st2.pop());
        }
        //System.out.println(st3);
        while(st3.size() > 0){
            st.push(st3.pop());
        }
        System.out.println(st);
    }
}
