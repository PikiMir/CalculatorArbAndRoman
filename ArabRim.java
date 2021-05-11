package CalculatorTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class ArabRim {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] data = reader.readLine().toUpperCase(Locale.ROOT).split(" ");

        String numberOne, sign, numberTwo;

        numberOne = String.valueOf(data[0]);
        sign = String.valueOf(data[1]);
        numberTwo = String.valueOf(data[2]);

//арабские
        try {
            if (ChekNumbers.chekArab(numberOne) && ChekNumbers.chekArab(numberTwo)) {
                System.out.println(Operations.arithmeticOperations(Integer.parseInt(numberOne), Integer.parseInt(numberTwo), sign));
            }
            //римские
            else if (ChekNumbers.chekRoman(numberOne) && ChekNumbers.chekRoman(numberTwo)) {
                int one = RomanInArab.romanToArab(numberOne);
                int two = RomanInArab.romanToArab(numberTwo);
                System.out.println(RomanInArab.romanNumerals(Operations.arithmeticOperations(one, two, sign)));
            }
        } catch (ArrayIndexOutOfBoundsException o) {
            System.out.println("Input three numbers");
        }

    }
}
