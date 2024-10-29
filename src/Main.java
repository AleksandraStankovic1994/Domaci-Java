import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ZADATAK2
        Scanner s = new Scanner(System.in);
        System.out.println("Uneti odgovarajucu ocenu ");
        int x = 60;

        if (x < 51) {
            System.out.println("Broj bodova je nedovoljan za prolaz");
        } else if (x < 61) {
            System.out.println("Ocena je 6");
        } else if (x < 71) {
            System.out.println("Ocena je 7");
        } else if (x < 81) {
            System.out.println("Ocena je 8");
        } else if (x < 91) {
            System.out.println("Ocena je 9");
        } else if (x > 91 || x < 100)

            System.out.println("Ocena je 10");
    }
    }
