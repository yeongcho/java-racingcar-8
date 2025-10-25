package racingcar;

import java.util.List;

public class OutputView {
    public static void printExecutionResult() {
        System.out.println("\n실행 결과");
    }

    public static void printCarStatus(Car car) {
        System.out.println(car.getName() + " : " + car.getProgress());
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
