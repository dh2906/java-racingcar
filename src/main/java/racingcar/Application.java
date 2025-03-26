package racingcar;

import racingcar.handler.GameHandler;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameHandler racingGame = new GameHandler();

        racingGame.run();
    }
}
