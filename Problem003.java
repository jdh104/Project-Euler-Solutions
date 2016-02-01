/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

Solution: 6857
*/

public class Problem003{
    
    private static final long NUMBER = 600851475143
    
    public static void main(String[] args){
        long answer = 1;
        for (int i=3; i<=NUMBER i+=2){
            if (MathUtil.isPrimeNumber(i) && NUMBER % i == 0){
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
