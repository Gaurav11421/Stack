package Stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Stack{
    Node head = null;
    int size = -1;
    public void push(int data){
        Node newNode = new Node(data);
        Node temp = newNode;
        temp.next = head;
        head = temp;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
    }
    // public void printRev(){
    //     Node current = head;
    //     while(current != null){
    //         System.out.print(current.data+" ");
    //         current = current.next;
    //     }
    // }
    // public void printRec(Node h){
    //     if( h == null){
    //         return;
    //     }
    //     printRec(h.next);
    //     System.out.print(h.data+" ");
    // }
    // public void print(){
    //     printRec(head);
    //     System.out.println();
    //}
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        if(size == -1){
            return true;
        }
        return false;
    }
}
public class LinkedListImplementStack {
    public static void main(String[] args){
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(8);
        stack.display();
        stack.push(7);
        stack.display();
        stack.push(5);
        stack.display();
        stack.push(3);
        stack.display();
        stack.push(2);
        stack.display();
        stack.push(1);
        //stack.print();
        stack.display();
        System.out.println(stack.pop());
        //stack.print();
        stack.display();
        System.out.println("Top element in stack:- "+stack.peek());
        System.out.println(stack.isEmpty());
    }
}
