import java.util.Scanner;
public class ex226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First degree equation");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        if (a != 0){
            System.out.println("Solution is " + (-b / a));
        } else if (b == 0){
            System.out.println("Infinite solutions");
        } else{
            System.out.println("No solution found");
        }

        System.out.println("\nFirst degree system of equations");
        System.out.print("Enter a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = sc.nextDouble();

        double D = a11*a22 - a12*a21;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;

        if (D != 0) {
            double x1 = D1/D;
            double x2 = D2/D;
            System.out.println("Solution is x1 = " + x1 + ", x2 = " + x2);
        } else if (D1 == 0 && D2 == 0) {
            System.out.println("Infinite solutions");
        } else {
            System.out.println("No solution found");
        }

        // Quadratic equation
        System.out.println("\nQuadratic equation");
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else {
            double delta = b*b - 4*a*c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Two distinct real solutions: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b/(2*a);
                System.out.println("One real solution: x = " + x);
            } else {
                System.out.println("No real solution");
            }
        }
    }
}