/*

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

Solution: ########
*/

public class Problem006{
    
    private static final int NUMBER = 100;
    
    public static void main(String[] args){
        long sumSquare = 0;
        long squareSum = 0;
        long sum = 0;
        for (int i=1; i<=NUMBER; i++){
            sumSquare += Math.pow(i,2);
        }
        for (int i=1; i<=NUMBER; i++){
            sum += i;
        }
        squareSum = (long) Math.pow(sum,2);
        long answer = squareSum - sumSquare;
        System.out.println(squareSum + " - " + sumSquare + " = " + answer);
    }
}
