public class Assign07Stack {
    public static void main(String[] args){
        Stack obj = new Stack(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(50);
        obj.sprint();
        
        obj.peek();
        obj.pop();
        obj.sprint();
        obj.overFlow();
    }
    
}
class Stack{
    private String out_of_range="Out of range";
    private String stack_over_flow="Stack over flow";
    private int top=-1;
    private int size=-1;
    private Object[] ptr;
    public Stack(int size){
        this.size = size;
         ptr = new Object[size];
        
    }
    public void push(int value){
        if(top < 5)
            ptr[++top]=value;
    else{
        throw new stackException();
    }
}
    public void peek(){
        if(!isEmpty())
            System.out.println(ptr[top]);
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void  sprint(){
        for(int i=0;i<=top;i++){
            System.out.println(ptr[i]);
        }
        System.out.println();
    }
    public void pop(){
        top--;
    }
    public void overFlow(){
        if(top > size){
            System.out.println(stack_over_flow);
        }
    }

}
class stackException extends ArrayStoreException{
    public stackException(String msg){
        System.out.println(msg);
    }
    public stackException(){
        System.out.println("Stack excepstion");
    }
}