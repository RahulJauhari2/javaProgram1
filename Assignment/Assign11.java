public class Assign11 {
    public static void main(String[] args) {
        
        Recurstion obj = new Recurstion();
        obj.num(1000);
        System.out.println("-----");
        obj.reverceNum(100000);
       // obj.evenNum(10);
       //obj.evenNumReverce(10);
         //obj.oddNumReverce(10);
         //obj.oddNum(10);
        //System.out.println(obj.num(5));
        
    }
    
}
class Recurstion{
    public int num(int n){
        
        if(n==0){
            return 0;
        }
        else{
            num(n-1);
            System.out.println(n);
            
            return 0;
        }
    }
    public int reverceNum(int n){
        if(n==0){
            return 0;
        }
        else{
        
            System.out.println(n);
            reverceNum(n-1);
            return 0;
        }
} 
    public int evenNum(int n){
        if(n==2){
            System.out.println(n);
            return 2;
        }
        else{
            evenNum(n-2);
            System.out.println(n);
            return 0;
        }
    }
    public void  evenNumReverce(int n){
        if(n==2){
            System.out.println(n);
            return ;
        }
        else if(n%2 == 0){
            System.out.println(n);
        }
        evenNumReverce(n-1);
        
    }
    public void  oddNum(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        oddNum(n-1);
         if(n % 2 == 1){
            System.out.println(n);
        }
        
    }
    public void  oddNumReverce(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        else if(n % 2 == 1){
            System.out.println(n);
        }
        oddNumReverce(n-1);
        
    }

}
cd 