package Domaci6;

public class BankovniRacun {

        int jmbg;
        String vlasnikRacuna;
        int trenutnoStanjeRacuna;

        public BankovniRacun(int jmbg, String vlasnikRacuna, int trenutnoStanjeRacuna) {
            this.jmbg=jmbg;
            this.vlasnikRacuna=vlasnikRacuna;
            this.trenutnoStanjeRacuna=trenutnoStanjeRacuna;

        }



        public static void main(String[] args) {
            BankovniRacun mojRacun= new BankovniRacun(123, "Petar Petrovic", 150000);
            System.out.println("jmbg: "+ mojRacun.jmbg);
        }

    }
