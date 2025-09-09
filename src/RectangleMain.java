import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        // initializing using user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        double length = scanner.nextDouble();
        System.out.println("enter the width of rectangle");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        Rectangle rectangle2 = rectangle;
       /* rectangle.length = 10;
        rectangle.width = 20;*/
        System.out.println("rectangle.length = " + rectangle.length);
        System.out.println("rectangle.width = " + rectangle.width);

        double area = rectangle.calculateArea();

       System.out.println("area = " + area);

       /* rectangle.length = 55;
        area = rectangle.calculateArea();
        System.out.println("area = " + area);*/

        Rectangle rectangle1 = new Rectangle(60,60);
        System.out.println("rectangle1.calculateArea() = " + rectangle1.calculateArea());

        // perimeter, by creating a method calculatePerimeter
        System.out.println("rectangle.calculatePerimeter() = " + rectangle.calculatePerimeter());
        System.out.println("rectangle1.calculatePerimeter() = " + rectangle1.calculatePerimeter());

        // calling isSquare method to check if the calling object is square
        System.out.println("rectangle.isSquare() = " + rectangle.isSquare());

        // calling isSquare to check if the argument rectangle is square
        System.out.println("rectangle.isSquare(rectangle1) = " + rectangle.isSquare(rectangle1));
        System.out.println("rectangle1.isSquare(rectangle1) = " + rectangle1.isSquare(rectangle1));

        System.out.println("rectangle.isEquals(rectangle1) = " + rectangle.isEquals(rectangle1));
        rectangle2.length = 50;

        if(rectangle == rectangle2){
            System.out.println("Same");
        }

    }
}
// create a Person class with following attributes, name, email, mobile, and age.
// This class will also contain a method displayPerson()
// Name :
// Email:
// Mobile:
// Age:
