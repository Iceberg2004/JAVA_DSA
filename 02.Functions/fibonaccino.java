import java.util.Scanner;
public class fibonaccino{
    public static void main(String args []){
        int a =0;
        int b=1;
        int c=a +b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");            //fibonacci number series
        int n=sc.nextInt();
        System.out.print(a+" "+b+" "+c+" ");

        for(int i=0;i<n;i++){

            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");

         }

    }
}