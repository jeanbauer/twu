package com.twu.biblioteca;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FizzBuzzWriterTest {

    @Test
    public void printFizzWhenNumberIsThree() throws Exception {
        FizzBuzzWriter fizzBuzzWriter = new FizzBuzzWriter();
        assertEquals("Fizz", fizzBuzzWriter.calculateFizzBuzz(3));
    }

    @Test
    public void printBuzzWhenNumberIsFive() throws Exception {
        FizzBuzzWriter fizzBuzzWriter = new FizzBuzzWriter();
        assertEquals("Buzz", fizzBuzzWriter.calculateFizzBuzz(5));
    }

    @Test
    public void printFizzBuzzWhenNumberIsDivThreeAndFive() throws Exception {
        FizzBuzzWriter fizzBuzzWriter = new FizzBuzzWriter();
        assertEquals("FizzBuzz", fizzBuzzWriter.calculateFizzBuzz(15));
    }

    @Test
    public void printNumber() throws Exception {
        FizzBuzzWriter fizzBuzzWriter = new FizzBuzzWriter();
        assertEquals("1", fizzBuzzWriter.calculateFizzBuzz(1));
    }
}
