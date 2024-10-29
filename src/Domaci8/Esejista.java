package Domaci8;

import java.util.ArrayList;

public class Esejista extends Pisac{
    public Esejista(String ime, int godinaRodjenja, ArrayList<Knjiga1> listaknjiga) {
        super(ime, godinaRodjenja, listaknjiga);
    }

    @Override
    public String toString() {
        return "ime"+ getIme()+ "godina rodjenja je" +getGodinaRodjenja()+ "lista knjiga je"+ getListaknjiga();
    }
    public int kratkieseji (){
        int brojEseja=0;
        for (Knjiga1 K : getListaknjiga()) {
            if (K.getBrojStrana()<50) {
                brojEseja++;
            }
        }

        return brojEseja;
    }
}
