/*
Name    : Mazharul Islam Tohin
ID      : 2012020190
Section : 5(D)
Email   : cse_2012020190@lus.ac.bd
Date    : 15-10-2021
 */
package MazharulIslamTohin;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter a Number : ");
        a = input.nextInt();
        MyCalculator ad= new MyCalculator();
        ad.divisorSum(a);
        ad.findFactorial(a);
    }
}
