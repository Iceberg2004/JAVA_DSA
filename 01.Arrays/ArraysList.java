import java.util.ArrayList;
 
public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(10); //arraylist program
        list.add(54);
        list.add(65);
        list.add(24);
        list.add(67);                                                //here capacity is 10 but it doesnt matter since its creating dyanamically
        list.add(65);
        list.add(89);
        list.add(43);
        list.add(86);
        list.add(21);
        list.add(32);
        list.add(34);
        list.add(65);
        list.add(56);
        list.add(923);
        list.add(925);
        list.add(92);
        list.add(92);
        list.add(92);
        list.add(925);
        list.add(922);
        list.add(945);
        list.add(92);
        list.add(92);
        list.add(92);
        list.add(92);
        list.add(92);
 
        System.out.println(list);
        System.out.println(list.contains(777));   //checks if arraylist contains 777 number in it,if yes then prints true
        list.set(0,444);    //changing 0th index to 444 from 54
        System.out.println(list);
        list.remove(2);     //removes 2nd index from arraylist
        System.out.println(list);



    }
}
