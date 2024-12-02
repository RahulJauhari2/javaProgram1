public class Override1 {
   /*  public static void main(String [] args){
        Animal myDog = new Dog();
        myDog.sound();
    }
        */
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        
        void sound() {
            System.out.println("Dog barks");
        }
    }
    
   public  class Override1 {
        public static void main(String[] args) {
            Animal myDog = new Dog();
            myDog.sound(); // This will call the overridden method in Dog class
        }
    }
    
}
/* 
class Person{
    String name;
    int age;
    public void getDetails(){
        System.out.println("Name: "+name +"Age: "+age);
    }
    public void SetDetails(String TheName , int TheAge){
        name = TheName;
        age = TheAge;
    }
}
class Student extends Person{
    String name ,email;
    int age;
    @Override
    public void getDetails(){
        System.out.println("Name: "+name +"Age: "+age +"Email: "+email);
    }
    public void SetDetails(String TheName , String TheEmail, int TheAge){
        name = TheName;
        email = TheEmail;
        age = TheAge;
}
}
*/
