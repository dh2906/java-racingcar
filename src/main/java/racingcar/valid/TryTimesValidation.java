package racingcar.valid;

public class TryTimesValidation {
    public void validTryTimes(String tryTimes) {
        validTryTimesIsInteger(tryTimes);
        validTryTimesIsZeroOrPositive(tryTimes);
    }

    public void validTryTimesIsInteger(String tryTimes) {
        try {
            Integer.parseInt(tryTimes);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수에 정수가 아닌 문자가 입력되었습니다.");
        }
    }

    public void validTryTimesIsZeroOrPositive(String tryTimes) {
        if (Integer.parseInt(tryTimes) <= 0)
            throw new IllegalArgumentException("시도 횟수에 0이하의 정수가 입력되었습니다.");
    }
}
