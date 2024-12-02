public class Twosum {
    public static void main(String[]args){
        int [] nums={2,7,11,15};
        int [] x= new int[2];
        int target =18,i=0 ,j=0;
        boolean flag = false;
        for( i=0;i < nums.length;i++){
            for( j=i+1 ; j<nums.length;j++){
                if(nums[i] + nums[j]== target){
                   x[0]=nums[i];
                   x[1]=nums[j];
                   flag = true;
                   break;
                }
            }
            if (flag) {
                break;
            }
        }       if(flag){

        
                    System.out.println("Found at "+x[0] +"," +x[1]);
        }
                else{
                    System.out.println("Not found");
                }
            }
}
