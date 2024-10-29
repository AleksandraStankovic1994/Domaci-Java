package Domaci8;

import java.util.ArrayList;

public class Pisac {
    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga1> listaknjiga;

    public Pisac (String ime, int godinaRodjenja, ArrayList<Knjiga1> listaknjiga){
        this.ime=ime;
        this.godinaRodjenja=godinaRodjenja;
        this.listaknjiga=listaknjiga;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String novoIme) {
        this.ime = novoIme;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int novaGodinaRodjenja) {
        this.godinaRodjenja = novaGodinaRodjenja;
    }

    public ArrayList<Knjiga1> getListaknjiga() {
        return listaknjiga;
    }
    public void setListaknjiga(ArrayList<Knjiga1> novaListaknjiga) {
        this.listaknjiga = novaListaknjiga;
    }

    @Override
    public String toString() {
        return "Pisac{" + "ime='" + ime + ", godinaRodjenja=" + godinaRodjenja + ", listaknjiga=" + listaknjiga + '}';
    }

    public Knjiga1 najpoznatijaKnjiga (String najpoznatijaKnjiga, boolean najveciBrojstrana){
        Knjiga1 najveca = listaknjiga.get(0);

        for (Knjiga1 knjiga : listaknjiga) {
            if (knjiga.getBrojStrana() > najveca.getBrojStrana()) {
                najveca = knjiga;
            }
} return najveca;
    }
    public int vremePisanja(int razlika){

        Knjiga1 min = listaknjiga.get(0);
        Knjiga1 max = listaknjiga.get(0);

        for (Knjiga1 knjiga : listaknjiga) {
            if (knjiga.getGodinaIzdanja()>max.getGodinaIzdanja()){
                max=knjiga;
            }
            if (knjiga.getGodinaIzdanja()< min.getGodinaIzdanja())
                min=knjiga;
        }
        return max.getGodinaIzdanja() - min.getGodinaIzdanja();
    }
}
