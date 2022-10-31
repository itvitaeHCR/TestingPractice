import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void cijferMinusTen() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            c.nummerNaarCharCijfer(-10);
        });
    }

    @Test
    void cijferTwenty() {
        Calculator c = new Calculator();
        assertEquals('F', c.nummerNaarCharCijfer(20));
    }

    @Test
    void cijferSixty() {
        Calculator c = new Calculator();
        assertEquals('D', c.nummerNaarCharCijfer(60));
    }
    @Test
    void cijferSeventy() {
        Calculator c = new Calculator();
        assertEquals('C', c.nummerNaarCharCijfer(70));
    }
    @Test
    void cijferEighty() {
        Calculator c = new Calculator();
        assertEquals('B', c.nummerNaarCharCijfer(80));
    }
    @Test
    void cijferNinety() {
        Calculator c = new Calculator();
        assertEquals('A', c.nummerNaarCharCijfer(90));
    }
}