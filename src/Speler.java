import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Speler {

    Scanner in = new Scanner(System.in);
    detailsSpeler<aantalSpelers> list;

    public Speler() {
        detailsSpeler = new ArrayList<detailsSpeler>();
        for (int i = 0; i < aantalSpelers + 1; i++) {
            detailsSpeler.add(new aantalSpelers());
        }


    }
    class aantalSpelers {
    }
}

//        int aantalSpelers;
//        for (int i = 0; i < aantalSpelers; i++){
//
//
//    }
//ArrayList<Speler> Spelers= new ArrayList<Speler>();
