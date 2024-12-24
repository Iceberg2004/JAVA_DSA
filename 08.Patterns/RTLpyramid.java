public class RTLpyramid {
    public static void main(String[] args) {
        
        /*  print this pattern
                   * 
                  **
                 ***
                ****
                        */
                    
                        for(int i=4;i>=1;i--){
                            for(int j=i-1;j>=1;j--){
                                System.out.print(" ");
                                
                            }
                           int k=i;
                            while (k<=4) {
                                System.out.print("*");
                                k++;
                            }
                           
                            System.out.println();
        }
    }
    
}
