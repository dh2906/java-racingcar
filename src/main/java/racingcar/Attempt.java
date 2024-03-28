package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Attempt {
    public static int inputAttempt() {
        String strAttempt = Console.readLine();
        checkIsNum(strAttempt);

        return stringToInt(strAttempt);
    }

    public static void checkIsNum(String num) {
        if(!num.matches("^[1-9]+[0-9]*$"))
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 자연수만 입력해주세요.");
    }

    public static int stringToInt(String num) {
        return Integer.parseInt(num);
    }
}
