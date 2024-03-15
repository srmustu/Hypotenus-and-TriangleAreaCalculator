import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args) {

        /* bu program
            3 kenarının da uzunluğu bilinen bir üçgenin alanını hesaplayabilmektedir
         */

        Scanner calculator = new Scanner(System.in);

        String message2, message5;
        double edge1, edge2, edge3, halfEdges, area;

        message2 = "Welcome to the area calculator, please enter the 1st side lenght : ";
        System.out.print(message2);
        edge1 = calculator.nextDouble();

        System.out.print("Please enter the 2st side lenght : ");
        edge2 = calculator.nextDouble();

        System.out.print("Please enter the 2st side lenght : ");
        edge3 = calculator.nextDouble();

        System.out.println("Calculation is being performed");

        halfEdges = (edge1 + edge2 + edge3) / 2;
        area = Math.sqrt(halfEdges * (halfEdges - edge1) * (halfEdges - edge2) * (halfEdges - edge3));

        message5 = "Area of triangle: ";

        System.out.println(message5 + area);
    }
}
