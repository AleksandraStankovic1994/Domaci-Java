package Domaci8;

import java.util.ArrayList;

public class Knjiga {
    public static void main(String[] args) {
        ArrayList<Knjiga1> listaknjiga = new ArrayList<>();
        listaknjiga.add(new Knjiga1("Hari Poter 1", 99, 1992));
        listaknjiga.add(new Knjiga1("Hari Poter 2", 199, 1993));
        listaknjiga.add(new Knjiga1("Hari Poter 3", 300, 1994));

        Pisac p = new Pisac("Marko", 1975, listaknjiga);
        System.out.println("Marko, 1975, objavio je zbirku  Sutra");
        int brojZbirki;

        int brojStrana = 80;
        int brojKnjiga;
        if (brojStrana < 100) {
            System.out.println("Imena knjiga su ");
        }
        int brojStrana1 = 0;
        {
            if (brojStrana1 < 50) {
                System.out.println("Broj knjiga je");
            }
            String dugometrazniRoman = "Izlazak sunca";
            if (brojStrana > 500) {
                System.out.println("Ime dugometraznog romana");
            }

        }

    }
}
