public class Constructor {
    public static void main(String [] arg){
        Main obj = new Main("rahul jauhari");
       Main obj2 = new Main(obj);
       Main obj3 = new Main(obj);
        System.out.println();
        
        
    }
    
}
class Main{
    String name;
    {
        System.out.println("initialization block run");
    }
    static{
        System.out.println("Static block run");
    }
    
    Main(){
        System.out.println("Rahul constructor call");
    }
        
    Main(String TheName){
        name = TheName;
        System.out.println("Parameterize constructor call "+name);
    }
    Main(Main p){
        name = p.name;
        System.out.println("copy constructor call " + p.name);
    }
    {
        System.out.println("last block run");
    }
}