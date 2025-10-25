package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int MOVE_CONDITION = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름이 유효하지 않습니다.");
        }
        this.name = name.trim();
    }

    public void tryMove() {
        int randomValue = Randoms.pickNumberInRange(0, 9);
        if (randomValue >= MOVE_CONDITION) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getProgress() {
        return "-".repeat(position);
    }
}
