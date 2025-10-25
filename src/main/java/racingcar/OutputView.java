package racingcar;

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
}
