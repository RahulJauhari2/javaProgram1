import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign23 {
    public static void main(String []args){
     InnerAssign23 obj1 =new InnerAssign23();
     //obj1.Array(); 
     obj1.Factorial(); 
       
    }
}
 class InnerAssign23 {
    
    Scanner sc =new Scanner(System.in);
    public void Array(){    
    
        int N=0, sum =0;
        double avg=0;
        
        System.out.println("Enter the number");
        try{
           // sc.nextLine();
            N = Integer.parseInt(sc.nextLine());
        }
        
        catch(NumberFormatException e){
            System.out.println("Invalid input. Please enter an integer."+e.getMessage());
            System.out.println("Enter the number");
            N = Integer.parseInt(sc.nextLine());
        }
        int[] a;
        a = new int[N];
        System.out.println("input "+N +" Nubers in array");
        for(int x=0 ; x <N ; x++){
            try{

                a[x]=Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
            System.out.println("Invalid input. Please enter an integer.");
                x--;
            }

        }
        for(int x=0 ; x <N ; x++){
            System.out.println("array "+ a[x]);
            sum = sum + a[x];
        }
        avg = sum / (double) N ;
        System.out.println("Total "+ sum);
        System.out.println("Averge "+ avg);
    }
    
    public void Factorial(){
        System.out.println("enter the number to find Factorial");
        int fact=1,n,x;
        try{
        n = sc.nextInt();
        }
        catch(InputMismatchException e){
           System.out.println("Input integer value"); 
           sc.nextLine();
            n = sc.nextInt();
        
        for(x=1 ; x<=n; x++){
            fact = fact * x;
        }
    }
        System.out.println("factorical "+ fact);
    }
}

