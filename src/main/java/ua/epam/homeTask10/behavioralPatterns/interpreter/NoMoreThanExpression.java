package ua.epam.homeTask10.behavioralPatterns.interpreter;

public class NoMoreThanExpression implements Expression {

    private double referenceValue;

    public NoMoreThanExpression(double referenceValue) {
        this.referenceValue = referenceValue;
    }

    @Override
    public boolean interpret(double parameter) {
        return parameter <= referenceValue + 0.15 * referenceValue;
    }
}
