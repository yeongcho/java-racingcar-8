package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        // 1. 사용자 입력
        String carNames = InputValue.inputCarNames();
        int tryCount = InputValue.inputTryCountRaw();

        // 2. 자동차 초기화
        Cars cars = new Cars(carNames);

        // 3. 게임 실행
        RacingGame racingGame = new RacingGame(cars, tryCount);
        racingGame.run();

        // 4. 우승자 출력
        OutputView.printWinners(cars.findWinners());
    }
}
