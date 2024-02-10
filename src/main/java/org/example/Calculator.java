package org.example;

public class Calculator {
    int sum1;
    int sum2;
    int getSum;
    double FirstType;
    double SecondType;
    boolean compare;


    public void addition( int getSum ) { System.out.println( "Sum of two numbers - " + getSum );
    }
    public void isGreater (double FirstType, double SecondType) {
        boolean compare = FirstType > SecondType;

       // if (compare == true)

        System.out.println("Compare of two numbers - " + compare);
    }

}
