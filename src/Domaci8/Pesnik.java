package Domaci8;

import java.util.ArrayList;

public class Pesnik extends Pisac{
    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga1> listaknjiga) {
        super(ime, godinaRodjenja, listaknjiga);
    }

    @Override
    public String toString() {
        return "ime" + getIme()+ "godina rodjenja je" + getGodinaRodjenja()+ "lista knjiga" + getListaknjiga();
    }
    public int kratkePesme (){
        int brojPesama=0;
        for (Knjiga1 K : getListaknjiga()) {
            if (K.getBrojStrana()<100) {
                brojPesama++;
            }
}return brojPesama;
}}
