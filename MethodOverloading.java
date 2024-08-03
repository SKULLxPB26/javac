
class overloading {
    double pi = 3.14;
    
    public double area(double radius) {
        double circleArea = pi * radius * radius;
        return circleArea;

    }

    double area(double length, double breadth){
        double rectangleArea = length * breadth;
        return rectangleArea;
    }
    
}

public class MethodOverloading {
    public static void main(String[] args) {
        overloading shape = new overloading();
        double circleArea = shape.area(3.5);
        double rectangleArea = shape.area(2.5, 4.5);

        System.out.println("THE AREA OF CIRCLE IS  = " + circleArea);
        System.out.println("THE AREA OF RECTANGLE IS  = " + rectangleArea);
    }
}