package first;

import java.util.Scanner;

public class First {
    public static void stringCount() {
        System.out.println("������� ������ ��� �������� �� ���������� ������������� ��� ���� ������ ��������:");
        String s = new Scanner(System.in).nextLine();
        System.out.println("���������� \"�����\" � ������: " + (s.split("(.)\\1{2,2}").length - 1));
    }
}
