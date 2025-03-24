package racingcar.valid;

public class Validation {
    public void validName(String name) {
        validNameIsNullOrBlank(name);
        validNameLength(name);
    }

    public void validNameIsNullOrBlank(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("이름에 공백 또는 널 값이 입력되었습니다.");
    }

    public void validNameLength(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException("이름의 길이가 5자를 넘었습니다.");
    }

    public void validTryTimes(String tryTimes) {
        validTryTimesIsInteger(tryTimes);
        validTryTimesIsPositive(tryTimes);
    }

    public void validTryTimesIsInteger(String tryTimes) {
        try {
            Integer.parseInt(tryTimes);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수에 정수가 아닌 문자가 입력되었습니다.");
        }
    }

    public void validTryTimesIsPositive(String tryTimes) {
        if (Integer.parseInt(tryTimes) < 0)
            throw new IllegalArgumentException("시도 횟수에 음수가 입력되었습니다.");
    }
}
