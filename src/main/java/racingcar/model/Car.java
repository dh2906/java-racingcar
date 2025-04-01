package racingcar.model;

public class Car {
    private String name;
    private int pos;
    private final int MOVABLE_CAR_NUMBER = 4;

    public Car(String name) {
        this.name = name;
        this.pos = 0;
    }

    public void move(int num) {
        if (num >= MOVABLE_CAR_NUMBER)
            pos++;
    }

    public String getName() {
        return name;
    }

    public int getPos() {
        return pos;
    }
}
