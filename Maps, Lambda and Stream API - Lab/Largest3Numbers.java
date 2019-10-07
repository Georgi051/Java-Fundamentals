package Lecutre7AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((a,b)-> b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList())
                .forEach(e -> System.out.print(e + " "));
    }
}
