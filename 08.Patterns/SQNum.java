public class SQNum {
    public static void main(String[] args) {
        /*
        print the pattern

         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4 



         */
        int n=4;
           n=2*n;
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            int eachindex=4-Math.min(Math.min(i,j),Math.min(n-i,n-j));
            System.out.print(eachindex+" ");
        }
    
       System.out.println();
    }
}
}
