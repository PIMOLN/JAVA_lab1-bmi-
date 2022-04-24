import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        int number1;
        int number2;
        int sum;
        if(number<100)
        {
            number1 = number/10;
            number2 = number%10;
            sum = number1+number2;
            System.out.println("The sum of the digits is "+sum);
        }
        else if(number>100 && number<=999)
        {
            int num1,num2,num3,num4,sumnum1;
            num1 = number/100;
            num2 = number/10;
            num3 = num2%10;
            num4 = number%10;
            sumnum1 = num1+num3+num4;
            System.out.println("The sum of the digits is " + sumnum1);
        }
        else if(number == 1000)
        {
            System.out.println("The sum of the digits is "+"1");
        }






    }
}
