/*

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

Solution: ########
*/

public class Problem009{
    
    private static final long SUM = 1000;  //Given in problem
    
    public static void main(String[] args){
        System.out.println(getAnswer());
    }
    
    /**
     * Chose to use a method so that I could use
     * return to exit the loop early.
     * @return the answer to Problem 9, negative one (-1) if there is no valid answer.
     */
    public static long getAnswer(){
        for (long c=0; c<SUM; c++){
            for (long b=0; b<c; b++){
                long a = SUM - (b + c);
                if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
                    return a * b * c;
                }
            }
        } return (-1L);
    }
}
