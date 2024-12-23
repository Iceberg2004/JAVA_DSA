public class SB {
    public static void main(String[] args) {

        String series ="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series = series + ch +" ";      // its immuatble,every time its create a new object to store the data 
        }
        System.out.println(series);

        System.out.println();

        StringBuilder string = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            string.append(ch+" ");                       //it creates a single object and alter the data in it,it is mutable
        }
        System.out.println(string.toString());
        string.reverse();
        System.out.println(string.toString());
    }
    
}
