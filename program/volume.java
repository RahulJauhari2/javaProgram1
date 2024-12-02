class Demo{
private int l,b,h;

public int getL() {
    return l;
}

public void setL(int l) {
    this.l = l;
}

public int getB() {
    return b;
}

public void setB(int b) {
    this.b = b;
}
public int geth() {
    return h;
}

public void seth(int h) {
    this.h = h;

}
public  int getSurfaceArea(){
    return 2*((l*b)+(b*h) +( h*l));
}
public int getVolume(){
    return l*b*h;
    
}
}
public class volume {

  public static void main(String[]arg){
    Demo obj=new Demo();
    obj.setL(2);
    obj.setB(4);
    obj.seth(8);
    System.out.println(obj.getL());
    System.out.println(obj.getB());
    System.out.println(obj.geth());
    System.out.println("volume: "+obj.getVolume());
    System.out.println("surfaceArea= "+obj.getSurfaceArea());

  }  
} 

