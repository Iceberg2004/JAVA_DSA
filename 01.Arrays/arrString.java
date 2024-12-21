
import java.util.Scanner;

public class arrString {
    public static void main(String[] args) {          //arrays for string
        
        Scanner sc= new Scanner(System.in);
        String [] arr= new String[5];


        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();

        }
        
        for(String  a :arr){                       //enhanced loop
            System.out.println(a);
        }

    }
    
}
