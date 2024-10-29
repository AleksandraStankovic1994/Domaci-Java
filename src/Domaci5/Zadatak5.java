package Domaci5;

public class Zadatak5 {
    public static void main(String[] args) {
    /*1. Napisati program koji omogucava korisniku da unese niz celih brojeva.
        Program treba da ima sledeće metode:
        - Metoda za unos niza
                - Metoda za stampanje niza
                - Metoda za racunanje srednje vredsnoti brojeva u nizu
                - Metoda za sabiranje svih dvocifrenih brojeva
                - Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza
    */int niz []={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    srednjaVrednost(niz);
    stampajNiz(niz);
    razlikaBrojeva(niz);
    sabiranjeDvocifrenihBrojeva(niz);
        System.out.println("srednjaVrednost" + niz);
        System.out.println("srednjaVrednost" + niz);
        System.out.println("Razlika je" + niz);
        System.out.println("srednjaVrednost" + niz);
}
public static int[] stampajNiz(int[] niz) {
    for (int i=0; i< niz.length;i++);
    System.out.println("Niz brojeva je" + niz);
    return stampajNiz(niz);
}

private static double srednjaVrednost(int[] niz) {
    int suma=0;
    for (int i=0; i< niz.length;i++);
    int i = 0;
    if (niz.length>1 && niz.length< 10);
    suma=+i;
    return suma/ niz.length;
}

public static int sabiranjeDvocifrenihBrojeva(int niz[]) {
    int sabiranje = 0;
    int i=0;
    for (i = 0; i < niz.length; i++) ;
    if(i>=10 && i<=99);
    sabiranje +=i;
    return sabiranje;
}

public static int razlikaBrojeva(int []niz) {
    int minimalniBroj = niz[0];
    int maksimalniBroj = niz[0];
    for (int i = 0; i < niz.length; i++) ;
    int i=0;
    if ( i<minimalniBroj){
        minimalniBroj=i;}
    if (i>maksimalniBroj){
        maksimalniBroj=i;
        int razlika =maksimalniBroj-minimalniBroj;
        return razlika;

    }
    return 0;
}
}
