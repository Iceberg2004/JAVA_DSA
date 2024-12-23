import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        System.out.println("hello");
       String name="Manglam Panse";
       System.out.println(name);

       // FORMATTING OF A STRING

       float a=12.234435f;
       System.out.printf("the formatted number is %.3f",a); //printf is taken instead of println
       System.out.println();
       System.out.printf("the formatted number is%.3f",Math.PI);
       System.out.println();
       System.out.printf("my name is %s and I am %s ","Manglam","stud");
       System.out.println();
       // CONCATENATION OF STRINGS
       System.out.println("Manglam" + new ArrayList<>());
       System.out.println("Manglam" + new Integer(56));
       // System.out.println(new Integer(56) + ArrayList<>());     koi bhi ek string hona chahiye isko work krne ke liye 
      System.out.println(new Integer(56) + " " +new ArrayList<>());
    }
}
