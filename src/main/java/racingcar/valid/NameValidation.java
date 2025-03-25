package racingcar.valid;

public class NameValidation {
    final int MAX_NAME_LENGTH = 5;

    public void validName(String name) {
        validNameIsNullOrBlank(name);
        validNameLength(name);
    }

    public void validNameIsNullOrBlank(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("이름에 공백 또는 널 값이 입력되었습니다.");
    }

    public void validNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException("이름의 길이가 5자를 넘었습니다.");
    }
}
