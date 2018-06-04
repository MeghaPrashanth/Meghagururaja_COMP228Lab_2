package Exercise3;

public class OverloadedMethod {

    public static void main(String[] args) {

        OverloadedMethod.calculateArea(4); //Call to first overloading static method
        OverloadedMethod.calculateArea(3.7); //Call to  second overloading static method
        OverloadedMethod.calculateArea(2, 4); //Call to  third overloading static method

    }


    //creating the first overloading static method
    private static void calculateArea(int i) {
        System.out.println("Area of a square of Overloaded Method 1 = " + (i*i))	;
    }
    //creating the second overloading static method
    private static void calculateArea(double i) {
        System.out.println("Area of a square of Overloaded Method 2 = " +(i*i))	;
    }
    //creating the third overloading method
    private static void calculateArea(int i, int x) {
        int y = i*x;
        System.out.println("Area using Overloaded Method 3 = " +y)	;
    }
}
