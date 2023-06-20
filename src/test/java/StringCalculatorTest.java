import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    public StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalculator = null;
    }

    // Test case when string contains integer greater than or equal to 1000. Program ignores that integer.
    @Test
    public void addTest1() {
        int result = stringCalculator.add("1,1000");
        assertEquals(1,result);
    }

    // Test case when string contains negative integer. Throws IllegalArgumentException.
    @Test
    public void addTest2() {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()-> {
            stringCalculator.add("-1,5");
            }, "Negatives not allowed.");
    }

    // Test if original functionality of add() still works after implementing new features.
    // Accept up to 2 integers in string and return the sum.
    @Test
    public void addTest3() {
        int result = stringCalculator.add("1,2");
        assertEquals(3,result);
    }

    // Test if original functionality of add() still works after implementing new features. Empty string should return 0.
    @Test
    public void addTest4() {
        int result = stringCalculator.add("");
        assertEquals(0,result);
    }

}
