import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter weight in pounds: ");
    double weight = scanner.nextDouble();
    System.out.print("Enter height in inches: ");
    double height = scanner.nextDouble();

    double pond =  0.45359237;
    double inch =  0.0254;
    double meter;
    double kilo;
    double meter1;

    kilo = weight*pond;
    meter  = height*inch;
    meter1 = meter*meter;

    double bmi;
    bmi = kilo/meter1;
    System.out.println("bmi is "+bmi);

    }

}
