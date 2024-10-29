package Domaci5;

import java.util.Scanner;

public class Zadatak4 {
    private static final int i = 0;

    public static void main(String[] args) {
        //4. Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.///
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj ");
        int izracunatiFaktorijel = s.nextInt();
        int rezultat = izracunatiFaktorijel;
        if (rezultat != -1) {
            System.out.println("Faktorijel broja je" + rezultat);
        } else {
            System.out.println(" Faktorijel nije moguce izracunati za negativne brojeve");
        }
    }

    public static long izracunatiFaktorijel(int a) {
        if (a < 0) {
            return -1;
        }
        int faktorijel = 1;
        for (int i = 1; i <= a; i++) {
            faktorijel *= i;
        }
        return faktorijel;
    }

}
