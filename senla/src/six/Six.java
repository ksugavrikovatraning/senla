package six;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Six {

    public static void bigFigure() {
        String[][] number = { { "  ***  ", " *   *  ", "*     *", "*     *", "*     *", " *   * ", "  ***  " },
                { " * ", "** ", " * ", " * ", " * ", " * ", "***" },
                { " *** ", "*   *", "*  * ", "  *  ", " *   ", "*    ", "*****" },
                { " *** ", "*   *", "*   *", "  ** ", "    *", "*   *", " *** " },
                { "   * ", "  ** ", " * * ", "*  * ", "*****", "   * ", "   * " },
                { "****", "*   ", "*   ", "*** ", "   *", "*  *", " ** " },
                { "  *  ", " *   ", "*    ", "*** ", "*   *", "*   *", " *** " },
                { "*****", "   *", "   * ", "  *  ", " *   ", "*    ", "*    " },
                { " *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** " },
                { " *** ", "*   *", "*   *", " ****", "    *", "   * ", "  *  " } };
       
        System.out.println("¬ведите целое число");
        Scanner str = new Scanner(System.in);
        if (str.hasNextInt()) {
            String[] inputStr =str.next().split("");
            int input[] = new int[inputStr.length];
            for (int i = 0; i < inputStr.length; i++) {
                input[i] = Integer.parseInt(inputStr[i]);
                System.out.println(input[i]);
            }
            for(int k = 0;k<input.length;k++) {
                big(number,input[k]);
           }
        }
    }
    
    public static void big(String[][] number,int input) {
    for(int i = 0;i<number.length;i++) {
        if(i == input)
        
            for(int j = 0;j<number[i].length;j++){
              System.out.print(number[i][j]+"\n");
            }
    }}
    
}
