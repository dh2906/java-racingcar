package racingcar.model;

public class Car {
    String name;
    int pos;

    public Car(String name) {
        this.name = name;
        this.pos = 0;
    }

    public void move(int num) {
        if (num >= 4)
            pos++;
    }

    public String getName() {
        return name;
    }

    public int getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(getPos());
    }
}
