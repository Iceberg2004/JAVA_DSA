

import java.util.Arrays;

public class CyclicSort {
 static void main(String[] args) {
        int [] arr = { 4,3,2,7,8,2,3,1 };
        System.out.println(Arrays.toString(Csort(arr))); // cyclic sort is used when sorting asked for-> '1 to N-1
                                                         
    }

    static int[] Csort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int [] arr ,int i,int correct){
         int temp=arr[correct];
         arr[correct]=arr[i];
         arr[i]=temp;
    }
}
