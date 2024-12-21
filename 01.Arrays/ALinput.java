import java.util.ArrayList;
import java.util.Scanner;
public class ALinput {
    public static void main(String[] args) {
        
        //taking input in an arraylist and then displaying it

        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);
        System.out.println("Enter the elements of arraylist");

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());  //to take the input
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));   //to print/display the arraylist we cannot do ->arraylist(i) to print in arraylist
        }
    }
    
}
