package JavaLearning;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    static ArrayList<String> cars = new ArrayList<String>();

    private static void addCars(String carName){
        cars.add(carName);
    }

    private static ArrayList<String> getCars(){
        return cars;
    }

    public static void main(String[] args) {
        System.out.println("-----JavaArrayList");
        JavaArrayList.addCars("Nissan");
        JavaArrayList.addCars("Toyota");
        JavaArrayList.addCars("Chevrolet");
        JavaArrayList.addCars("BMW");
        JavaArrayList.addCars("Volvo");

        System.out.println(JavaArrayList.getCars()); //get all list
        System.out.println(JavaArrayList.cars.get(0)); // get index 0 from list
        System.out.println(JavaArrayList.cars.set(1, "Tesla")); //change value
        cars.remove(4); // Removes element
        System.out.println(cars.size()); //get list
        Collections.sort(cars);  // Sort cars

        System.out.println(JavaArrayList.getCars()); //get all list
        System.out.println("----- JavaArrayList END");
    }
}
