package racingcar;

public class Car {
    private final String name;
    private int stat;

    Car(String name) {
        this.name = name;
        this.stat = 0;
    }

    public void goForward() {
        stat++;
    }

    public String getName() {
        return name;
    }

    public int getStat() {
        return stat;
    }

}
