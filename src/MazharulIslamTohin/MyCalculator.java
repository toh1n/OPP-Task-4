/*
Name    : Mazharul Islam Tohin
ID      : 2012020190
Section : 5(D)
Email   : cse_2012020190@lus.ac.bd
Date    : 15-10-2021
 */

package MazharulIslamTohin;
import java.math.BigInteger;

public class MyCalculator implements  AdvancedArithmatic{

    @Override
    public void divisorSum(int n) {
        int result = 0 , i,res;
        for(i=2; i<= Math.sqrt(n);i++){
            if (n % i == 0){
                if (i == (n / i)){
                    result += i;
                }
                else {
                    result += (i + n/i);
                }
            }
        }
        res = result+1;
        System.out.println("Divisor Sum : "+res);
    }

    @Override
    public void findFactorial(int n) {

        BigInteger f = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        System.out.println("Factorial : "+f);

    }
}
