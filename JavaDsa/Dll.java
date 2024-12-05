public class Dll {
    public static void main(String[]args){
        List obj = new List();
        obj.appand(10);
        obj.appand(20);
        obj.appand(30);
        obj.appand(40);
        obj.printList();
        //obj.prepand(100);
        //obj.appand(80);
       // System.out.println("Node "+obj.search(30).value);// print address value
        //System.out.println("next.pre "+obj.search(30).next.pre.value);// print address value
        //System.out.println("pre.next "+obj.search(30).pre.next.value);// print address value
        //System.out.println("pre "+obj.search(30).pre.value);// print address value
        //System.out.println("next "+obj.search(30).next.value);// print address value
        obj.insert(10, 50);
        //obj.deleteFirst();
        //obj.deleteLast();
       // obj.remove(30);
        obj.printList();
        obj.totalIteam();
    }
    
}
 class Node{
    Node pre;
    public int value;
    Node next;
    public Node(int value){
        this.value= value;

}
}
class List{
    Node  head=null , tail= null;
    private int totalElement =0;
     
    public void appand(int value){
        Node newNode = new  Node(value);
        if(head == null){
            head= newNode;
            tail = newNode;
            totalElement++;
        }else{
            tail.next = newNode;
            newNode.pre=tail;
            tail = newNode;
            totalElement++;
        }
    }
    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(" | "+temp.value);
            
            temp = temp.next;
        }
        System.out.println();
        System.out.println();
    }
    public void totalIteam(){
        System.out.println("Total iteam "+ totalElement);
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void prepand(int value){
        Node newNode = new Node(value);
        Node temp = head;
        head = newNode;
        head.next = temp;
    }
    public Node search(int value){
        Node temp = head;
        while (temp!= null) {
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void edit(int value ,int newValue){
        Node temp = head;
        while (temp != null) {
            if(temp.value == value){
                temp.value = newValue;
            }
           temp = temp.next; 
        }
    }
    public void deleteFirst(){
        Node temp = head;
        head = temp.next;
        totalElement--;
    }
    public void deleteLast(){
        Node temp = head;
        while (temp.next.next!=null) {
            
            temp = temp.next;
        }
        temp.next = null;
        totalElement--;
    }
    public void remove(int value){
        Node temp = search(value);
            if(temp!= null){
        
                if(temp.value == head.value){
                    deleteFirst();
                    
                }
                else if(temp.value == tail.value){
                    deleteLast();
            

                }
                else{
                    temp.next.pre= temp.pre;
                    temp.pre.next= temp.next;
                    
                    
                }
                totalElement--;
            }else{
                System.out.println("Value Not found");
            }
        
        
        }
        public void insert(int value ,int newValue){
            Node temp = search(value);
            Node newNode=new Node(newValue);
            if(temp!= null){
                newNode.next=temp.next;
                printList();
                System.out.println("temp next"+temp.next.value);
                temp.next=newNode;
                printList();
                newNode.pre=temp;
                System.out.println("nenode pre"+newNode.pre.value);
                totalElement++;
            }
        }

    }
