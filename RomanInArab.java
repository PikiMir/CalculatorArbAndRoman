package CalculatorTwo;

import java.util.HashMap;
import java.util.Map;

public class RomanInArab {
    public static int romanToArab(String numberRoman) {
        if (numberRoman.equals("I")) {
            return 1;
        }
        if (numberRoman.equals("II")) {
            return 2;
        }
        if (numberRoman.equals("III")) {
            return 3;
        }
        if (numberRoman.equals("IV")) {
            return 4;
        }
        if (numberRoman.equals("V")) {
            return 5;
        }
        if (numberRoman.equals("VI")) {
            return 6;
        }
        if (numberRoman.equals("VII")) {
            return 7;
        }
        if (numberRoman.equals("VIII")) {
            return 8;
        }
        if (numberRoman.equals("IX")) {
            return 9;
        }
        if (numberRoman.equals("X")) {
            return 10;
        }


        return 0;
    }

    public static String romanNumerals(int value) {
        HashMap<String, Integer> roman_numerals = new HashMap();

        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
            int matches = value / entry.getValue();
            res += repeat(entry.getKey(), matches);
            value = value % entry.getValue();
        }
        return res;
    }

    public static String repeat(String s, int n) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();

    }
}