package Domaci7;

public class menjacnica {
    public static void main(String[] args) {
        Valuta v= new Valuta("dolar","$",0.01);
        double konvrtovano = v.konvertujUdinare(100);
        System.out.println(konvrtovano);
    }
}
