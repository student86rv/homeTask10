package ua.epam.homeTask10.behavioralPatterns.interpreter;

public class AppRunner {

    public static void main(String[] args) {

        //Testing electronic device

        Expression powerSupplyTest = new AndExpression(
                new NoMoreThanExpression(Reference.POWER_SUPPLY),
                new NoLessThanExpression(Reference.POWER_SUPPLY)
        );

        Expression powerOutputTest = new AndExpression(
                new NoMoreThanExpression(Reference.POWER_OUTPUT),
                new NoLessThanExpression(Reference.POWER_OUTPUT)
        );

        Expression distortionsTest = new AndExpression(
                new NoMoreThanExpression(Reference.DISTORTIONS),
                new NoLessThanExpression(Reference.DISTORTIONS)
        );

        Expression sensitivityTest = new AndExpression(
                new NoMoreThanExpression(Reference.SENSITIVITY),
                new NoLessThanExpression(Reference.SENSITIVITY)
        );

        System.out.println("Power supply test passed: " +
                powerSupplyTest.interpret(117));

        System.out.println("Power output test passed: " +
                powerOutputTest.interpret(42));

        System.out.println("Distortions test passed: " +
                distortionsTest.interpret(0.325));

        System.out.println("Sensitivity test passed: " +
                sensitivityTest.interpret(0.16));
    }
}
