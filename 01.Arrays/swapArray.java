import java.util.*;
public class swapArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));                       //swapping two numbers in an array

        //Swapping of two number without third vairable
        int a=20;
        int b=30;
        a=a+b;  // a=50
        b=a-b; // b=20
        a=a-b; //a=30
        System.out.println("a and b after swapping are : "+a+" and " +b);
        
    }

    static void swap(int [] arr,int index1,int index2 ){

        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}