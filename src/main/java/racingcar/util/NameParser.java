package racingcar.util;

import java.util.Arrays;
import java.util.List;

public class NameParser {
    public static List<String> parseName(String names) {
        return Arrays.stream(
                names.split(",", -1))
                .toList();
    }
}
