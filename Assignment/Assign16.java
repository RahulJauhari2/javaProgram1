public class Assign16 {
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        int[] a ={1,2,3,6,5};

        //obj.bubbleSort(a);
        obj.mbubbleSort(a);
        //obj.selectionSort(a);
        //obj.insertionSort(a);
        for(int i =0 ; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
class Sorting{
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void mbubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean count = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    System.out.println("Swapping "+arr[j]+" with "+arr[j+1]);
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("After Swapping "+arr[j]+" with "+arr[j+1]);
                    count = true;
                }
            }
            if(!count){
                System.out.println("Array is all ready sorted");
                break;
            }
        }
    }
    public void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void insertionSort(int[] arr){
        for(int i =1 ; i<arr.length;i++){
            int temp = arr[i];
            for(int j = i-1; j>=0 && arr[j]>temp;j--){
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
            
        }
    }
}
