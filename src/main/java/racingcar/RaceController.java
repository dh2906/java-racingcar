package racingcar;
import java.util.ArrayList;
public class RaceController {
    RaceController() {
        try {
            ArrayList<String> nameList = Name.inputName();
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}
