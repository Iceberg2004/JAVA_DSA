import java.util.Arrays;

public class lcq5 {
    public static void main(String[] args) {
        // leetcode-> 442
        //find all duplicates in the array from 1 to N
        int [] arr={1,2,2,4};
        System.out.println(findErrorNums(arr));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {                  //          ans is correct but giving address as output:(
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    
}
