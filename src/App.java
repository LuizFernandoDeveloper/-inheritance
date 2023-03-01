import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.circle.Circle;
import model.enums.color_enums.Color;
import model.rectangle.Rectangle;
import model.shape.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shape:");
        Integer numberShape = sc.nextInt();

        for(int i = 0; i < numberShape; i++){

            System.out.print("Rectangle or a circle.(r/c): ");
            char rectangleOrCircle = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Color is Black, Blue or Red? ");
            Color color = Color.valueOf(sc.nextLine().trim().toUpperCase());

            if(rectangleOrCircle == 'r'){

                System.out.print("Enter the width: ");
                Double width = sc.nextDouble();

                System.out.print("Enter the height: ");
                Double height = sc.nextDouble();

                Rectangle rectagle = new Rectangle(color, width, height);
                shapes.add(rectagle);
            }
            else{

                System.out.print("Enter the radius: ");
                Double radius = sc.nextDouble();

                Circle circle  = new Circle(color, radius);
                shapes.add(circle);

            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f",shape.area()));
        }
        sc.close();
    }
}
