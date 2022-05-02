package com.euodoo.advancejava;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO print 'hello advance'
        System.out.println("hello advance");

        // TODO print all car objects
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Red","Mitsubishi"));
        cars.add(new Car("Blue","BMW"));
        cars.add(new Car("gray", "Subaru"));
        for (Car car: cars) {
            System.out.println(car.getName());
        }


    }
}
