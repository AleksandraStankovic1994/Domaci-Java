package Domaci9;

import java.util.ArrayList;

public class Fudblaskiklub extends Klub{
    public Fudblaskiklub(String naziv, String grad, ArrayList<Igrac> listaigraca) {
        super(naziv, grad, listaigraca);
    }

    @Override
    public int vrednostTima() {
        int suma=0;
        for (Igrac i:getListaigraca()) {
            suma+=i.getBrojPoena()*1000;
        }
        return suma;
    }
    public String najboljiStrelac() {
        String strelac = "";
        int brojGolova=0;
        for (Igrac i : getListaigraca()) {
            if (i.getBrojPoena()>brojGolova) {
                strelac = i.getIme();
                brojGolova=i.getBrojPoena();
            }

        }
            return strelac;
        }
    /*

Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).

     */
    }
