public class functionOverloading {                                 //function overloading


    public static void main(String[] args) {
        name("manglam");
        name(24);
        
    }


    static void name(String naam){
        System.out.println(naam);
    }
    
    static void name(int a){
        System.out.println(a);
    
    }
}
