package racingcar;
import java.util.ArrayList;
public class RaceController {
    RaceController() {
        try {
            ArrayList<String> nameList = Name.inputName();
            int numOfAttempt = Attempt.inputAttempt();
            Cars carList = new carList(nameList);
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}
