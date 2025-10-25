package racingcar;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class CarsTest {

    @Test
    void 단독_우승자_테스트() {
        Cars cars = new Cars("pobi,woni");
        cars.getCars().get(0).move(); // pobi 이동

        List<String> winners = cars.findWinners();
        assertThat(winners).containsExactly("pobi");
    }

    @Test
    void 공동_우승자_테스트() {
        Cars cars = new Cars("pobi,woni");
        cars.getCars().forEach(Car::move); // pobi, woni 둘 다 이동

        List<String> winners = cars.findWinners();
        assertThat(winners).containsExactly("pobi", "woni");
    }

}
