package com.jinli.Test;


import com.jinli.Code.PrimeFactors;
import org.junit.Assert;
import org.junit.Test;

public class TestPrimeFactors {
    @Test
    public void testPrimeFactors(){
        PrimeFactors primeFactors = new PrimeFactors();
        Assert.assertEquals("2,3,5",primeFactors.pirmeFactorsTest(30));
    }
}
