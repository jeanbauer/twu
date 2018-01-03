/* Write a method generate(int n) that given an integer N will return a list of integers
such that the numbers are the factors of N and are arranged in increasing numerical order.
For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5. */

import java.util.ArrayList;
import java.util.List;

public class Prime_Factors {
    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        List<Integer> factors = generate(30);
        int listLength = factors.size();

        for (int i=0; i < listLength; i++) {
            System.out.print(factors.get(i));
            System.out.print(i + 1  == listLength ? "" : ",");
        }
    }
}
