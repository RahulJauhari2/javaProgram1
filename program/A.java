package p1;
import p2.B;
public class A {
    public static void main(String [] arg){
        B obj = new B();
        obj.setX(10);
        System.out.println("x: "+ obj.getX());
    }
}
