public class lcq3 {
    public static void main(String[] args) {
        //infinite array question 
        //search target in an infinite array

        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=19;
        System.out.println(FindRange(arr, target));        
    }

        //methods/functions

    static int FindRange(int [] arr,int target){

        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=start+(end-start+1)*2;
            start=newStart;


        }
        return BinaryS(arr, target, start, end);
    }
    
    
    static int BinaryS(int arr [], int item,int start,int end){       

        while(start<=end){
            int mid=(start+end)/2;

            if(item>arr[mid]){
                start=mid+1;
            }
            else if(item<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;

            }

        }
        return -1;
    }
    


}
