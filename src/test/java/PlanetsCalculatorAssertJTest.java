import org.assertj.core.error.ShouldBeBetween;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class PlanetsCalculatorAssertJTest {
    PlanetsCalculator calculator = new PlanetsCalculator();

    @Test()
    void shouldCalculateAgeOnEarth(){
       Double calcResult = calculator.calculateAgeBySeconds(1000000000, "ziemia");
       assertThat(calcResult.equals(31.69));
    }


    @Test()
    void shouldThrowNullPointer(){
        assertThatThrownBy(() -> calculator.calculateAgeBySeconds(1,"")).
                isInstanceOf(NullPointerException.class);
    }

    @Test
    void shouldBeInstanceOfClass(){
        assertThat(calculator.getClass()).isEqualTo(PlanetsCalculator.class);
    }

    @Test
    void shouldBeBetween(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia")).isBetween(30.0, 37.0);
    }

    @Test
    void shouldBeGreaterThanOrEqual(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia")).isGreaterThanOrEqualTo(30.0);
    }

    @Test
    void shouldNotBeAZero(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia")).isNotZero();
    }


}