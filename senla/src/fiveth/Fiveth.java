package fiveth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fiveth {
    final static Pattern PATTERN = Pattern.compile("[ёуеыаоэяию]");

    public int getCount(String str) {
        int k = 0;
        Matcher matcher = PATTERN.matcher(str);
        while (matcher.find()) {
            k += matcher.group().length();
        }
        return k;

    }

    public String firstUpper(String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (matcher.find()) {
            String[] s = str.split("");
            int i = matcher.start();
            str = str.replaceFirst(s[i], s[i].toUpperCase());
        }
        return str;
    }

    public void stringManipulation() {
        System.out.println("Введите предложение");
        String str = new Scanner(System.in).nextLine();
        String[] s = str.split(" ");
        Arrays.sort(s, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return getCount(s2) - getCount(s1);
            }
        });
        for (String st : s) {
            st = firstUpper(st);
            System.out.print(st + " ");
        }
    }

}
