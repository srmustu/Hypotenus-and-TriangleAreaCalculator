import java.util.Scanner;
public class HypotenuseCalculator {
    public static void main(String[] args) {
        /* bu program
           üçgende hipotenüs'ün uzunuluğunu bulabiliyor
           (fakat her seferinde bilgisayarın yapısı kaynaklı sebeplerden ötürü aynı hassasiyette çalışmalar gerçekleştiremiyor)
         */

        Scanner calculator = new Scanner(System.in);

        String message2, message4;
        double steepEdge1, steepEdge2, hypotenuse, perpendicularSidesTotal;

        message2 = "Welcome to the hyptenuse calculator, please enter the 1st side lenght : ";
        System.out.print(message2);
        steepEdge1 = calculator.nextInt();

        System.out.print("Please enter the 2st side lenght : ");
        steepEdge2 = calculator.nextInt();
        System.out.println("Calculation is being performed");

        perpendicularSidesTotal = (steepEdge1 * steepEdge1) + (steepEdge2 + steepEdge2);
        hypotenuse = Math.sqrt(perpendicularSidesTotal);
        
        message4 = "Hypotenuse : ";

        System.out.println(message4 + hypotenuse);




    }
}