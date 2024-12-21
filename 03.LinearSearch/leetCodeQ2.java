public class leetCodeQ2 {
    public static void main(String[] args) {



        // given bank acc of a person in 2d array(more than 2 acc for a single person),find the richest perosn in the given acc



        int [][] accounts={{1,2,3},{3,9,1}};
      int value=  maximumWealth(accounts);
      System.out.println(value);

        }

//              method/functions

        static int maximumWealth(int[][] accounts) {
            // person = rol
            // account = col
            int ans = Integer.MIN_VALUE;
            for (int[] ints : accounts) {
                // when you start a new row, take a new sum for that row
                int sum = 0;
                for (int anInt : ints) {
                    sum += anInt;
                }
                // now we have sum of accounts of person
                // check with overall ans
                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;
        }
    
}
