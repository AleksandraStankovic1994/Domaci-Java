package Domaci8;

public class Knjiga1 {
    private String naslov;
    private int brojStrana;
    private int godinaIzdanja;
    public Knjiga1 (String naslov, int brojStrana,int godinaIzdanja){
        this.naslov=naslov;
        this.brojStrana=brojStrana;
        this.godinaIzdanja=godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String novNaslov) {
        this.naslov = novNaslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int novBrojStrana) {
        this.brojStrana = novBrojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int novaGodinaIzdanja) {
        this.godinaIzdanja = novaGodinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga1{" + "naslov'" + naslov + ", brojStrana=" + brojStrana + ", godinaIzdanja=" + godinaIzdanja;};
}
