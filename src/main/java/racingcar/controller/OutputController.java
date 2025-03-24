package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.OutputView;

import java.util.List;

public class OutputController {
    private final OutputView outputView;

    public OutputController() {
        outputView = new OutputView();
    }

    public void outputProgressResultTitle() {
        outputView.printProgressResultTitle();
    }

    public void outputProgressResult(Cars cars) {
        outputView.printProgressResult(cars);
    }

    public void outputWinners(List<Car> winners) {
        outputView.printWinners(winners);
    }
}
