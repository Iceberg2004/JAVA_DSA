
public class swapping {                          //swapping of two numbers 


    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping a and b "+a+","+b);
        System.out.println(swap(a, b));
         
        
    }

    static int swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.print("After swapping a and b "+a+" ");
        return b;
        

    }












    
}
