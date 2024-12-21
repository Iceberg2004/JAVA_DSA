
public class LS {
    public static void main(String[] args) {                                    //key search in array
        
        int[] arr ={17,43,268,70,39,957,672,93,25,26,45,65,76,92};
        int target=99;
        System.out.println(LinearSearch(arr, target));


   }
   
    static int LinearSearch(int arr[],int target){
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(target==element){
                return index;
            }
                 
        }
        return -1;                                                          //    if element is not found then it will return -1
    }



    
}

