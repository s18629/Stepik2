import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PlanetsCalculatorHamcrestTest {
    PlanetsCalculator calculator = new PlanetsCalculator();

    @Test()
    public void shouldCalculateAgeOnEarth(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia"), equalTo(31.69));
    }


    @Test
    public void shouldBeGreaterThan(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia"), is(greaterThan(30.0)));
    }

    @Test
    public void shouldBeGreaterThanOrEqualTo(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia"),
                is(greaterThanOrEqualTo(31.69)));
    }

    @Test
    public void shouldBeInstanceOfClass(){
        assertThat(calculator, is(instanceOf(PlanetsCalculator.class)));
    }

    @Test
    public void shouldBeNotNull(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia"), is(notNullValue()));
    }

    @Test
    public void ShouldBeCloseToResult(){
        assertThat(calculator.calculateAgeBySeconds(1000000000, "ziemia"),
                is(closeTo(35.0, 5)));
    }








}