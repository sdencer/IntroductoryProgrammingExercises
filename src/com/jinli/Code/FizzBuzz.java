package com.jinli.Code;


public class FizzBuzz {
    //todo
    private final int  div1 = 3;
    int div2 = 5;
    String fizz = "Fizz";
    String buzz = "Buzz";

    public String fizzBuzzTest(int num){
        StringBuffer fizzBuzzBuffer = new StringBuffer();
        for (int index = 1; index <= num; index ++) {
            if (index % div1 == 0 && index % div2 == 0) {
                fizzBuzzBuffer.append(fizz + buzz + "\n");
            } else if (index % div1 == 0) {
                fizzBuzzBuffer.append(fizz+"\n");
            } else if (index % div2 == 0) {
                fizzBuzzBuffer.append(buzz+"\n");
            } else {
                fizzBuzzBuffer.append(index+"\n");
            }
        }
        return fizzBuzzBuffer.toString();
    }
}
