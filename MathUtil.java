

public class MathUtil{
    
    public static boolean isPrimeNumber(long operand){
        long limit = ((long) Math.floor(Math.sqrt((double) operand)));
        for (long i=2; i<=limit; i++){
            if (operand % i == 0){
                return false;
            }
        } return true;
    }
    
    public static long factorial(int operand){
        long answer = 1;
        for (int i=1; i<operand; i++){
            answer *= i;
        } return answer;
    }
}
