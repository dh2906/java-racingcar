package racingcar;

import racingcar.unit.Cars;

public class PrintController {
    public void printInterimResult(int round, Cars carList) {
        System.out.print(round + " 라운드\n");
        printResult(carList);
        System.out.println();
    }

    public void printResult(Cars carList) {
        for(int i = 0; i < carList.size(); i++) {
            System.out.print(carList.getName(i) + " : " + carList.printStat(i));
            System.out.println();
        }
    }

    public void printWinners(String names) {
        System.out.print("최종 우승자 : ");
        System.out.println(names);
    }
}
