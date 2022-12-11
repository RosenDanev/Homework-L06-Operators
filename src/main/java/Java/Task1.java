package Java;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Напишете програма/ метод, която приема от конзолата 3 подадени числа определя кое е най-голяматo.
        Scanner scanner = new Scanner(System.in);
        // Условието на задачата разрешава да се въвеждат и дробни числа.
        System.out.println("Please, Enter the first number");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Please, Enter the second number");
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Please, Enter the third number");
        double thirdNumber = Double.parseDouble(scanner.nextLine());
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The first number is biggest");
        } else
        if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("The second number is biggest");
        } else
        if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("The third number is biggest");
        }else
        if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)){
            System.out.println("The first and the second numbers are bigger than the third");
        }else
        if ((secondNumber ==thirdNumber) && (secondNumber > firstNumber)){
            System.out.println("The second and the third numbers are bigger than the first");
        }else
        if ((firstNumber == thirdNumber) && (firstNumber > secondNumber)){
            System.out.println("The first and the third numbers are bigger than the second");
        }else
        if((firstNumber == secondNumber)&&( secondNumber == thirdNumber)){
            System.out.println("All numbers are equal");
        }

    }
}
