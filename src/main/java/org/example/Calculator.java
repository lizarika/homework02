package org.example;

public class Calculator {
    int sum1;
    int sum2;
    int getSum;
    double firstType;
    double secondType;
    boolean compare;


    public void addition(int getSum)
    {
      //int getSum = sum1+sum2;
        System.out.println( "Sum of two numbers - " + getSum );


    }


    public void isGreater (double firstType, double secondType) {
        boolean compare = firstType > secondType;

       // if (compare == true)

        System.out.println("Compare of two numbers - " + compare);
    }

}
