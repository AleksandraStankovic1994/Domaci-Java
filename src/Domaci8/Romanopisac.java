package Domaci8;

import java.util.ArrayList;

public class Romanopisac extends Pisac{
    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga1> listaknjiga) {
        super(ime, godinaRodjenja, listaknjiga);
    }

    @Override
    public String toString() {
        return "ime"+getIme()+ "godina rodjenja"+ getGodinaRodjenja()+ "lista knjiga"+ getListaknjiga();
    }

    public int dugometrazniRoman(){
        int dugometrazniRoman=0;
        for (Knjiga1 K : getListaknjiga()) {
            if (K.getBrojStrana()<500) {
                dugometrazniRoman++;
            }
        }
        return dugometrazniRoman;
    }
}
