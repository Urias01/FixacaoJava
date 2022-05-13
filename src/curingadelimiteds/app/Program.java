package curingadelimiteds.app;

import java.util.ArrayList;
import java.util.List;

import curingadelimiteds.interfaces.Shape;
import curingadelimiteds.entities.Rectangle;
import curingadelimiteds.entities.Circle;

public class Program {

    public static void main(String[] args) {
        
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0 ; 
        for (Shape shape : list){
            sum += shape.area();
        }
        return sum;
    }
}
