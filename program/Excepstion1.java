import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepstion1 {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            System.out.println("a/b "+x/y);
            int c= x/y;
            System.out.println("squre "+ c*c);

        }catch(InputMismatchException e ){

            System.out.println("excepstion "+e.getMessage());

        }catch(ArithmeticException e) {
            System.out.println("Arithmetic"+e.getMessage());
        }
        finally{
            System.out.println("final chal gya bhai");
        }
            System.out.println("enter two value");
            scan.nextLine();
            int a= scan.nextInt();
            int b= scan.nextInt();
            System.out.println(a+b);
        
    }
    
}
