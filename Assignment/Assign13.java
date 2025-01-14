public class Assign13 {
    public static void main(String[] args){
        Recurstion obj = new Recurstion();
        int n=3;
       /* 
        for(int i=0;i<n;i++){
            System.out.println(obj.fibonachi(i));
        }
        */    
        //obj.decimalToBinary(n);
        //obj.decimalToOctal(n);
        //obj.reverseNumber(n);
        System.out.println(obj.sumOfSquare(n));

    }
    
}
class Recurstion{
    public int  fibonachi(int n){
        int a=0;
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
             return fibonachi(n-1)+fibonachi(n-2);
             
        }
    }
    public void decimalToBinary(int n){
        if(n == 0){
            return;
        }
        decimalToBinary(n/2);
        System.out.print(n%2);
    }
    public void decimalToOctal(int n){
        if(n == 0){
            return;
        }
        decimalToBinary(n/8);
        System.out.print(n%8);
    }
    public void reverseNumber(int n){
        if(n == 0){
            return;
        }
        System.out.print(n%10);
        reverseNumber(n/10);
    }
    public int sumOfSquare(int n){
        int x=0;
        if(n == 0){
            return 0;
        }else{
            return n* n + sumOfSquare(n-1)  ;
            
    }
   

}
}
