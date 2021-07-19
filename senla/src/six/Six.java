package six;

import java.util.Scanner;

public class Six {

	public static void bigFigure() {
		String[][] number = { { "  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  " },
				{ " * ", "** ", " * ", " * ", " * ", " * ", "***" },
				{ " *** ", "*   *", "   * ", "  *  ", " *   ", "*    ", "*****" },
				{ " *** ", "*   *", "    *", "  ** ", "    *", "*   *", " *** " },
				{ "   * ", "  ** ", " * * ", "*  * ", "*****", "   * ", "   * " },
				{ "****", "*   ", "*   ", "*** ", "   *", "*  *", " ** " },
				{ "  *  ", " *   ", "*    ", "***  ", "*   *", "*   *", " *** " },
				{ "*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*    " },
				{ " *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** " },
				{ " *** ", "*   *", "*   *", " ****", "    *", "   * ", "  *  " } };

		System.out.println("Введите число");
		Scanner str = new Scanner(System.in);
		if (str.hasNextInt()) {
			String[] inputStr = str.next().split("");
			int input[] = new int[inputStr.length];
			for (int i = 0; i < inputStr.length; i++) {
				input[i] = Integer.parseInt(inputStr[i]);
			}
			for (int i = 0; i < number[0].length; i++) {
				for (int k = 0; k < input.length; k++) {
					big(number, input, i, k);
					// bigNum(number, input, i,k);//использовать маленькие буквы вместо *
				}
				System.out.println();
			}
		}
	}

	public static void big(String[][] number, int input[], int i, int k) {
		System.out.print(number[input[k]][i] + "   ");
	}

	public static void bigAdd(String[][] number, int input[], int i, int k) {
		String s = number[input[k]][i].replace("*", Integer.toString(input[k]));
		System.out.print(s + "   ");
	}

}
