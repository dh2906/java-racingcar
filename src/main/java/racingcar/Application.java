package racingcar;

public class Application {
    public static void main(String[] args) {
        try {
            RaceController rControl = new RaceController();
            rControl.raceStart();
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
