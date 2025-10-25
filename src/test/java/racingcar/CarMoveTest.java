package racingcar;

import org.junit.jupiter.api.Test;
import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.*;

class CarMoveTest {
    private static final int MOVE = 4;
    private static final int STOP = 3;

    @Test
    void 숫자가_4이상이면_전진한다() {
        Car car = new Car("pobi");

        assertRandomNumberInRangeTest(
                () -> {
                    car.tryMove(); // 랜덤값 4가 나오도록 고정
                    assertThat(car.getPosition()).isEqualTo(1);
                },
                MOVE
        );
    }

    @Test
    void 숫자가_3이하면_멈춘다() {
        Car car = new Car("pobi");

        assertRandomNumberInRangeTest(
                () -> {
                    car.tryMove(); // 랜덤값 3이 나오도록 고정
                    assertThat(car.getPosition()).isEqualTo(0);
                },
                STOP
        );
    }

}
