public class leetcodeQ1 {

  public static void main(String[] args) {     //que-> number of integers given in an array,find the number of even digits number in it.
    
   // que->  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1446465446/
    int [] arr={12,345,4,6,4567};
    System.out.println(findNumbers(arr));

  }
 //     methods/functions   

  static int findNumbers(int [] arr){
    int count=0;
    for(int num : arr  ){
      if( even(num)){
        count++;

      }
    }
     return count;
    }
    static boolean even(int num){
      int numOfDig=digits(num);
      if(numOfDig % 2 == 0){
        return true;
      }
      return false;


    }
    static int digits(int num){
      int count=0;
      while(num>0){
        count++;
        num/=10;

      }
      return count;

  }
}

