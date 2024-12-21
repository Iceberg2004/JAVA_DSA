import java.util.Scanner;
public class NOR{                                       //number of occurences/repetition of a number in a given number
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");           
        int n=sc.nextInt();

        System.out.println("Enter the number to search ");           
        int key=sc.nextInt();

        int count=0;
        int ans=digits(n);
        System.out.println("The number of digits is "+ans);

        
        for(int i=1;i<=ans;i++){
          
            if(n%10==key){
                count+=1;

            }
            n=n/10;

        }
               System.out.println("The number of occurunces is "+count);                                 
        
  }

       // function to calculate number of digits
         static int digits(int n){
            int sum=0;
             while(n>0){
        
         n=n/10;
          sum++;

        }
          return sum;

}

}

    

