package Domaci3;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
       2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
da je drugi broj jednak nuli.
         */
        Scanner scanner = new Scanner(System.in);
        double prviBroj;
        double drugiBroj;
        while (true) {
            System.out.print("Unesite prvi broj");
            prviBroj = scanner.nextDouble();
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite drugi broj: ");
            drugiBroj = scanner.nextDouble();
            if (drugiBroj != 0) {
                double rezultat = prviBroj / drugiBroj;
                System.out.println("Rezultat deljenja je" + rezultat);
                break;
            } else {
                System.out.println("Drugi broj ne sme biti nula. Kraj petlje");
            }
        }
    }
}
