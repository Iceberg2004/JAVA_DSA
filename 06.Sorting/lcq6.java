public class lcq6 {
    public static void main(String[] args) {
        //que leetcode->41
        //first missing number
        int [] arr = {-1,1,2 };
        System.out.println(Csort(arr)); // cyclic sort is used when sorting asked from-> '1 to N-1';
                                                         
    }

    static int Csort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
              swap(arr, i , correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
          if (arr[index] != index+1) {
              return index+1;
          }
      }
        return arr.length +1;
    }

    static void swap(int [] arr ,int i,int correct){
         int temp=arr[correct];
         arr[correct]=arr[i];
         arr[i]=temp;
    }
   
}
