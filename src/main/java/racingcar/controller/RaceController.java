package racingcar.controller;
import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.input.Attempt;
import racingcar.input.Name;
import racingcar.unit.Cars;

public class RaceController {
    private int numOfAttempt;
    private Cars carList;
    private PrintController pController = new PrintController();

    public RaceController() {
        carList = new Cars(Name.inputName());;
        numOfAttempt = Attempt.inputAttempt();
    }

    public void raceStart() {
        for(int i = 0; i < numOfAttempt; i++) {
            choiceRandomNum();
            pController.printInterimResult(i+1, carList);
        }

        pController.printWinnerNames(getWinnerNames());
    }

    public void choiceRandomNum() {
        for(int i = 0; i < carList.size(); i++)
            goOrStopCar(i, Randoms.pickNumberInRange(0, 9));
    }

    public void goOrStopCar(int idx, int rnd) {
        if(rnd >= 4)
            carList.goForwardCar(idx);
    }

    public String getWinnerNames() {
        int max = carList.max();
        ArrayList<String> winners = new ArrayList<>();

        for(int i = 0; i < carList.size(); i++) {
            String name = carList.getMostMovedCar(i, max);
            if(name != null) winners.add(name);
        }

        return String.join(",", winners);
    }
}
