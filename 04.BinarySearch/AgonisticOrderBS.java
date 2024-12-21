public class AgonisticOrderBS {
    
    public static void main(String[] args) {
        
        int [] arr={93,87,65,54,43,31,22};              //order agonistic binary search
        int item=22;
     int ans=BinaryS(arr,item,isAsc(arr));
     System.out.println("the ans is at index : "+ans);
    
        

    }
    static boolean isAsc(int arr []){
        if(arr[0]<arr[arr.length-1]){
            return true;
        }
        return false;
    }
    static int BinaryS(int arr [], int item, boolean isAsc){
            int start=0;
            int end=arr.length-1;
            
    
            while(start<=end){
    
                int mid=(start+end)/2;
    
                if(arr[mid]==item){
                    return mid;
                }

                if(isAsc){
                if(item>arr[mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
             }

                else{
                    if(item<arr[mid]){
                        start=mid+1;
                    }
                    else {
                        end=mid-1;
                    }
                }
           
            
        }
            
            
            


        return -1;
     }
        
    }

