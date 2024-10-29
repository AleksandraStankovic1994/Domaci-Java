package Domaci5;

public class Zadatak2 {
    /*2. Napisati program koji trazi od korisnika da unese niz celih brojeva
   i vraca maksimalni element u nizu
    */
    public static void main(String[] args) {
        int niz[] = {1, 2, 3, 4, 5, 6, 7, 100, 9, 10};
        int max = niz[0];
        for (int i = 0; i < niz.length; i++) {
            int vrednost = niz[i]; // vadim loptu iz kutije
            if(vrednost> max) {
                max=vrednost;
            }
        }
        System.out.println("Maksimalni element u nizu je" + max);
    }
}
