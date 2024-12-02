public class Threadexample {
    public static void main(String[]args){
        A obj1 = new A();
        B obj2 = new B();
    
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName());
    }
    
}

class A implements Runnable{
    public void run(){
        f1();
    }
    public void f1(){
        for(int x=1 ; x<5;x++){
            System.out.println("X= "+x);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class B implements Runnable{
    public void run(){
        f2();
    }
    public void f2(){
        for(int y=1 ; y<5;y++){
            System.out.println("Y= "+y);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
