package org.example;

public class Calculator1Model {
    public static void main(String[] args)
    {
        Calculator Calculator1Model = new Calculator();

        Calculator1Model.sum1 = 10;
        Calculator1Model.sum2 = 3;

        Calculator1Model.getSum = Calculator1Model.sum1 + Calculator1Model.sum2;

        Calculator1Model.FirstType = 7.2;
        Calculator1Model.SecondType = 7.5;

        Calculator1Model.compare = Calculator1Model.FirstType == Calculator1Model.SecondType;


        Calculator1Model.addition (Calculator1Model.getSum);
        Calculator1Model.isGreater(Calculator1Model.FirstType, Calculator1Model.SecondType);
    }
}
