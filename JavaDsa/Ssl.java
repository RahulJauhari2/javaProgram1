public class Ssl {
    public static void main(String[] args) {

        List obj = new List();
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.printList();
        obj.search(40);
        //obj.insertBegin(100);
        //obj.insertBegin(200);
       // obj.insert(400);
        //obj.deleteFirst();
       // obj.deleteLast();
        obj.printList();
    }
}

class Node {
    public int item;
    Node next;

    public Node(int data) {
        this.item = data;
        this.next = null;
    }
}

class List {
    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {

                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void search(int data){
        Node temp = head;
        int x=0;
        while (temp.next != null) {
                if(temp.item == data){
                    x++;
                    break;
                    
                }
                temp = temp.next;
        }
        if(x !=0){
            System.out.println("Foun at "+ x);
        }else{
        System.out.println("Not found ");
        }
    }
    public void insertBegin(int data){
        Node temp = head;
        Node newNode = new Node(data);
        
        head = newNode ;
        head.next= temp;
    
    }   
    
    public void deleteFirst(){
        Node Temp = head;
        head = Temp.next;
    }
    public void deleteLast(){
        Node temp = head;
        while (temp.next.next != null) {
                temp = temp.next;
                
        }
        temp.next = null;
    }
}
