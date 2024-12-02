class Main{
    int x;
    String name;
    public int getX() {
        return x;
    }
    public void setX(int a) {
        x = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String b) {
        name = b;
    }
    
}
public class Demo2{
    public static void main(String []arg){
        Main obj = new Main();
        Main obj2 = new Main();
        obj.setX(123);
        obj.setName("Rahul");
        System.out.println(obj.getX()+ obj.getName());
        obj2.name ="abvic";
        System.out.println(obj2.getName());
    }
}