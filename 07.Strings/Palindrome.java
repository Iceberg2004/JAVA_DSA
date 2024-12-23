public class Palindrome {
    public static void main(String[] args) {
        //palindrome is a word which is same from front and back like read from right to left and left to right fives us same data
        String str="";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        str=str.toLowerCase();
        if(str==null || str.length()==0){
            return true;
        }
        for(int i=0;i<str.length()/2;i++){
            
                char s=str.charAt(i);
                char e=str.charAt(str.length()-1-i);
            
                if(s!=e){
                    return false;
                }
        }
        return true;
    }
}
