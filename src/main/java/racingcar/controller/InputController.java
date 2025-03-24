package racingcar.controller;

import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputController {
    private final InputView inputView;
    private final Scanner sc;

    public InputController() {
        inputView = new InputView();
        sc = new Scanner(System.in);
    }

    public List<String> inputCarNames() {
        inputView.printNamesInputView();
        String names = sc.nextLine();

        return Arrays.stream(names.split(",", -1)).toList();
    }

    public int inputTryTimes() {
        inputView.printTryTimes();

        return sc.nextInt();
    }
}
