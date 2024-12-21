public class lcq8 {
    public static void main(String[] args) {
        // que-> https://leetcode.com/problems/split-array-largest-sum/description/
        int[] arr = { 7, 2, 5, 8,10};
        int m = 2;
        int start = Start(arr); // max value in array
        int end = End(arr); // sum of all values of array
        System.out.println(check(m, arr, start, end));

    }

    static int Start(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int End(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {               // solve the errorrrrrrrrr in this code(not perfect code)
            sum += arr[j];
        }
        return sum;
    }

    static int Pieces(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        int limit = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = 0;
            limit += arr[i];
            if (limit <= mid) {
                val = arr[i];
            } 
            else {
                count++;
                limit = arr[i];
                if (limit <= mid) {
                    val = arr[i];
                } else {
                    limit = 0;
                   
                }
            }

            if (i == arr.length - 1) {
                count++;
            }
        }
        return count;

    }

    static int check(int m, int[] arr, int start, int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;
            int p = Pieces(arr, start, end);

            if (p <= m) {
                end=mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}
