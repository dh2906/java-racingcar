package racingcar;
import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Randoms;
public class RaceController {
    private ArrayList<String> nameList;
    private int numOfAttempt;
    private Cars carList;
    RaceController() {
        try {
            nameList = Name.inputName();
            numOfAttempt = Attempt.inputAttempt();
            carList = new Cars(nameList);
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void raceStart() {
        for(int i = 0; i < numOfAttempt; i++) {
            choiceRandomNum();
            System.out.print((i+1) + " 라운드\n");
            printResult();
            System.out.println();
        }
    }

    public void choiceRandomNum() {
        for(int i = 0; i < carList.size(); i++)
            carGoOrStop(i, Randoms.pickNumberInRange(0, 9));
    }

    public void carGoOrStop(int idx, int rnd) {
        if(rnd >= 4)
            carList.carGoForward(idx);
    }

    public void printResult() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.print(carList.getName(i) + " : " + carList.printStat(i));
            System.out.println();
        }
    }
}
