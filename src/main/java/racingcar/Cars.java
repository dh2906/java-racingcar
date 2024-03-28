package racingcar;
import java.util.ArrayList;

public class Cars {
    private static ArrayList<Car> carList;
    Cars(ArrayList<String> name) {
        for(String n : name) {
            carList.add(new Car(n));
        }
    }
}
