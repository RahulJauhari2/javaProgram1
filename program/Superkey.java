public class Superkey {
    public static void main(String []arg){
        Employe obj = new Employe("xyz@");
    }
    
}
class Person{
   private String name;
   private int age;
   Person(){
    System.out.println("paraents Blank constructor call");
   }
   Person(String TheName){
    name= TheName;
    System.out.println("parents one argument constructor call "+name);
   }
}
class Employe extends Person{
    private String email;
    public void setEmail(String TheEmail){
        email = TheEmail;
    }
    public String getEmail(){
        return email;
    }
    Employe(){
        
    System.out.println("Employ  child class Blank constructor call");
    }
    Employe(String TheEmail){
     // super(TheEmail); 
     this();
    email= TheEmail;
    System.out.println("Child 1 agrument constructor call");

    }
    
}
