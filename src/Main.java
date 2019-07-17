import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welkom bij Yahtzee");
        //System.out.println("Druk op 'Enter' om te spelen ");
        System.out.println("Druk op 'Q' om het spel te stoppen ");
        System.out.println("================");

        System.out.println("Met hoeveel spelers wil je spelen? ");
        int aantalSpelers = in.nextInt();
        Speler.detailsSpeler(aantalSpelers);
        YahtzeeSpel spel = new YahtzeeSpel();
        spel.YahtzeeSpelen();
    }

    class YahtzeeSpelen {
        for(
        int i = 0;
        i< 3;i++)

        {
            String s = in.nextLine(); //aanpassen voor continue loop tenzij Q word gedrukt
        }

        do

        {

        }
        while(

    }

}


