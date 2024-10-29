package Domaci2;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1). Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
Ako je ocena 5, slovna ocena je "Odlican".
Ako je ocena 4, slovna ocena je "Vrlo dobar".
Ako je ocena 3, slovna ocena je "Dobar".
Ako je ocena 2, slovna ocena je "Dovoljan".
Ako je ocena 1, slovna ocena je "Nedovoljan".
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi ocenu ucenika");
        int ocena = s.nextInt();
        String s1 = ("Odlican");
        String s2 = ("Vrlo dobar");
        String s3 = ("Dobar");
        String s4 = ("Dovoljan");
        String s5 = ("Nedovoljan");
        System.out.println("Ocena je");
        if (ocena == 5) {
            System.out.println("odlican");
        } else if (ocena == 4) {
            System.out.println("Vrlo dobar");
        } else if (ocena == 3) {
            System.out.println("Dobar");
        } else if (ocena == 2) {
            System.out.println("dovoljan");
        } else if (ocena == 1) {
            System.out.println("Nedovoljan");
        }

    }
}
