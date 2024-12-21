package JAVA.BSIn2D;
import java.util.Arrays;
public class SortedMatrixMethod2 {
     public static void main(String[] args) {
        int[][] arr = {
                { 1,   2,   3,    4 },
                { 5,   6,   7,    8 },
                { 9,  10,  11,   12 },
                { 13, 14,  15,   16 } };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr[0].length - 1;

        while (r <arr.length &&  c >= 0 ) {
            if(target==arr[r][c]){
                return new int[]{r,c};
            }
            else if(target<arr[r][c]){   //i made this yeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee it is diff from kunal ones since it has O(n) not O(logn)
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }

}
