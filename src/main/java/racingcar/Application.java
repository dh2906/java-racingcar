package racingcar;

public class Application {
    public static void main(String[] args) {
        try {
            RaceController rControl = new RaceController();
            rControl.raceStart();
            rControl.printWinners();
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}