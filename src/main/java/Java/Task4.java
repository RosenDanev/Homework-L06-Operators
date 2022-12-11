package Java;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number from 1 to 7");
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 1 ){
            System.out.println("You have selected 1. Day of the week is Monday.");
        }else
        if(number == 2 ){
            System.out.println("You have selected 2. Day of the week is Tuesday.");
        }else
        if (number == 3){
            System.out.println("You have selected 3. Day of the week is Wednesday.");
        }else
        if(number == 4){
            System.out.println("You have selected 4. Day of the week is Thursday.");
        }else
        if (number == 5){
            System.out.println("You have selected 5. Day of the week is Friday.");
        }else
        if(number == 6){
            System.out.println("You have selected 6. Day of the week is Saturday.");
        }else
        if (number==7 ){
            System.out.println("You have selected 7. Day of the week is Sunday.");
        }else
        if (number > 7 ){
            System.out.println("The number is invalid");
        }
    }
}
