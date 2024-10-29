package Domaci9;

import java.util.ArrayList;

public class Kosarkaskiklub extends Klub {


    public Kosarkaskiklub(String naziv, String grad, ArrayList<Igrac> listaigraca) {
        super(naziv, grad, listaigraca);
    }

    @Override
    public int vrednostTima() {
        int suma=0;
        for (Igrac i:getListaigraca()) {
            suma+=i.getBrojPoena()*50;
        }
        return suma;
    }
    public String sampionTima (){
        String imeSampiona="";
        for (Igrac i: getListaigraca()){
            if (i.getBrojPoena()>1000) {
                imeSampiona=i.getIme();
            }
        }
        return imeSampiona;
    }




    /*
    Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
     */
}
