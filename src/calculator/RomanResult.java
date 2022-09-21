package calculator;

import java.rmi.server.ExportException;

public class RomanResult {
    String romanResult = "";
    int firstValue;
    int secondValue;
    int result;

    public void arabicToRoman(String firstRomanNumber, String sign, String secondRomanNumber) {
        switch (firstRomanNumber) {
            case "I" -> firstValue = 1;
            case "II" -> firstValue = 2;
            case "III" -> firstValue = 3;
            case "IV" -> firstValue = 4;
            case "V" -> firstValue = 5;
            case "VI" -> firstValue = 6;
            case "VII" -> firstValue = 7;
            case "VIII" -> firstValue = 8;
            case "IX" -> firstValue = 9;
            case "X" -> firstValue = 10;
        }
        switch (secondRomanNumber) {
            case "I" -> secondValue = 1;
            case "II" -> secondValue = 2;
            case "III" -> secondValue = 3;
            case "IV" -> secondValue = 4;
            case "V" -> secondValue = 5;
            case "VI" -> secondValue = 6;
            case "VII" -> secondValue = 7;
            case "VIII" -> secondValue = 8;
            case "IX" -> secondValue = 9;
            case "X" -> secondValue = 10;
        }
        switch (sign) {
            case "+" -> result = firstValue + secondValue;
            case "-" -> result = firstValue - secondValue;
            case "*" -> result = firstValue * secondValue;
            case "/" -> result = firstValue / secondValue;
        }
        if (result < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Римское число не может быть отрицательным");
            }
        }
        while (result >= 100) {
            romanResult += "C";
            result -= 100;
        }
        while (result >= 90) {
            romanResult += "XC";
            result -= 90;
        }
        while (result >= 50) {
            romanResult += "L";
            result -= 50;
        }
        while (result >= 40) {
            romanResult += "XL";
            result -= 40;
        }
        while (result >= 10) {
            romanResult += "X";
            result -= 10;
        }
        while (result >= 9) {
            romanResult += "IX";
            result -= 9;
        }
        while (result >= 5) {
            romanResult += "V";
            result -= 5;
        }
        while (result >= 4) {
            romanResult += "IV";
            result -= 4;
        }
        while (result >= 1) {
            romanResult += "I";
            result -= 1;
        }
        System.out.println(romanResult);
    }
}
