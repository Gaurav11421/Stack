// Implement stack trough Array
package Stack;

public class ArrayImplementStack {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0;
        public void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        public int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        public int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty");
                return 0;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        public void display(){
            for(int i=idx-1; i >= 0; i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public int size(){
            return idx;
        }
        public boolean isEmpty(){
            if(idx == 0){
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if(idx == arr.length){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args){
        Stack stack = new Stack();
        //System.out.println(stack.peek());
        stack.push(9);
        stack.push(8);
        stack.push(2);
        stack.push(7);
        stack.push(6);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        System.out.println("Size of stack : "+ stack.size());
        stack.push(9);
        stack.push(7);
        stack.display();
    }
}
