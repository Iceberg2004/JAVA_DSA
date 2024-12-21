import java.util.Arrays;
public class varargys {                                                  //Variable arguments

    public static void main(String[] args) {


        variableArguments(10,20,30);



        
    }

    static void variableArguments(int...v){
        System.out.println(Arrays.toString(v));
    }

    
}
