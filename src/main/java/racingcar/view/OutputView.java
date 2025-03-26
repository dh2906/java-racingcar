package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.List;

public class OutputView {
    public void printProgressResultTitle() {
        System.out.println("실행 결과");
    }

    public void printProgressResult(Cars cars) {
        var carList = cars.getCarList();

        carList.forEach((car) ->
                System.out.printf("%s : %s \n", car.getName(), "-".repeat(car.getPos()))
        );

        System.out.println();
    }

    public void printWinners(List<Car> winners) {
        String winnersString = String.join(", ", winners.stream().map(Car::getName).toList());

        System.out.print("최종 우승자 : " + winnersString);
    }
}
