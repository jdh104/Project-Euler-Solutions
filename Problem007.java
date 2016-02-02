
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10,001st prime number?

Solution: ######
*/
public class Problem007{

    private static final int NUMBER = 10001;
    
    public static void main(String[] args){
        long primes = 1;
        long i = 1;
        while (primes < 10001){
            i+=2;
            if (MathUtil.isPrimeNumber(i)){
                primes++;
            }
        }
        System.out.println(i);
    }
}
