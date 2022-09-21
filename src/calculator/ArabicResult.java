package calculator;

public class ArabicResult {
    int result;
    public void calculate(int firstArabicNumber, String sign, int secondArabicNumber) {
        switch(sign) {
            case "+" -> result = firstArabicNumber + secondArabicNumber;
            case "-" -> result = firstArabicNumber - secondArabicNumber;
            case "*" -> result = firstArabicNumber * secondArabicNumber;
            case "/" -> result = firstArabicNumber / secondArabicNumber;
        }
            System.out.println(result);
    }
}
