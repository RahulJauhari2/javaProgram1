public class AssignSearch {
    public static void main(String[] args) {
        Search obj = new Search();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(obj.linearSearch(arr, 1));
        System.out.println(obj.binarySearch(arr, 1));
       
    }
    
}
class Search{
    public int linearSearch(int arr[],int search){
        for(int i=0; i < arr.length;i++){
            if(arr[i]== search){
                return ++i;
                
            }
        }
        return -1;
    }
    public int binarySearch(int arr[],int search){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==search){
                return ++mid;
            }
            else if(arr[mid]<search){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

}
