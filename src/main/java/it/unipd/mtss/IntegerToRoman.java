////////////////////////////////////////////////////////////////////
// Shuhui Chen 2138001
// Chiara Protopapa 2137997
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
    //number limits
    if (number < 1 || number > 1000) {
            throw new IllegalArgumentException(
                "Number must be between 1 and 1000"
            );
        }
    // Arrays of arabic values and their roman equivalents
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90,
                        100, 400, 500, 900, 1000};
        String[] romanNum = {"I", "IV", "V", "IX", "X", "XL",
                             "L", "XC", "C", "CD", "D", "CM", "M"};
        String romanS = ""; //output string
    while (number > 0) {
            int max = 0;
        //finds the largest Roman numeral value
        // less or equal to the current number
            for (int i = 0; i < values.length; i++) {
                if (number >= values[i]) {
                    max = i;
                }
            }
        //add the corresponding Roman symbol
            romanS += romanNum[max];
        //subtracts that value from the number
            number -= values[max];
        }
        return romanS;
    }
}
