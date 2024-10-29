package Domaci5;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        // 3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.//
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj");
        double broj = s.nextDouble();
        double kvadrat = Izracunajkvadrat(broj);
        double koren = IspisivanjeKor(broj);
        System.out.println("Kvadrat je" + broj + "je" + kvadrat);
        System.out.println("Kvadratni koren " + broj + "je" + koren);
    }

    public static double Izracunajkvadrat(double broj) {
        return Math.pow(broj, 2);
    }

    public static double IspisivanjeKor(double broj) {
        double koren = Math.sqrt(broj);
        return koren;
    }
}
