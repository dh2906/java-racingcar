package racingcar;
import java.util.ArrayList;

public class Cars {
    private static ArrayList<Car> carList = new ArrayList<>();
    Cars(ArrayList<String> name) {
        for(String n : name) {
            carList.add(new Car(n));
        }
    }

    public String getName(int idx) { return carList.get(idx).getName(); }

    public String printStat(int idx) { return "-".repeat(carList.get(idx).getStat()); }

    public int size() { return carList.size(); }

    public void goForwardCar(int idx) { carList.get(idx).goForward(); }

    public int max() {
        int max = 0;

        for(Car c : carList) {
            max = c.compareToMax(max, c.getStat());
        }

        return max;
    }

    public String getWinnerName(int idx, int highScore) {
        if(carList.get(idx).getStat() == highScore)
            return carList.get(idx).getName();
        return null;
    }
}
