import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class lcq4 {
    public static void main(String[] args) {
        // leetcode-> 442
        //find all duplicates in the array from 1 to N
        int [] arr={ 4,3,2,7,8,2,3,1 };
        System.out.println(Csort(arr));
    }
    static List<Integer> Csort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
    //   Collections.sort(ans);        //sorting a List *******************************
        return ans;
    }

    static void swap(int [] arr ,int i,int correct){
         int temp=arr[correct];
         arr[correct]=arr[i];
         arr[i]=temp;
    }
    
    
}
