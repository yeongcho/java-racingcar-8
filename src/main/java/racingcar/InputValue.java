package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputValue {
    public static String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        validateCarNames(input);
        return input;
    }

    public static String inputTryCountRaw() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        validateTryCount(input);
        return input;
    }

    private static void validateCarNames(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
        }
        for (String name : input.split(",")) {
            String trimmed = name.trim();
            if (trimmed.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름이 공백일 수 없습니다.");
            }
            if (trimmed.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
    }

    private static int validateTryCount(String input) {
        try {
            int count = Integer.parseInt(input);
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
}
