import java.util.Scanner;

public class maxno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();                                        //largest of 3 numbers

        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max > c) {
            System.out.println("b is the largest number");

        } 
        else {
            System.out.println("c is the largest number");

        }

    }
}