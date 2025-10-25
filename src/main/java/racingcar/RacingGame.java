package racingcar;

public class RacingGame {
    private final Cars cars;
    private final int tryCount;

    public RacingGame(Cars cars, String tryCount) {
        this.cars = cars;
        this.tryCount = Integer.parseInt(tryCount);
    }

    public void run() {
        OutputView.printExecutionResult();
        for (int i = 0; i < tryCount; i++) {
            playRound();
            OutputView.printEmptyLine();
        }
    }

    private void playRound() {
        for (Car car : cars.getCars()) {
            car.tryMove();
            OutputView.printCarStatus(car);
        }
    }
}
