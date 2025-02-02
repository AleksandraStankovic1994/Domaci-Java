package Domaci7;

public class Valuta {
    /*
    Domaci:
Definisati hijerarhiju klasa koje predstavljaju razlicite valute u menjacnici.
Osnovna Klasa: Valuta
promenljive: naziv , simbol, i kurs.
Konstruktor: Postavlja vrednosti za naziv, simbol i kurs valute.
Metoda: konvertujUdinare(iznos), koja konvertuje zadati iznos u dinare
 koristeci trenutni kurs valute.
Dolar:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.
Euro:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.
Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve, i
 vrsi konverziju odredjenih iznosa iz jedne valute u drugu
     */
    private String naziv;
    private String simbol;
    private double kurs; // kurs prema valuti dinar

    public Valuta(String naziv, String simbol, double kurs) {
        this.naziv=naziv;
        this.simbol=simbol;
        this.kurs=kurs;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String novNaziv) {
        this.naziv = novNaziv;
    }

    public String getSimbol() {
        return simbol;
    }
    public void setSimbol(String novSimbol) {
        this.simbol = novSimbol;
    }

    public double getKurs() {
        return kurs;
    }
    public void setKurs(double novKurs) {
        this.kurs = novKurs;
    }

    @Override
    public String toString() {
        return  "naziv" + naziv  + "simbol=" + simbol + "kurs=" + kurs;
    }

    public double konvertujUdinare (double iznos){
        return iznos * kurs;
    }
}
