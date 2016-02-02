/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

Solution: ############
*/

public class Problem010{

    private static final long MAX = 2000000;
    
    public static void main(String[] args){
        long sum = 2L;
        for (long i=3L; i<MAX; i+=2){
            if (MathUtil.isPrimeNumber(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
