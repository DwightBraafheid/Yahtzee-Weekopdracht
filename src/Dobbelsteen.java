import java.util.ArrayList;
import java.util.Random;

public class Dobbelsteen{
    // waarde int
    private int waarde;

    boolean nogEenKeerWerpen = true; {

    }

    public void werpen()
    {
        Random random = new Random();

        if (nogEenKeerWerpen) {
          waarde = random.nextInt(6) + 1;
        }
    }
}
//class dobbelstenen {
//int dobbelsteen = (int) (Math.random()*6+1);
//}

//    ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<>();
//    dobbelstenen steen1 = new dobbelstenen();
//    dobbelstenen steen2 = new dobbelstenen();
//    dobbelstenen steen3 = new dobbelstenen();
//    dobbelstenen steen4 = new dobbelstenen();
//    dobbelstenen steen5 = new dobbelstenen();
//    dobbelstenen steen6 = new dobbelstenen();
