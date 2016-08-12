package com.jinli.Code;


public class PrimeFactors {

    public String pirmeFactorsTest(int num) {
        StringBuffer primeFactorBuff = new StringBuffer();
        String primeFactors = null;
        //todo
        for (int index = 2; index < num; index ++) {
            if (!isPrime(index)) {
                continue;
            }

            while (num % index == 0) {
                primeFactorBuff.append(index+",");
                break;
            }
        }

        primeFactors = primeFactorBuff.toString().substring(0, primeFactorBuff.length()-1);
        return primeFactors;
    }


    public boolean isPrime(int num){
        for (int index = 2; index < num; index++) {
            if (num % index == 0) {
                return false;

            }
        }
        return true;
    }
}
