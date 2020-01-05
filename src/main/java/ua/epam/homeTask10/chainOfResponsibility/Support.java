package ua.epam.homeTask10.chainOfResponsibility;

public abstract class Support {

    private int complexity;
    private Support nextSupport;

    public Support(int complexity) {
        this.complexity = complexity;
    }

    public void setNextSupport(Support nextSupport) {
        this.nextSupport = nextSupport;
    }

    public void solveProblem(String problem, int priority) {
        if (priority >= complexity) {
            reply(problem);
        }
        if (nextSupport != null) {
            nextSupport.solveProblem(problem, priority);
        }
    }

    public abstract void reply(String problem);
}
