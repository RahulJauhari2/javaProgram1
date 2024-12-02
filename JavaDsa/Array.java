

public class Array {
    private Object[] ptr;
    private int lastIndex;

    //constructor 
    public Array(int size){
        ptr = new Object[size];
        lastIndex = -1;
    }
//Appand data
public void appand(Object data){
    if(isFull()){
        System.out.println("Array is full");
        return;
    }
    ptr[++lastIndex]=data;
}
// insert data in array
public void insert(int index , Object data){
    if(index <0 || index > lastIndex+1){
        System.out.println("invalid index");
    }
    if(isFull()){
        System.out.println("Array is full");
        return;
    }
    for(int i= lastIndex ;i >= index; i--){
        ptr[i+1]=ptr[i];
    }
    ptr[index]=data;
    lastIndex++;
}
//print Array
public void printArray(){
    for(int i=0;i<=lastIndex;i++){
        System.out.println(ptr[i]);
    }
}
//Array edit
public void editArray(int index , Object data){
    if (index < 0 || index > lastIndex) {
        System.out.println("Invalid index");
        return;
    }
    ptr[index-1]=data;
}
public void delete(int index){
    if (index < 0 || index > lastIndex) {
        System.out.println("Invalid index");
        return;
    }
for(int i = index ; i<= lastIndex; i++){
    
    ptr[i-1]=ptr[i];
}
lastIndex--;
}
public void totalElements(){
    int x = lastIndex;
    System.out.println("Total number of elements in array "+ ++x);
}
public void isEmpty(){
    if(lastIndex == -1){
        System.out.println("Array is Empty");
    }else{
        System.out.println("Array is Not Empty");

    }
}
public Object getValue(int index){
    if (index < 0 || index > lastIndex) {
        System.out.println("Invalid index");
        return null;
    }
    return ptr[index+1];
    
}
public void capacity(){
    System.out.println("Capacity of Array is "+ ptr.length);
}
public boolean isFull(){
    return lastIndex == ptr.length-1;
}
  public static void main(String[]args){
    Array obj = new Array(5);
    
    obj.appand(10);
    obj.appand(20);
    obj.appand(30);
    obj.appand(50);
    
    obj.totalElements();
    obj.printArray();
    //System.out.println("After");
    //obj.insert(2,50);
   // obj.editArray(3, 100);
   //obj.delete(3);
    obj.totalElements();
    obj.isEmpty();
    System.out.println("get value "+obj.getValue(2));
    obj.printArray();
    obj.capacity();
  }  
}
