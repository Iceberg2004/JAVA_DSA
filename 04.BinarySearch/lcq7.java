public class lcq7 {
    public static void main(String[] args) {
        //que->find the rotation count or no of times the array is rotated
        
        int [] arr={1,2,3,4,5};
        int newEnd = findPivot(arr);

       // System.out.print("No of rotations are : "+NoOfRotations(arr, newEnd));

       //this is alternative mthod for displaying ans 
       //using loop is a conventional or laymen technique
        System.out.println(newEnd+1);
    }
    //this is not for dupicate values

     static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    //the ans is always mid/pivot + 1 so there is no need for loop 
    static int NoOfRotations(int [] arr,int newEnd){
        int count=0;
        for(int i=0;i<=newEnd;i++){
            count++;
        }
        return count;
    }
    
}

