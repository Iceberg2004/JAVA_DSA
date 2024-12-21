public class lcq2 {
    public static void main(String[] args) {

              //que->   https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


        int [] nums={5,7,7,7,7,8,8,10};
        int target=7;
        System.out.println(searchRange(nums, target));

    }
    //    methods
    static int[] searchRange(int [] nums, int target) {

      int[] ans = {-1, -1};
      
      int start=search(nums, target, true);
      int end=search(nums, target, false);                  //output wrong ,giving address instead of integer values

      ans[0]=start;
      ans[1]=end;
      return ans;
    }
    
    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
      int ans = -1;
      int start = 0;
      int end = nums.length - 1;
      while(start <= end) {
          // find the middle element
    //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
          int mid = start + (end - start) / 2;
    
          if (target < nums[mid]) {
              end = mid - 1;
          } else if (target > nums[mid]) {
              start = mid + 1;
          } else {
              // potential ans found
              ans = mid;
              if (findStartIndex == true) {
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          }
      }
      return ans;
    }




}










