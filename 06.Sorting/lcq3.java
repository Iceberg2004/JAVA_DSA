public class lcq3 {
    public static void main(String[] args) {
        //que->  https://leetcode.com/problems/find-the-duplicate-number/description/

        int [] arr = {3,3,3,3,3};   //find the duplicate element in the given array
        System.out.println(Csort(arr));
    }
    
    static int Csort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr[arr.length-1];
    }

    static void swap(int [] arr ,int i,int correct){
         int temp=arr[correct];
         arr[correct]=arr[i];
         arr[i]=temp;
    }
    

}
