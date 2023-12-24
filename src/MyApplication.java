import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/liana/IdeaProjects/chereshnya/src/source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.Add_Point(point);
        }

        System.out.println(shape.Calculate_Perimeter());
        System.out.println(shape.Get_Longest_Side());
        System.out.println(shape.Get_Average_Side());
    }
}