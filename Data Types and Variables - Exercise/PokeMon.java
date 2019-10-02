package Lacture2;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN  = Integer.parseInt(scanner.nextLine());
        int distaceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int pokedCount = 0;
        double half = pokePowerN / 2.0;

        while (pokePowerN >= distaceM){
            pokedCount++;
            pokePowerN -= distaceM;

            if (pokePowerN == half){
                if (exhaustionFactorY > 0){
                    pokePowerN /= exhaustionFactorY;
                }
            }
        }
        System.out.println(pokePowerN);
        System.out.println(pokedCount);


    }
}
