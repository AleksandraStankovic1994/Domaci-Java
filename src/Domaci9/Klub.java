package Domaci9;

import java.util.ArrayList;

public abstract class Klub {
    /*
    Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
    Napraviti metode:

         */
    private String naziv;
    private String grad;
    private ArrayList<Igrac> listaigraca;
    public Klub(String naziv, String grad, ArrayList<Igrac>listaigraca){
        this.naziv=naziv;
        this.grad=grad;
        this.listaigraca=listaigraca;
    }
     

    public String getNaziv(String listaigraca) {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getListaigraca() {
        return listaigraca;
    }


    public void setListaigraca(ArrayList<Igrac> listaigraca) {
        this.listaigraca = listaigraca;
    }
    @Override
    public String toString() {
        return "Klub{" + "naziv='" + naziv + '\'' + ", grad='" + grad + '\'' + ", listaigraca=" + listaigraca + ", i=";
    }
    public Igrac najiskusnijiIgrac(){
        Igrac najiskusniji=listaigraca.get(0);
        for (Igrac trenutniIgrac: listaigraca) {
            if (trenutniIgrac.getGodineIskustva()>najiskusniji.getGodineIskustva());{
               najiskusniji=trenutniIgrac;
            }
        }
        return najiskusniji;
    }
    public int ukupnoPoena(){
        int suma=0;
        for (Igrac trenutniIgrac:listaigraca){
            suma+= trenutniIgrac.getBrojPoena();
        }
        return suma;
    }

    public abstract int vrednostTima ();





}/*
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)
     */


