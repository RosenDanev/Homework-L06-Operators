package Java;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        if ((number % 2) == 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is uneven");
        }
    }
}
