package Domaci3;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
         */
        Scanner s = new Scanner(System.in);
        String pravaLozinka = "dete123";
        String lozinka;
        do {
            System.out.print("Unesite lozinku");
            lozinka = s.nextLine();
        }while(!lozinka.equalsIgnoreCase(pravaLozinka));

        System.out.println("Uneta je ispravna lozinka");{
        }
    }
}
