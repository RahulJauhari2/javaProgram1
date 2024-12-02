public class Link {
    Node head;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList(){
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data+ ">");
            temp = temp.next;
        }
    }
    public static void main(String [] args){
        Link list = new Link();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.printList();
    }
    
}

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next= null;
}
    
}
