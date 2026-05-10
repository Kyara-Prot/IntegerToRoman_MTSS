////////////////////////////////////////////////////////////////////
// Shuhui Chen 2138001
// Chiara Protopapa 2137997
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testForI() {
        String expected =                 
                " _____  \n"+
                "|_   _| \n"+
                "  | |   \n"+
                "  | |   \n"+
                " _| |_  \n"+
                "|_____| \n"; 
        String result = RomanPrinter.print(1);
        assertEquals(expected, result);
    }

    @Test
    public void testForII() {
        String expected =                 
                " _____   _____  \n"+
                "|_   _| |_   _| \n"+
                "  | |     | |   \n"+
                "  | |     | |   \n"+
                " _| |_   _| |_  \n"+
                "|_____| |_____| \n";               
        String result = RomanPrinter.print(2);
        assertEquals(expected, result);
    }

    @Test
    public void testForV() {
        String expected =
		"__      __ \n"+
                "\\ \\    / / \n"+
                " \\ \\  / /  \n"+
                "  \\ \\/ /   \n"+
                "   \\  /    \n"+
                "    \\/     \n";
        String result = RomanPrinter.print(5);
        assertEquals(expected, result);
    }

    @Test
    public void testForVI() {
        String expected =                 
                "__      __  _____  \n"+
                "\\ \\    / / |_   _| \n"+
                " \\ \\  / /    | |   \n"+
                "  \\ \\/ /     | |   \n"+
                "   \\  /     _| |_  \n"+
                "    \\/     |_____| \n";
        String result = RomanPrinter.print(6);
        assertEquals(expected, result);
    }

    @Test
    public void testForX() {
        String expected = 
                "__   __ \n"+
                "\\ \\ / / \n"+
                " \\ V /  \n"+
                "  > <   \n"+
                " / . \\  \n"+
                "/_/ \\_\\ \n";
        String result = RomanPrinter.print(10);
        assertEquals(expected, result);
    }

    @Test
    public void testForXI() {
        String expected = 
                "__   __  _____  \n"+
                "\\ \\ / / |_   _| \n"+
                " \\ V /    | |   \n"+
                "  > <     | |   \n"+
                " / . \\   _| |_  \n"+
                "/_/ \\_\\ |_____| \n";
        String result = RomanPrinter.print(11);
        assertEquals(expected, result);
    }

    @Test
    public void testForXV() {
        String expected = 
                "__   __ __      __ \n"+
                "\\ \\ / / \\ \\    / / \n"+
                " \\ V /   \\ \\  / /  \n"+
                "  > <     \\ \\/ /   \n"+
                " / . \\     \\  /    \n"+
                "/_/ \\_\\     \\/     \n";
        String result = RomanPrinter.print(15);
        assertEquals(expected, result);
    }
    
    @Test
    public void testForL() {
        String expected = 
                " _       \n"+
                "| |      \n"+
                "| |      \n"+
                "| |      \n"+
                "| |____  \n"+
                "|______| \n";
        String result = RomanPrinter.print(50);
        assertEquals(expected, result);
    }

    @Test
    public void testForLI() {
        String expected = 
                " _        _____  \n"+
                "| |      |_   _| \n"+
                "| |        | |   \n"+
                "| |        | |   \n"+
                "| |____   _| |_  \n"+
                "|______| |_____| \n"; 
        String result = RomanPrinter.print(51);
        assertEquals(expected, result);
    }

    @Test
    public void testForC() {
        String expected = 
                "  _____  \n"+
                " / ____| \n"+
                "| |      \n"+
                "| |      \n"+
                "| |____  \n"+
                " \\_____| \n";
        String result = RomanPrinter.print(100);
        assertEquals(expected, result);
    }

    @Test
    public void testForCI() {
        String expected = 
                "  _____   _____  \n"+
                " / ____| |_   _| \n"+
                "| |        | |   \n"+
                "| |        | |   \n"+
                "| |____   _| |_  \n"+
                " \\_____| |_____| \n"; 
        String result = RomanPrinter.print(101);
        assertEquals(expected, result);
    }

    @Test
    public void testForD() {
        String expected = 
                " _____   \n"+
                "|  __ \\  \n"+
                "| |  | | \n"+
                "| |  | | \n"+
                "| |__| | \n"+
                "|_____/  \n";
        String result = RomanPrinter.print(500);
        assertEquals(expected, result);
    }

    @Test
    public void testForDI() {
        String expected = 
                " _____    _____  \n"+
                "|  __ \\  |_   _| \n"+
                "| |  | |   | |   \n"+
                "| |  | |   | |   \n"+
                "| |__| |  _| |_  \n"+
                "|_____/  |_____| \n"; 
        String result = RomanPrinter.print(501);
        assertEquals(expected, result);
    }

    @Test
    public void testForM() {
        String expected = 
                " __  __  \n"+
                "|  \\/  | \n"+
                "|      | \n"+
                "| |\\/| | \n"+
                "| |  | | \n"+
                "|_|  |_| \n";
        String result = RomanPrinter.print(1000);
        assertEquals(expected, result);
    }

}

