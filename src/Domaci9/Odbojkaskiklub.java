package Domaci9;

import java.util.ArrayList;

public class Odbojkaskiklub extends Klub {
    public Odbojkaskiklub(String naziv, String grad, ArrayList<Igrac> listaigraca) {
        super(naziv, grad, listaigraca);
    }

    @Override
    public int vrednostTima() {
        int suma = 0;
        for (Igrac i : getListaigraca()) {
            suma += i.getBrojPoena() * 100;
        }
        return suma;
    }

    public String odrambeniAs() {
        String as = "";
        int maxbrojpoena = 0;
        for (Igrac i : getListaigraca()) {
            if (i.getGodineIskustva() < 3 && i.getBrojPoena() > maxbrojpoena) {
                as = i.getIme();
                maxbrojpoena = i.getBrojPoena();
            }
        }
        return as;
   /*

Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen, za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol, dok za odbojkaski tim svaki igrac vredi 100 po poenu.
 Vrednost tima predstavlja sumu cena svih njegovih igraca (edited)
     */
    }
}


