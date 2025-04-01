package racingcar.handler;

import racingcar.controller.InputController;
import racingcar.controller.OutputController;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.util.WinnerFinder;

import java.util.List;

public class GameHandler {
    private final Cars cars;
    private final InputController inputController;
    private final OutputController outputController;
    private int tryTimes;

    public GameHandler() {
        cars = new Cars();
        inputController = new InputController();
        outputController = new OutputController();
    }

    public void run() {
        inputs();
        progressResult();
        showWinners();
    }

    public void inputs() {
        List<String> nameList = inputController.inputCarNames();
        tryTimes = inputController.inputTryTimes();

        nameList.forEach((name) -> {
            cars.join(new Car(name));
        });
    }

    public void progressResult() {
        outputController.outputProgressResultTitle();

        for (int i = 0; i < tryTimes; i++) {
            cars.tryToGo();
            outputController.outputProgressResult(cars);
        }
    }

    public void showWinners() {
        List<Car> winners = WinnerFinder.findWinners(cars);

        outputController.outputWinners(winners);
    }
}
