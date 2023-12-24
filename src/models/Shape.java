package models;
import java.util.ArrayList;
public class Shape {

    private ArrayList<Point> array;
    public Shape() {
        array = new ArrayList<Point>();
    }

    public void addPoint(Point point) {

        array.add(point);

    }


    public double calculatePerimeter() {
        double perimeter = 0;
        for(int i = 0; i < 9; i++) {
            perimeter += array.get(i).distanceTo(array.get(i + 1));
        }
        perimeter += array.get(0).distanceTo(array.get(9));
        return perimeter;
    }

    public double getAverageSide() {
        return calculatePerimeter() / 10;
    }

    public double getLongestSide() {
        double maximum = 0;
        double current;
        for(int i = 0; i < 9; i++) {
            current = array.get(i).distanceTo(array.get(i + 1));
            if(current > maximum) {
                maximum = current;
            }
        }
        current = array.get(0).distanceTo(array.get(9));
        if(current > maximum) {
            maximum = current;
        }
        return maximum;
    }
}