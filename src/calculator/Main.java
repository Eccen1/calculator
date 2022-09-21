package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] userInput = sc.nextLine().split(" ");
        String[] signInput = {"+", "-", "/", "*"};
        String[] arabicValues = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] romanValues = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        RomanResult rr = new RomanResult();
        ArabicResult ar = new ArabicResult();

        boolean checkArabicFromIndex1 = false;
        boolean checkArabicFromIndex2 = false;
        boolean checkRomanFromIndex1 = false;
        boolean checkRomanFromIndex2 = false;

        int firstArabicValue = 0;
        int secondArabicValue = 0;

        String firstRomanValue = "";
        String secondRomanValue = "";
        String sign = "";

        if (userInput.length > 3) {
            System.out.println("Формат математической операции не удовлетворяет заданию");
            return;
        } else if (userInput.length < 3) {
            System.out.println("Строка не является математической операцией");
            return;
        }

        for (String s : arabicValues) {
            if (userInput[0].equals(s)) {
                checkArabicFromIndex1 = true;
            }
            if (userInput[2].equals(s)) {
                checkArabicFromIndex2 = true;
            }
        }

        for (String s : romanValues) {
            if (userInput[0].equals(s)) {
                checkRomanFromIndex1 = true;
            }
            if (userInput[2].equals(s)) {
                checkRomanFromIndex2 = true;
            }
        }

        if (checkArabicFromIndex1 && checkArabicFromIndex2) {
            for (String s : arabicValues) {
                if (userInput[0].equals(s)) {
                    firstArabicValue = Integer.parseInt(userInput[0]);
                }
                if (userInput[2].equals(s)) {
                    secondArabicValue = Integer.parseInt(userInput[2]);
                }
            }
            for (String s : signInput) {
                if (userInput[1].equals(s)) {
                    sign = userInput[1];
                    break;
                }
            }
            ar.calculate(firstArabicValue, sign, secondArabicValue);
        } else if (checkRomanFromIndex1 && checkRomanFromIndex2) {
            for (String s : romanValues) {
                if (userInput[0].equals(s)) {
                    firstRomanValue = userInput[0];
                }
                if (userInput[2].equals(s)) {
                    secondRomanValue = userInput[2];
                }
            }
            for (String s : signInput) {
                if (userInput[1].equals(s)) {
                    sign = userInput[1];
                    break;
                }
            }
            rr.arabicToRoman(firstRomanValue, sign, secondRomanValue);
        } else if (checkArabicFromIndex1 != checkArabicFromIndex2 && checkRomanFromIndex1 != checkRomanFromIndex2) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Используются разные системы счисления");
            }
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Неподходящее число");
            }
        }
    }
}
