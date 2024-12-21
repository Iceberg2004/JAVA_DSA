public class ceiling {
    public static void main(String[] args) {
        //ceiling of given number ? means find the smallest number which is greater than or equal to the target

        //if sorted array is given then first try binary search then brainstrom yourself for some other solution
         int [] arr={2,3,5,9,14,16,18};
         int target=17;
         int ans=BinarySearch(arr, target);
         System.out.println(ans);
        

        
    }
    static int BinarySearch(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;                           ///////same as binary bas return -1 ki jagah return start

            if(target<arr[mid]){
                end=mid-1;

            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }

        }
            return start;
    }
}
