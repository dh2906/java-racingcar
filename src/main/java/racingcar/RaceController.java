package racingcar;
import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Randoms;

public class RaceController {
    private ArrayList<String> nameList;
    private int numOfAttempt;
    private Cars carList;
    RaceController() {
        nameList = Name.inputName();
        numOfAttempt = Attempt.inputAttempt();
        carList = new Cars(nameList);
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
            goOrStopCar(i, Randoms.pickNumberInRange(0, 9));
    }

    public void goOrStopCar(int idx, int rnd) {
        if(rnd >= 4)
            carList.goForwardCar(idx);
    }

    public void printResult() {
        for(int i = 0; i < carList.size(); i++) {
            System.out.print(carList.getName(i) + " : " + carList.printStat(i));
            System.out.println();
        }
    }

    public String getWhoIsWinner() {
        int max = carList.max();
        ArrayList<String> winners = new ArrayList<>();

        for(int i = 0; i < carList.size(); i++) {
            String name = carList.getWinnerName(i, max);
            if(name != null) winners.add(name);
        }

        return String.join(",", winners);
    }

    public void printWinners() {
        System.out.print("최종 우승자 : ");
        System.out.println(getWhoIsWinner());
    }
}