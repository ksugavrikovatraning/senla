package first;

import java.util.Scanner;

public class First {
    public static void stringCount() {
        System.out.println("Введите строку для проверки на количество повторяющихся три раза подряд символов:");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Количество \"троек\" в строке: " + (s.split("(.)\\1{2,2}").length - 1));
    }
}
