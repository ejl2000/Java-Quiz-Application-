import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathOperationsQuizTest
{
    MathOperationsQuiz m1;
    MathOperationsQuiz m2;

    @BeforeEach
    void setUp()
    {
        m1 = new MathOperationsQuiz(3, 4);
        m2 = new MathOperationsQuiz(5, 6);
    }

    @AfterEach
    void tearDown()
    {
        m1 = null;
        m2 = null;
    }

    @Test
    void testAdd()
    {
        assertEquals(7, m1.add());
        assertEquals(11, m2.add());
    }

    @Test
    void testSubtract()
    {
        assertEquals(-1, m1.subtract());
        assertEquals(-1, m2.subtract());
    }

    @Test
    void testMultiply()
    {
        assertEquals(12, m1.multiply());
        assertEquals(30, m2.multiply());
    }

    @Test
    void testDivide()
    {
        assertEquals(0.75, m1.divide());
        assertEquals(0.8333333333333334, m2.divide());
        assertThrows(IllegalArgumentException.class, () -> new MathOperationsQuiz(10, 0).divide());
    }

    @Test
    void testPower()
    {
        assertEquals(81.0, new MathOperationsQuiz(3, 4).power());
        assertEquals(15625.0, new MathOperationsQuiz(5, 6).power());
    }

    @Test
    void testPowerWithZero()
    {
        assertEquals(1.0, new MathOperationsQuiz(3, 0).power());
    }

    @Test
    void testPowerWithNegativeExponent()
    {
        final double result;
        result = new MathOperationsQuiz(2, -3).power();

        assertEquals(0.125, result);
    }

}
