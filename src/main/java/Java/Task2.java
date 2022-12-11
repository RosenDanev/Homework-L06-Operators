package Java;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Напишете програма/ метод, която за подадени дължина и височина на правоъгълник,изкарват на конзолата неговият периметър и лице.
        Scanner scanner = new Scanner(System.in);
        // Условието на задачата разрешава да се въвеждат и дробни числа.
        System.out.println("Please, enter the length of the rectangle");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Please, enter the width of the rectangle");
        double b = Double.parseDouble(scanner.nextLine());
        double perimeter = (a + b) * 2;
        double area = a * b;
        System.out.println("The Perimeter of rectangle is : " + perimeter );
        System.out.println("The Area of the rectangle is :" + area);
    }
}
