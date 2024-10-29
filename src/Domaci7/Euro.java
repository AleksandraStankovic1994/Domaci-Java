package Domaci7;

public class Euro extends Valuta{
    public Euro (String naziv, String simbol, int kurs) {
        super(naziv, simbol, kurs);

    }
    public void postaviNovikurs(double noviKurs){
        this.setKurs(noviKurs);
    }
}
