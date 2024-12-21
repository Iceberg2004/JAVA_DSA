public class BinarySearch01 {
    public static void main(String[] args) {
        int [] arr={1,3,5,6,7,8,9,12,14,16,17,34,35,67,89};              //binary search
        int target=14;
     int ans=BinaryS(arr,target);
     System.out.println("the ans is at index : "+ans);
    
        
    }
    static int BinaryS(int arr [], int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
             }
        }
        return -1;
    }
    
}
