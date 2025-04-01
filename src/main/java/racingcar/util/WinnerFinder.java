package racingcar.util;

import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class WinnerFinder {
    public static List<Car> findWinners(Cars cars) {
        List<Car> carList = cars.getCarList();

        int maxPos = carList.stream()
                .mapToInt(Car::getPos)
                .max()
                .getAsInt();

        return carList.stream()
                .filter(car -> car.getPos() == maxPos)
                .collect(Collectors.toList());
    }
}
