package racingcar;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class Name {
    private static String name;
    private static final int MAX_NAME_LENGTH = 5;
    private static ArrayList<String> nameList = new ArrayList<>();

    public static ArrayList<String> inputName() {
        System.out.println("자동차 이름을 입력해주세요. (이름이 여러개면 쉼표(,)로 구분하고 공백없이 입력)");
        name = Console.readLine();

        for(String s : name.split(",")) {
            checkNameExcept(s);
            nameList.add(s);
        }

        return nameList;
    }

    public static void checkNameExcept(String name) {
        checkOverLength(name);
        checkBlankInName(name);
    }

    public static void checkOverLength(String name) {
        if(name.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException("[ERROR] 글자 수 초과");
    }

    public static void checkBlankInName(String name) {
        if(name.length() != name.strip().length())
            throw new IllegalArgumentException("[ERROR] 이름에 공백 포함");
    }
}
