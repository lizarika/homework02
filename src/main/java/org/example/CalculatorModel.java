package org.example;

public class CalculatorModel {
    public static void main(String[] args)

    {
        Calculator calculatorModel = new Calculator();

        calculatorModel.sum1 = 10;
        calculatorModel.sum2 = 3;

        calculatorModel.firstType = 7.2;
        calculatorModel.secondType = 7.5;

        calculatorModel.getSum= calculatorModel.sum1 + calculatorModel.sum2;
        calculatorModel.addition (calculatorModel.getSum);

        calculatorModel.compare = calculatorModel.firstType == calculatorModel.secondType;
        calculatorModel.isGreater(calculatorModel.firstType, calculatorModel.secondType);
    }
}
