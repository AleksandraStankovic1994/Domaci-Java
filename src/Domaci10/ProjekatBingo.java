package Domaci10;

import java.util.Scanner;

public class ProjekatBingo {
    private static int OPSEG = 100;

    public static void main(String[] args) {
       /*
       Projekat:
Bingo Projekat
Napraviti program koji se sastoji od tri metode:
-unesiBrojeve() -> metoda vraca niz od 6 brojeva, to mogu biti brojevi
koji su odmah definisani, ubaceni preko skenera ili ubaceno preko Math.random().
Ovih 6 brojeva ce biti brojevi koji ce korisnik pogadjati.
-generisi() -> vraca nam niz od 30 nasumnicnih brojeva(nije bitno ako ima duplikata).
-bingo(int[] niz1,int[] niz2) -> prethodno dva izgenerisana niza proslednjujemo ovoj metodi i proveravamo
Koliko se nashi brojeva nalazi u izgenerisanom nizu, ispisati poruku ako korisnik pogodi bingo
        */
        Scanner s= new Scanner(System.in);
        System.out.print("Unesite broj od 1 - 100: ");
        int broj = s.nextInt();
        int[] bubanj = generisi();
        boolean pogodak = bingo(bubanj, broj);
        if (pogodak) {
            System.out.println("Cestitamo, broj koji ste uneli se nalazi u nizu");
        } else {
            System.out.println("niste pogodli");
        }
    }

    /**
     * Generise nasumicni niz od OPSEG nasumicnih brojeva, na 100 mesta
     * @return
     */
    private static int[] generisi() {

        int[] bubanjBrojeva = new int[100];
        for (int i = 0; i < bubanjBrojeva.length; i++) {
            int nasumicniBroj = (int) (Math.random() * OPSEG);
            bubanjBrojeva[i] = nasumicniBroj;
        }

        return bubanjBrojeva;
    }

    /**
     * omogucava proveru da li je moguci pogodak sadrzan u nizu
     * @param niz
     * @param moguciPogodak
     * @return
     */
    public static boolean bingo(int[] niz, int moguciPogodak) {

        boolean pogodak = false;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == moguciPogodak) {
                pogodak = true;
                break;
            }
        }
        return pogodak;
    }
}
