package Lecture1;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceForRobe = Double.parseDouble(scanner.nextLine());
        double priceForBelt = Double.parseDouble(scanner.nextLine());

        double freebelt = studentCount - (studentCount / 6);

        double neededEquipment = 0;

        if (studentCount >= 6){
             neededEquipment  = priceLightsaber * (studentCount + Math.ceil(studentCount * 0.1)) +
                    priceForRobe * studentCount + priceForBelt * (freebelt);
        }else {
             neededEquipment  = priceLightsaber * (studentCount + Math.ceil(studentCount * 0.1)) +
                    priceForRobe * studentCount + priceForBelt * (studentCount );
        }

        if (neededEquipment <= amount){
            System.out.printf("The money is enough - it would cost %.2flv.",neededEquipment);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.",neededEquipment - amount);
        }
    }
}
