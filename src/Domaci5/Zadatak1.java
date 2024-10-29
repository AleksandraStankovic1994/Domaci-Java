package Domaci5;

public class Zadatak1 {
    /*
   1. Napisati program koji trazi od korisnika da unese niz celih brojeva
   i vraca sumu svih elemenata niza
    */
    public static void main(String[] args) {

        int niz[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        for (int i = 0; i <= niz.length; i++) {
            suma += i;
        }
        System.out.println("Suma je" + suma);

    }
}
