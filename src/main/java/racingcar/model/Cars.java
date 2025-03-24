package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;
    private final Random random;

    public Cars() {
        carList = new ArrayList<>();
        random = new Random();
    }

    public void join(Car car) {
        carList.add(car);
    }

    public void tryToGo() {
        carList.forEach((car) ->
                car.move(random.nextInt(10)));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public int getMaxPos() {
        return carList.stream().mapToInt(Car::getPos).max().getAsInt();
    }

    public List<Car> getWinners() {
        return carList.stream().filter(car ->
            car.getPos() == getMaxPos()
        ).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.join("\n", carList.stream().map(Car::toString).toList()) + "\n";
    }
}
