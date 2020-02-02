package LectureInheritence;

public class Circle extends Figure {
    int diameter = 30;

    public Circle() {

    }

    public void setCircle(int diameter) {
        this.diameter = diameter;
    }


    @Override
    public double calcPerimeter() {
        double p = diameter * 3.14;
        return p;
    }

    @Override
    public double calcSquare() {
        double r = diameter / 2;
        double s = 3.14 * (r * r);
        return s;
    }
}
