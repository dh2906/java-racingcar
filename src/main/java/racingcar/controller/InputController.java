package racingcar.controller;

import racingcar.valid.NameValidation;
import racingcar.valid.TryTimesValidation;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputController {
    private final InputView inputView;
    private final Scanner sc;
    private final NameValidation nameValidation;
    private final TryTimesValidation tryTimesValidation;

    public InputController() {
        inputView = new InputView();
        sc = new Scanner(System.in);
        nameValidation = new NameValidation();
        tryTimesValidation = new TryTimesValidation();
    }

    public List<String> inputCarNames() {
        inputView.printNamesInputView();
        String names = sc.nextLine();
        List<String> nameList = Arrays.stream(names.split(",", -1)).toList();

        nameList.forEach(nameValidation::validName);

        return nameList;
    }

    public int inputTryTimes() {
        inputView.printTryTimes();

        String tryTimes = sc.nextLine();

        tryTimesValidation.validTryTimes(tryTimes);

        return Integer.parseInt(tryTimes);
    }
}
