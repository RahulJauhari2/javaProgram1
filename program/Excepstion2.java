
import java.util.Scanner;


public class Excepstion2 {
    public static void main(String [] args){
        InnerExcepstion2 obj1 = new InnerExcepstion2();
       try {
        
           obj1.Withdraw();
       } catch (TransactionalError e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
       }

    }
} 
class InnerExcepstion2 {
Scanner sc = new  Scanner(System.in);
private int ab , wa , Amount;
public  void Withdraw() throws TransactionalError,ArithmeticException{


System.out.println("Enter Account balamce");
ab = sc.nextInt();
System.out.println("Enter Withdraw Amount");
wa = sc.nextInt();
int  Amount = ab - wa ;
if(wa > ab){
    throw new TransactionalError();
}
   System.out.println("Amout withdraw "+ Amount);


    
}
}
class TransactionalError extends ArithmeticException{
    public TransactionalError(){
    super("Transactional Error");
    }
    public TransactionalError(String msg){
        super(msg);
    }
}
