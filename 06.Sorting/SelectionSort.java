import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 45, 7, 14, 11, 9 };
        System.out.println(Arrays.toString(Selection(arr)));
    }

    static int[] Selection(int[] arr) {
        int max = arr[0];
        int a=5;
        int size=arr.length;
        for (int j = 0; j < arr.length-2; j++) {
            int count=0;
            for (int i = 0; i < size; i++) {  //  finding max element
                if (max < arr[i]) {
                    max = arr[i];
                     count=i;
                }
            }

                int temp = arr[a];
                arr[a] = arr[count];
                arr[count]=temp;
                a--;
                size--;
                max=0;
            
        }
        return arr;
    }
}
