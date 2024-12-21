

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr= {2,45,7,14,11,9};
        System.out.println(Arrays.toString(Bubblesort(arr)));
    }
    static int[] Bubblesort(int [] arr){
        int b=arr.length;

        for(int k=0;k<arr.length-1;k++){   //    repeating for n-1 times
            b--;
            int bubble=arr[0];

            for(int i=0; i<b;i++){
                if(bubble>arr[i+1] ){      //      swapping of values
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else{
                    bubble=arr[i+1];         //  bubble pass
                }
            }
        }
        
        return arr;
    }
}
