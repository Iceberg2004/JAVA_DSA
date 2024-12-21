import java.util.Scanner;                                                  // cheack any number for armstrong number
public class ArmstrongNumber {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number to check if its armstrong or not");
        int n=sc.nextInt();   
        System.out.println(armNo(n));
    }

    static boolean armNo(int n){
        int original=n;
        int sum = 0;

        while(n>0){
           int rem=n%10;         //remainder
           rem=rem*rem*rem;
          
          sum+=rem;
           n=n/10;
        }
        return sum==original;       //this return statement works same as below if-else statement,its just enhanced form of it.
          /*  if(original==sum){
            return true;
           }
           else{
            return false;
           } */
        

    }  
}
