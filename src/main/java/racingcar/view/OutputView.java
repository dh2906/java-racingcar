package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.List;

public class OutputView {
    public void printProgressResultTitle() {
        System.out.println("실행 결과");
    }

    public void printProgressResult(Cars cars) {
        System.out.println(cars);
    }

    public void printWinners(List<Car> winners) {
        String winnersString = String.join(", ", winners.stream().map(Car::getName).toList());

        System.out.print("최종 우승자 : " + winnersString);
    }
}
