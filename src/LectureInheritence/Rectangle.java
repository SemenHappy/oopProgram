package LectureInheritence;

public class Rectangle extends Figure {
    private int a = 50;
    private int b = 30;
    private int c = 50;
    private int d = 30;

    public Rectangle() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Rectangle(int a, int b, int c, int d) {

    }

    @Override
    public double calcPerimeter() {
        int p = a + b + c + d;
        return p;
    }

    @Override
    public double calcSquare() {
        int s = a * b;
        return s;

    }
}
