////////////////////////////////////////////////////////////////////
// Shuhui Chen 2138001
// Chiara Protopapa 2137997
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {
    @Test
    public void convert1toI() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }


    @Test
    public void convert3toIII() {
        int number = 3;
        String result = IntegerToRoman.convert(number);
        assertEquals("III", result);
    }

    @Test
    public void convert4toIV() {
        int number = 4;
        String result = IntegerToRoman.convert(number);
        assertEquals("IV", result);
    }

    @Test
    public void convert5toV() {
        int number = 5;
        String result = IntegerToRoman.convert(number);
        assertEquals("V", result);
    }

    @Test
    public void convert7toVII() {
        int number = 7;
        String result = IntegerToRoman.convert(number);
        assertEquals("VII", result);
    }

    @Test
    public void convert8toVIII() {
        int number = 8;
        String result = IntegerToRoman.convert(number);
        assertEquals("VIII", result);
    }

    @Test
    public void convert9toIX() {
        int number = 9;
        String result = IntegerToRoman.convert(number);
        assertEquals("IX", result);
    }

    @Test
    public void convert10toX() {
        int number = 10;
        String result = IntegerToRoman.convert(number);
        assertEquals("X", result);
    }

    @Test
    public void convert16toXVI() {
        int number = 16;
        String result = IntegerToRoman.convert(number);
        assertEquals("XVI", result);
    }

    @Test
    public void convert20toXX() {
        int number = 20;
        String result = IntegerToRoman.convert(number);
        assertEquals("XX", result);
    }

    @Test
    public void convert23toXXIII() {
        int number = 23;
        String result = IntegerToRoman.convert(number);
        assertEquals("XXIII", result);
    }

    @Test
    public void convert27toXXVII() {
        int number = 27;
        String result = IntegerToRoman.convert(number);
        assertEquals("XXVII", result);
    }

    @Test
    public void convert34toXXXIV() {
        int number = 34;
        String result = IntegerToRoman.convert(number);
        assertEquals("XXXIV", result);
    }

    @Test
    public void convert49toXLIX() {
        int number = 49;
        String result = IntegerToRoman.convert(number);
        assertEquals("XLIX", result);
    }

    @Test
    public void convert50toL() {
        int number = 50;
        String result = IntegerToRoman.convert(number);
        assertEquals("L", result);
    }

    @Test
    public void convert68toLXVIII() {
        int number = 68;
        String result = IntegerToRoman.convert(number);
        assertEquals("LXVIII", result);
    }

    @Test
    public void convert85toLXXXV() {
        int number = 85;
        String result = IntegerToRoman.convert(number);
        assertEquals("LXXXV", result);
    }

    @Test
    public void convert100toC() {
        int number = 100;
        String result = IntegerToRoman.convert(number);
        assertEquals("C", result);
    }

    @Test
    public void convert237toCCXXXVII() {
        int number = 237;
        String result = IntegerToRoman.convert(number);
        assertEquals("CCXXXVII", result);
    }

    @Test
    public void convert323toCCCXXIII() {
        int number = 323;
        String result = IntegerToRoman.convert(number);
        assertEquals("CCCXXIII", result);
    }

    @Test
    public void convert415toCDXV() {
        int number = 415;
        String result = IntegerToRoman.convert(number);
        assertEquals("CDXV", result);
    }

    @Test
    public void convert500toD() {
        int number = 500;
        String result = IntegerToRoman.convert(number);
        assertEquals("D", result);
    }

    @Test
    public void convert794toDCCXCIV() {
        int number = 794;
        String result = IntegerToRoman.convert(number);
        assertEquals("DCCXCIV", result);
    }

    @Test
    public void convert852toDCCCLII() {
        int number = 852;
        String result = IntegerToRoman.convert(number);
        assertEquals("DCCCLII", result);
    }

    @Test
    public void convert999toCMXCIX() {
        int number = 999;
        String result = IntegerToRoman.convert(number);
        assertEquals("CMXCIX", result);
    }

    @Test
    public void convert1000toM() {
        int number = 1000;
        String result = IntegerToRoman.convert(number);
        assertEquals("M", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert0_shouldThrowException() {
        int number = 0;
        IntegerToRoman.convert(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert1532_shouldThrowException() {
        int number = 1532;
        IntegerToRoman.convert(number);
    } 
}
