package LectureInheritence;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Figure {
    double calcPerimeter() {
        return 0;
    }

    double calcSquare() {
        return 0;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Периметр треугольника равен: " + triangle.calcPerimeter());
        System.out.println("Площадь треугольника равна: " + triangle.calcSquare());
        Rectangle rectangle = new Rectangle();
        System.out.println("Периметр прямоугольника равен: " + rectangle.calcPerimeter());
        System.out.println("Площадь прямоугольника равна: " + rectangle.calcSquare());
        Circle circle = new Circle();
        System.out.println("Периметр круга равен: " + circle.calcPerimeter());
        System.out.println("Площадь круга равна: " + circle.calcSquare());

    }


}
