package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.valid.NameValidation;
import racingcar.valid.TryTimesValidation;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputController {
    private final InputView inputView;
    private final NameValidation nameValidation;
    private final TryTimesValidation tryTimesValidation;

    public InputController() {
        inputView = new InputView();
        nameValidation = new NameValidation();
        tryTimesValidation = new TryTimesValidation();
    }

    public List<String> inputCarNames() {
        inputView.printNamesInputView();
        String names = Console.readLine();
        List<String> nameList = Arrays.stream(names.split(",", -1)).toList();

        nameList.forEach(nameValidation::validName);

        return nameList;
    }

    public int inputTryTimes() {
        inputView.printTryTimes();

        String tryTimes = Console.readLine();

        tryTimesValidation.validTryTimes(tryTimes);

        return Integer.parseInt(tryTimes);
    }
}
