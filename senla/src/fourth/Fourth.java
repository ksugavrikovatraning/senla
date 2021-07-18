package fourth;

import java.util.Scanner;

public class Fourth {
    public static void primeFactors() {
        System.out.println("Введите целое число ");
        Scanner str = new Scanner(System.in);
        if (str.hasNextInt()) {
            int num = str.nextInt();
            if (num > 1) {
                System.out.print("Простые множители введенного числа: ");
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    while (num % i == 0) {
                        System.out.print(i + " ");
                        num /= i;
                    }
                }
                if (num != 1) {
                    System.out.print(num);
                }
            } else {
                System.out.print("Введено не натуральное число! ");
            }
        } else {
            System.out.print("Введено не целое число! ");
        }
    }
}
