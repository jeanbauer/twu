package com.twu.biblioteca;

public class FizzBuzzWriter {

    public static void main(String[] args) {
        FizzBuzzWriter fizzBuzzWriter = new FizzBuzzWriter();
        fizzBuzzWriter.FizzBuzz();
    }

    public String calculateFizzBuzz(int n) {
        if (n%3 == 0 && n%5 == 0) return "FizzBuzz";
        else if (n%3 == 0) return "Fizz";
        else if (n%5 == 0) return "Buzz";
        else return String.valueOf(n);
    }

    private void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(calculateFizzBuzz(i));
        }
    }
}
