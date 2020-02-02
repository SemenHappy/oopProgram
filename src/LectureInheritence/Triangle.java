package LectureInheritence;

import java.sql.SQLOutput;

public class Triangle extends Figure {
    private int a = 30;
    private int b = 30;
    private int c = 30;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    ;

    @Override
    public double calcPerimeter() {
        int p = a + b + c;
        return p;

    }

    @Override
    public double calcSquare() {
        double s = ((a * a) * Math.sqrt(3)) / 4;
        return s;


    }


}
