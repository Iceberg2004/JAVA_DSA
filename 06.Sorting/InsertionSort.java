

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={3,2,7,44,6,32,89};
        System.out.println(Arrays.toString(Insertionsort(arr)));
    }

    static int[] Insertionsort(int [] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            
            for(int j= i+1 ; j>0 ;j--){
                if(arr[j]<arr[j-1]){  // swapping of values
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
         return arr;
    }
}
