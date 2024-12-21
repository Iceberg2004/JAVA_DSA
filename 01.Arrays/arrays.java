import java.util.Scanner;

public  class arrays{
    public static void main(String[] args) {     //taking input and printing an array
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        
        int [] arr= new int [5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
          //enhanced for loop for printing an element where first we write datatype then any name (variable) then name of array followed by the statements in curly braces.see below...................

            for(int  a : arr){ 
            System.out.print(a+" ");
        }



    }
    
}
