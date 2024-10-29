package Domaci7;

public class Dolar extends Valuta{
    public Dolar(String naziv, String simbol, int kurs) {
        super(naziv, simbol, kurs);
    }
    public void postaviNovikurs(double noviKurs){
        this.setKurs(noviKurs);
    }
}
