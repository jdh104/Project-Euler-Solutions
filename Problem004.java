
/*

A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

Solution: XYZZYX
*/

public class Problem004{

    private static final int DIGITS = 3;

    public static void main(String[] args){
        int max = (int) Math.pow(10,DIGITS) - 1;
        long answer = 0;
        for (int i=max; i>900; i--){
            for (int j=max; j>900; j--){
                if ((MathUtil.isPalendrome(((long) i) * ((long) j))) && ((((long) i) * ((long) j ))> answer)){
                    answer = (((long) i) * ((long) j));
                }
            }
        }
        System.out.println(answer);
    }
}
