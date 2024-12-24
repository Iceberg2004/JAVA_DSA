public class Daimond {
    public static void main(String[] args) {

         /*  print this pattern
                    * 
                   * * 
                  * * * 
                 * * * * 
                * * * * * 
                 * * * * 
                  * * * 
                   * * 
                    *  

                        */


        for (int i = 5; i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" ");

            }
            int k = i;
            while (k <= 5) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");

            }
            int k = i;
            while (k >= 1) {
                System.out.print("* ");
                k--;
            }

            System.out.println();
        }

    }

}
