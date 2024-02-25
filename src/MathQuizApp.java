import java.util.Scanner;

/**
 * The MathQuizApp class creates the app with mathematical operations from MathOperationsQuiz class.
 *
 * @author Emma Lee
 * @version 20242
 */
public class MathQuizApp
{
    public static void main(final String[] args)
    {
        final Scanner scanner;
        scanner = new Scanner(System.in);

        // Provide values for the quiz
        System.out.print("Enter the first integer value: ");

        final int firstValue;
        firstValue = scanner.nextInt();

        System.out.print("Enter the second integer value: ");

        final int secondValue;
        secondValue = scanner.nextInt();

        // Create an instance of MathOperationsQuiz
        final MathOperationsQuiz quiz;
        quiz = new MathOperationsQuiz(firstValue, secondValue);

        // Initialize total marks
        int totalMarks;
        totalMarks= 0;

        // Question 1: Addition
        System.out.print("Question 1: What is the result of adding the two values? ");

        final int answerOne;
        final int resultOne;

        answerOne = scanner.nextInt();
        resultOne = quiz.add();

        totalMarks += evaluateAnswer(answerOne, resultOne, 1);

        // Question 2: Subtraction
        System.out.print("Question 2: What is the result of subtracting the second value from the first value? ");

        final int answerTwo;
        final int resultTwo;

        answerTwo = scanner.nextInt();
        resultTwo = quiz.subtract();

        totalMarks += evaluateAnswer(answerTwo, resultTwo, 1);

        // Question 3: Multiplication
        System.out.print("Question 3: What is the result of multiplying the two values? ");

        final int answerThree;
        final int resultThree;

        answerThree = scanner.nextInt();
        resultThree = quiz.multiply();

        totalMarks += evaluateAnswer(answerThree, resultThree, 2);

        // Question 4: Division
        System.out.print("Question 4: What is the result of dividing the first value by the second value? ");

        final double answerFour;
        final double resultFour;

        answerFour = scanner.nextDouble();
        resultFour = quiz.divide();

        totalMarks += evaluateAnswer(answerFour, resultFour, 2);

        // Question 5: Power
        System.out.print("Question 5: What is the result of raising the first value to the power of the second value? ");

        final double answerFive;
        final double resultFive;

        answerFive = scanner.nextDouble();
        resultFive = quiz.power();

        totalMarks += evaluateAnswer(answerFive, resultFive, 4);

        System.out.println("Total Marks: " + totalMarks + "/10");

        // Displaying the Answer Key
        System.out.println("\nAnswer Key:");
        System.out.println("1. Addition: " + resultOne);
        System.out.println("2. Subtraction: " + resultTwo);
        System.out.println("3. Multiplication: " + resultThree);
        System.out.println("4. Division: " + resultFour);
        System.out.println("5. Power: " + resultFive);

        scanner.close();
    }

    private static int evaluateAnswer(int userAnswer, int correctAnswer, int marks)
    {
        if (userAnswer == correctAnswer)
        {
            System.out.println("Correct! +" + marks + " marks");
            return marks;
        }

        else
        {
            System.out.println("Incorrect. 0 marks");
            return 0;
        }
    }

    private static int evaluateAnswer(double userAnswer, double correctAnswer, int marks)
    {
        // Assuming a tolerance for double comparisons (e.g., within 0.001)
        final double tolerance;
        tolerance = 0.001;

        if (Math.abs(userAnswer - correctAnswer) < tolerance)
        {
            System.out.println("Correct! +" + marks + " marks");
            return marks;
        }

        else
        {
            System.out.println("Incorrect. 0 marks");
            return 0;
        }
    }
}
