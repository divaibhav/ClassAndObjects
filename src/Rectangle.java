public class Rectangle {
    //attributes
    // instance variable
    double width;
    double length;

    double calculateArea(){
        double response = length * width;
        return response;
    }
    Rectangle(double length, double width){
       this.length = length;
       this.width = width;

    }

    double calculatePerimeter(){
        return 2 * (this.length + this.width);
    }
    //check if the given rectangle is a square, this will check if the argument rectangle is square
    boolean isSquare(Rectangle givenRectangle){
        boolean response = false;
        if(givenRectangle.length == givenRectangle.width){
            response = true;
        }
        return response;

    }
    // check if the rectangle is square, this will check whether the calling object is square
    boolean isSquare(){
       boolean response = false;
       if(length == width){
           response = true;
       }
       return response;
    }

    // check whether two rectangles are equal, calling and argument
    // isEquals(Rectangle givenRectangle)
    boolean isEquals(Rectangle givenRectangle){
        boolean response = false;
        if(this.length == givenRectangle.length && this.width == givenRectangle.width){
            response = true;
        }
        return response;
    }
}
