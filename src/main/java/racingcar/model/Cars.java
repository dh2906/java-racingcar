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
        carList.forEach(car ->
                car.move(Randoms.pickNumberInRange(0, 9))
        );
    }


    public List<Car> getCarList() {
        return carList;
    }
}
