package Lecutre6ObjectAndClasses.exersiceObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static class Vehicle {
        private String typeOfVehicle;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String typeVehicle, String model, String color, int horsePower) {
            this.typeOfVehicle = typeVehicle;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getTypeOfVehicle() {
            return Character.toTitleCase(this.typeOfVehicle.charAt(0))
                    + this.typeOfVehicle.substring(1);
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!"End".equals(command)) {
            String[] input = command.split("\\s+");
            String typeVehicle = input[0];
            String model = input[1];
            String color = input[2];
            int horsePower = Integer.parseInt(input[3]);

            Vehicle vehicle = new Vehicle(typeVehicle, model, color, horsePower);
            vehicleList.add(vehicle);


            command = scanner.nextLine();
        }
        command = scanner.nextLine();

        while (!"Close the Catalogue".equals(command)) {

            for (Vehicle vehicle : vehicleList) {
                if (command.equals(vehicle.getModel())) {
                    System.out.println(String.format("Type: %s%n" + "Model: %s%n" +
                                    "Color: %s%n" + "Horsepower: %d",
                            vehicle.getTypeOfVehicle(),
                            vehicle.getModel(),
                            vehicle.getColor(),
                            vehicle.getHorsePower()));
                    break;
                }
            }
            command = scanner.nextLine();
        }

        double averageCarHP = calculateHP(vehicleList, "Car");
        System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarHP);
        double averageTruckHP = calculateHP(vehicleList, "Truck");
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHP);

    }

    private static double calculateHP(List<Vehicle> vehicleList, String type) {
        int sum = 0;
        int count = 0;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getTypeOfVehicle().equalsIgnoreCase(type)) {
                sum += vehicle.getHorsePower();
                count++;
            }
        }
        double avgSum = 0;
        if (count != 0) {
            avgSum = sum / (count * 1.0);
        }
        return avgSum;
    }
}
