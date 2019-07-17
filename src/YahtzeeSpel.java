import java.util.ArrayList;
import java.util.List;

public class YahtzeeSpel {

    List<Dobbelsteen> list;

    public YahtzeeSpel() {
        list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Dobbelsteen());
        }

        // create a main loop
            // call wegwerpen on each dice
            // select dices that should remain
            // for each dice that should remain, set nogEenKeerWerpen to false
    }


}
