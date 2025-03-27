package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;

    public Cars() {
        carList = new ArrayList<>();
    }

    public void join(Car car) {
        carList.add(car);
    }

    public void tryToGo() {
        carList.forEach((car) ->
                car.move(Randoms.pickNumberInRange(0, 9)));
    }

    public int getMaxPos() {
        return carList.stream()
                .mapToInt(Car::getPos)
                .max()
                .getAsInt();
    }

    public List<Car> getWinners() {
        int maxPos = getMaxPos();

        return carList.stream().filter(car ->
            car.getPos() == maxPos
        ).collect(Collectors.toList());
    }

    public List<Car> getCarList() {
        return carList;
    }
}
