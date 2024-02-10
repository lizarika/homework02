package org.example;

public class NumberManipulator {

    public static void main(String[] args) {
        NumberManipulator manipulator = new NumberManipulator();
        int number = 5;

        System.out.println("Initial number: " + number);

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println( "Number after increment: " + incrementedNumber );

        int decrementedNumber = manipulator.decrementByOne(number);
        System.out.println( "Number after decrement: " + decrementedNumber );
    }

    public int incrementByOne(int number) {
        number++;

        return number;
    }

    public int decrementByOne(int number) {
        number -= 1;

        return number;
    }
}
