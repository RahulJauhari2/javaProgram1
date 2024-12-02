public class Singleton {

     public static void main(String []arg){
        Person obj1 = Person.getObject();
        Person obj2 = new Person();
        Person obj3 = new Person();
        System.out.println(obj1);
        System.out.println(obj2);
     }
}
class Person{
    public static Person personObj =null;
    public static int numerOfObject=1;
    public static Person getObject(){
    if(personObj==null){
        return personObj = new Person();
    }
    return personObj;
}
     Person(){
        System.out.println("Obj created"+ numerOfObject);
        numerOfObject++;
    }
}