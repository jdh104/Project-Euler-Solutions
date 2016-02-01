

public class MathUtil{
    
    public static boolean isPrimeNumber(long operand){
        long limit = ((long) Math.floor(Math.sqrt((double) operand)));
        for (long i=2; i<=limit; i++){
            if (operand % i == 0){
                return false;
            }
        } return true;
    }
    
    public static long factorial(long operand){
        long answer = 1L;
        for (int i=1; i<=operand; i++){
            answer *= i;
        } return answer;
    }
    
    public static long isPalendrome(long operand){
        String op = new Long(operand).toString();
        for (int i=0; i<op.length()/2; i++){
            if (op.charAt(i) != op.charAt(op.length()-i)){
                return false;
            }
        } return true;
    }
}
