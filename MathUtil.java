
/**
 * Basic toolkit for quickly checking properties of numbers.
 * 
 * @author Jonah Haney (http://github.com/jdh104/)
 * @version v1.0.1
 */
public class MathUtil{
    
    /**
     * Used to check if a number is prime.
     * This method takes as many shortcuts as it can to compute as quickly as possible.
     * @param operand the number to check.
     * @return true if operand is prime, false if operand is composite.
     */
    public static boolean isPrimeNumber(long operand){
        if (operand % 2 == 0){
            return false;
        } else {
            long limit = ((long) Math.floor(Math.sqrt((double) operand)));
            for (long i=3; i<=limit; i+=2){
                if (operand % i == 0){
                    return false;
                }
            } return true;
        }
    }
    
    /**
     * Used to calculate factorial of a number [f(x) = x!].
     * @param operand the number of which to calculate the factorial.
     * @return The factorial of operand.
     */
    public static long factorial(long operand){
        long answer = 1L;
        for (int i=1; i<=operand; i++){
            answer *= i;
        } return answer;
    }
    
    /**
     * Used to check if a number is a palendrome.
     * A number is a palendrome if it is the same in reverse order as itself. example: 1230321.
     * This method takes as many shortcuts as it can to compute as quickly as possible.
     * @param operand the number to check
     * @return true if operand is a palendrome, false if it is not.
     */
    public static long isPalendrome(long operand){
        String op = new Long(operand).toString();
        for (int i=0; i<op.length()/2; i++){
            if (op.charAt(i) != op.charAt(op.length()-i-1)){
                return false;
            }
        } return true;
    }
}
