public class Assign12 {
    public static void main(String[] args) {
        Recurstion obj = new Recurstion();
        //System.out.println(obj.sum(5));
        //System.out.println(obj.evenSum(5));
       // System.out.println(obj.oddSum(5));
       //System.out.println(obj.factorial(5));
       System.out.println(obj.sumOfDigits(123));

        
    }
    
}
class Recurstion{
    public int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
    public int evenSum(int n){
        if(n==2){
            return 2;
        }
        else if(n%2 == 0){
                return n+evenSum(n-1);
            }
        
            return evenSum(n-1);
        }
        public int oddSum(int n){
            if(n==1){
                return 1;
            }
            else if(n%2 == 1){
                    return n+oddSum(n-1);
                }
            
                return oddSum(n-1);
            }
    public int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10+sumOfDigits(n/10);
        }
    }
}


