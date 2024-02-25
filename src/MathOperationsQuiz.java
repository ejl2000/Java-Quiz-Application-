/**
 * The MathOperationsQuiz class provides basic mathematical operations quiz.
 *
 * @author Emma Lee
 * @version 20242
 */
public class MathOperationsQuiz
{
    private final int firstValue;
    private final int secondValue;

    /**
     * Constructs a MathOperations object with the specified values.
     *
     * @param firstValue  The first integer value
     * @param secondValue The second integer value
     */
    public MathOperationsQuiz(final int firstValue, final int secondValue)
    {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    /**
     * Adds the two integer values and returns the result.
     *
     * @return The sum of the first and second values
     */
    public int add()
    {
        return firstValue + secondValue;
    }

    /**
     * Subtracts the second value from the first value and returns the result.
     *
     * @return The result of subtracting the second value from the first value
     */
    public int subtract()
    {
        return firstValue - secondValue;
    }

    /**
     * Multiplies the two integer values and returns the result.
     *
     * @return The product of the first and second values
     */
    public int multiply()
    {
        return firstValue * secondValue;
    }

    /**
     * Divides the first value by the second value and returns the result.
     *
     * @return The result of dividing the first value by the second value
     * @throws IllegalArgumentException If the second value is zero or negative
     */
    public double divide()
    {
        if (secondValue == 0)
        {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        if (secondValue < 0)
        {
            throw new IllegalArgumentException("Divisor must be a positive number");
        }

        return (double) firstValue / secondValue;
    }

    /**
     * Raises the first value to the power of the second value using Math.pow().
     *
     * @return The result of raising the first value to the power of the second value
     */
    public double power()
    {
        return Math.pow(firstValue, secondValue);
    }
}
