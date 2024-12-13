public class Assignment09 {
    public static void main(String[] args) {
        Queue obj = new Queue(5);
        obj.enqueue(5);
        obj.enqueue(50);
        obj.enqueue(30);
        obj.rearValue();
        obj.printQueue();
        
    }
    
}
class Queue{
    private int front=-1;
    private int rear =-1;
    private int lastindex=0;
    
    private int []ptr;
    public Queue(int size){
        ptr = new int[size];
    }
    public void enqueue(int value){
        
            ptr[++rear]= value;
            lastindex++;
            front=0;
    }
    public boolean isEmpty(){
        return rear == -1;
    }
    
    public void rearValue(){
        if(!isEmpty()){
            System.out.println(ptr[rear]);
        }
}
    public void frontValue(){
        if(lastindex>0){
            System.out.println(ptr[front]);
        }
    }
    public void printQueue(){
        if(!isEmpty()){
            for(int n = rear; n>=0 ;n--){
                System.out.println(ptr[n]);
            }
            }else{
                System.out.println("Queue is empty");
        }
        System.out.println();
    }
}
