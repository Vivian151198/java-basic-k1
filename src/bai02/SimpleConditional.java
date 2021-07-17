package bai02;

import java.util.Scanner;

public class SimpleConditional {

    public static void main(String[] args) {
        // Nhap 1 so tu ban phim
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.printf("Please enter a number:");
            inputNumber = scanner.nextInt();

            if ((inputNumber % 2) == 0) {
                System.out.printf("The %d is a even number\n", inputNumber);
            } else {
                System.out.printf("The %d is a odd number\n", inputNumber);
            }
        }


    }
}
