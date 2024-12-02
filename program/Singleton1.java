public class Singleton1 {

    public static void main(String []arg){
        Abvic obj =  Abvic.getInstance();
        Abvic obj2 =  Abvic.getInstance();
        Abvic obj3 =  new Singleton1();
        System.out.println(obj);
        System.out.println(obj2);

    }
}
class Abvic{
    //private String name;
   // private int age;
    public static Abvic TheAbvic = null;
    public static Abvic getInstance(){
        if(TheAbvic==null){
              TheAbvic = new Abvic();
        }
        return TheAbvic;
    }
    private Abvic(){
       // System.out.println("obj created");
    }
}