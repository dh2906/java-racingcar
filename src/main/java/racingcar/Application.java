package racingcar;

import racingcar.controller.RaceController;

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
