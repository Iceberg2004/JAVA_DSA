
import java.util.Scanner;
public class TwoDarray{
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);                              //2D arrays
        System.out.println("enter n");
        int n=sc.nextInt();
       
        int [][] arr= new int[n][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }  


        } 
}