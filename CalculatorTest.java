import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    // addition
    @Test
    void additionTwoThreeEqualsFive() {
        Calculator c = new Calculator();
        assertEquals(5, c.addition(2, 3));
    }
    @Test
    void additionZeroZeroEqualsZero() {
        Calculator c = new Calculator();
        assertEquals(0, c.addition(0, 0));
    }

    // subtraction
    @Test
    void subtractionThreeTwoEqualsOne() {
        Calculator c = new Calculator();
        assertEquals(1, c.subtraction(3, 2));
    }
    @Test
    void subtractionTwoThreeEqualsMinusOne() {
        Calculator c = new Calculator();
        assertEquals(-1, c.subtraction(2, 3));
    }

    // multiplication
    @Test
    void multiplicationThreeTwoEqualsSix() {
        Calculator c = new Calculator();
        assertEquals(6, c.multiplication(3, 2));
    }
    @Test
    void multiplicationMinusOneFiveEqualsMinusFive() {
        Calculator c = new Calculator();
        assertEquals(-5, c.multiplication(-1, 5));
    }

    // division
    @Test
    void divisionSixTwoEqualsThree() {
        Calculator c = new Calculator();
        assertEquals(3, c.division(6, 2));
    }
    @Test
    void divisionThreeThreeEqualsOne() {
        Calculator c = new Calculator();
        assertEquals(1, c.division(3, 3));
    }

    // square root
    @Test
    void sqrtNineEqualsThree() {
        Calculator c = new Calculator();
        assertEquals(3, c.squareRoot(9));
    }
    @Test
    void sqrtSixteenEqualsFour() {
        Calculator c = new Calculator();
        assertEquals(4, c.squareRoot(16));
    }

    // power
    @Test
    void powerThreeFourEqualsEightyOne() {
        Calculator c = new Calculator();
        assertEquals(81, c.power(3, 4));
    }
    @Test
    void powerFourThreeEqualsSixtyOne() {
        Calculator c = new Calculator();
        assertEquals(64, c.power(4, 3));
    }
}
