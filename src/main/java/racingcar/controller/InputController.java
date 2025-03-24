package racingcar.controller;

import racingcar.valid.Validation;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputController {
    private final InputView inputView;
    private final Scanner sc;
    private final Validation validation;

    public InputController() {
        inputView = new InputView();
        sc = new Scanner(System.in);
        validation = new Validation();
    }

    public List<String> inputCarNames() {
        inputView.printNamesInputView();
        String names = sc.nextLine();
        List<String> nameList = Arrays.stream(names.split(",", -1)).toList();

        nameList.forEach(validation::validName);

        return nameList;
    }

    public int inputTryTimes() {
        inputView.printTryTimes();

        String tryTimes = sc.nextLine();

        validation.validTryTimes(tryTimes);

        return Integer.parseInt(tryTimes);
    }
}
