package second;

import java.util.Scanner;

public class Second {
    public static void sum() {
        int result = 0;
        System.out.println("������� ������: ");
        String s = new Scanner(System.in).nextLine();
        for (String num : s.replaceAll("[^\\d]", "").split("")) {
            result += Integer.parseInt(num);
        }
        System.out.println("����� ���� � �������� ������: " + result);
    }
}
