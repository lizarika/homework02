package org.example;

public class Car1Model {

    public static void main(String[] args) {

        Car Car1Model = new Car();
        Car1Model.model = "Model X";
        Car1Model.year = 1999;
        Car1Model.brand = "Brand X";

        System.out.println(Car1Model.model );
        System.out.println(Car1Model.year );
        System.out.println(Car1Model.brand );

        Car1Model.startEngine();
        Car1Model.stopEngine();
    }

}
