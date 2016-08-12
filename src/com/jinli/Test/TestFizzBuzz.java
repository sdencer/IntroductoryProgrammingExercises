package com.jinli.Test;

import com.jinli.Code.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {
    @Test
    public void testFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String exceptResult = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n";
        Assert.assertEquals(exceptResult, fizzBuzz.fizzBuzzTest(15));

    }
}
