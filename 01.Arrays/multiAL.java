import java.util.ArrayList;
import java.util.Scanner;
public class multiAL {
    public static void main(String[] args) {                              //making 2D arrayList
    Scanner sc= new Scanner(System.in);

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    System.out.println("Enter the elements of ArrayList");

    //initialisation
    for(int i=0; i<3;i++){    //here mentioning size doesnt matter it will create dyn
    list.add(new ArrayList<>());
    }

        //add elements
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            list.get(i).add(sc.nextInt());
           }
          }
          System.out.println();

    //print/display
    for(int k=0;k<3;k++){
        System.out.println(list.get(k));
    } 
        //OR can be printed as.................................
        System.out.println();

        System.out.println(list);
    
}
}
