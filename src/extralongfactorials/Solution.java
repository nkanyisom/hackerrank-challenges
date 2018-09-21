package extralongfactorials;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
The factorial of the integer n, written n!, is defined as:
n! = n X (n - 1) X (n -2) X … X 3 X 2 X 1
Calculate and print the factorial of a given integer.

For example, if n = 30, we calculate 30 X 29 X 28 X … X 2 X 1 and get 2652528599812191058626308480000000
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int factorial = input.nextInt();
        BigInteger product = BigInteger.valueOf(factorial);

        for (int i = (factorial - 1); i > 0; i--) {
            product = product.multiply((BigInteger.valueOf(i)));
        }

        System.out.println(product);
    }
}
