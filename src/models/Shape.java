package models;
import java.util.ArrayList;
public class Shape {

    private ArrayList<Point> array;
    public Shape() {
        array = new ArrayList<Point>();
    }

    public void Add_Point(Point point) {

        array.add(point);

    }


    public double Calculate_Perimeter() {
        double perimeter = 0;
        for(int i = 0; i < 9; i++) {
            perimeter += array.get(i).Distance_To(array.get(i + 1));
        }
        perimeter += array.get(0).Distance_To(array.get(9));
        return perimeter;
    }

    public double Get_Average_Side() {
        return Calculate_Perimeter() / 10;
    }

    public double Get_Longest_Side() {
        double maximum = 0;
        double current;
        for(int i = 0; i < 9; i++) {
            current = array.get(i).Distance_To(array.get(i + 1));
            if(current > maximum) {
                maximum = current;
            }
        }
        current = array.get(0).Distance_To(array.get(9));
        if(current > maximum) {
            maximum = current;
        }
        return maximum;
    }
}