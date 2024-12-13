public class Assign08StackList {
    public static void main(String[]args){
        Stack obj = new Stack();
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.printStack();
        //obj.peek();
        //obj.pop();
        obj.reverce();
        obj.printStack();
    }
}
class Stack{
    Node head = null;
    public void push(int value){
        Node newNode = new Node(value);
        if(head == null){
           // Node newNode = new Node(value);
            head = newNode;
            
        }else{
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printStack(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value+"=> ");
                temp = temp.next;
            }
            System.out.println();
    }
    public int peek(){
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            return =temp.value;
        }
    }
    public void pop(){
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void reverce(){
        Node current = head;
        
        while (current.next != null) {
           push(peek()); 
          
        }
    
    }

    
    
 class Node {
        int value;
        Node  next = null;
        public Node(int value){
            this.value = value;
            this.next= null;
        }    
    }
}
