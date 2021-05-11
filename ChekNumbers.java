package CalculatorTwo;

public class ChekNumbers {
    public static boolean chekRoman(String s) {

        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i < roman.length; i++) {
            if (s.equals(roman[i])) {

                return true;
            }

        }
        return false;
    }
    public static boolean chekArab(String s) {

        String[] roman = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int i = 0; i < roman.length; i++) {
            if (s.equals(roman[i])) {
                return true;
            }

        }
        return false;
    }
}
