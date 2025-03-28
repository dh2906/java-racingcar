package racingcar.handler;

import racingcar.controller.InputController;
import racingcar.controller.OutputController;
import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.List;

public class GameHandler {
    private final Cars cars;
    private final InputController inputController;
    private final OutputController outputController;

    public GameHandler() {
        cars = new Cars();
        inputController = new InputController();
        outputController = new OutputController();
    }

    public void run() {
        List<String> nameList = inputController.inputCarNames();
        int tryTimes = inputController.inputTryTimes();

        nameList.forEach((name) -> {
            cars.join(new Car(name));
        });

        outputController.outputProgressResultTitle();

        for (int i = 0; i < tryTimes; i++) {
            cars.tryToGo();
            outputController.outputProgressResult(cars);
        }

        List<Car> winners = cars.getWinners();

        outputController.outputWinners(winners);

    }
}
