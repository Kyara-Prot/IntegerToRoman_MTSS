////////////////////////////////////////////////////////////////////
// Shuhui Chen 2138001
// Chiara Protopapa 2137997
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] rows = new String[6];
        for (int i = 0; i < 6; i++) {
            rows[i] = "";
        }

        for (char c : romanNumber.toCharArray()) {
            String[] letter = getAsciiLetter(c);
            for (int i = 0; i < 6; i++) {
                rows[i] += letter[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String row : rows) {
            sb.append(row).append("\n"); //concatena \n a fine stringa
        }
        return sb.toString();
    }

    private static String[] getAsciiLetter(char c) {
        switch (c) {
            case 'I': return new String[]{
                " _____  ",
                "|_   _| ",
                "  | |   ",
                "  | |   ",
                " _| |_  ",
                "|_____| "
            };
            case 'V': return new String[]{
                "__      __ ",
                "\\ \\    / / ",
                " \\ \\  / /  ",
                "  \\ \\/ /   ",
                "   \\  /    ",
                "    \\/     "
            };
            case 'X': return new String[]{
                "__   __ ",
                "\\ \\ / / ",
                " \\ V /  ",
                "  > <   ",
                " / . \\  ",
                "/_/ \\_\\ "
            };
            case 'L': return new String[]{
                " _       ",
                "| |      ",
                "| |      ",
                "| |      ",
                "| |____  ",
                "|______| "
            };
            case 'C': return new String[]{
                "  _____  ",
                " / ____| ",
                "| |      ",
                "| |      ",
                "| |____  ",
                " \\_____| "
            };
            case 'D': return new String[]{
                " _____   ",
                "|  __ \\  ",
                "| |  | | ",
                "| |  | | ",
                "| |__| | ",
                "|_____/  "
            };
            case 'M': return new String[]{
                " __  __  ",
                "|  \\/  | ",
                "|      | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| "
            };
            default: return new String[]{"", "", "", "", "", ""};
        }
    }
}