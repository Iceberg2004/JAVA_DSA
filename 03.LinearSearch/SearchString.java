
public class SearchString { 
    public static void main(String[] args) {                                 //Searching character in a string
        
    
     String str = "Manglam";
     char target = 'k';
     System.out.println(search(str,target));


    }
    static boolean search(String str,char target){
        if (str.length() == 0) {
            return false;
            
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target){
                return true;
            }

        } 
        return false;
 


    }

    
}
