/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

Solution: #########
*/

public class Problem005 {
    
    private static final int MAX = 20;
    
    public static void main(String[] args){
        long ending = MathUtil.factorial((long) MAX);
        long answer = ending;
        for (int i=MAX; answer==ending; i+=2){
            boolean flag = false;
            for (int j=1; j<MAX && !flag; j++){
                flag = (!(i % j == 0));
            }
            if (!flag){
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
