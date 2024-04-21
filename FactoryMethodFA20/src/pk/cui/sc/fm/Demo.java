package pk.cui.sc.fm;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(ShapeFactory.createShape("circle"));
        shapes.add(ShapeFactory.createShape("square"));
        shapes.add(ShapeFactory.createShape("triangle"));

        for (Shape s : shapes) {
            s.draw();
        }
    }
}