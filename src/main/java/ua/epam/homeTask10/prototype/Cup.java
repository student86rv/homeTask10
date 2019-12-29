package ua.epam.homeTask10.prototype;

public class Cup implements Copyable{

    private Color color;
    private int height;
    private int diameter;

    public Cup(Color color, int height, int diameter) {
        this.color = color;
        this.height = height;
        this.diameter = diameter;
    }

    @Override
    public Object copy() {
        return new Cup(color, height, diameter);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "color=" + color +
                ", height=" + height +
                ", diameter=" + diameter +
                '}';
    }
}
