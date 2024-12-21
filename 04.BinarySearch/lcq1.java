public class lcq1 {
    public static void main(String[] args) {
            //que-> https://leetcode.com/problems/find-smallest-letter-greater-than-target/

            char [] arr={'a','b','c','d','e'};
            char target='z';
            int ans=BinarySearch(arr, target);
            System.out.println(ans);
            
    
            
        }
        static int BinarySearch(char [] arr,char target){   
            int start=0;
            int end=arr.length-1;
            
            while(start<=end){
                int mid=start+(end-start)/2;                 
    
                if(target<arr[mid]){
                    end=mid-1;
    
                }
                else {
                    start=mid+1;
                }
                
    
            }
                return arr[start % arr.length];
        }
    }
    
    
    

