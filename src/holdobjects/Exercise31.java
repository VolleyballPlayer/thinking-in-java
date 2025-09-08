package holdobjects;
import polymorphism.shape.Circle;
import polymorphism.shape.Triangle;
import polymorphism.shape.Square;
import polymorphism.shape.Shape;

import java.util.Iterator;
import java.util.Random;

class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random();
    public Iterator<Shape> iterator(){
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < 3;// rand.length;
            }
            public Shape next() {
                switch(rand.nextInt(3)) {
                default:
                case 0: return new Circle();
                case 1: return new Square();
                case 2: return new Triangle();
                }
            }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
}

class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    static Iterator it = gen.iterator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = (Shape)it.next();
// Make polymorphic method calls:
        for(Shape shp : s)
            shp.draw();
    }
}
