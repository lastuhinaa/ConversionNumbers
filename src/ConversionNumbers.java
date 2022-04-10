import java.io.IOException;

public class ConversionNumbers {
    public static String toHex(int x) throws IOException { //перевод из 10 в 16
        char[] charArray = new char[]{ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        if (x < 0 || x > 10000) {
            throw new IOException("Ошибка: Введеное число выходит за диапазон допустимых. Попробуйте снова.");
        }
        if (x==0) {
            return "0";
        }
        else {
            StringBuffer hex = new StringBuffer();
            while (x>0)
            {
                int digit = x%16;
                hex.append(charArray[digit]);
                x/=16;
            }
            return hex.reverse().toString();
        }
    }

   public static String toBin(int x) throws IOException { //перевод из 10 в 2
       if (x < 0 || x > 10000) {
           throw new IOException("Ошибка: Введеное число выходит за диапазон допустимых. Попробуйте снова.");
       }
       if (x==0) {
            return "0";
        }
        else {
            StringBuffer bin = new StringBuffer();
            while (x>0)
            {
                int digit = x%2;
                bin.append(digit);
                x/=2;
            }
            return bin.reverse().toString();
        }
    }

   public static int toDex(String x) throws IOException { //перевод из 2 в 10
        int dex = 0, pow = 1;
        if(!x.matches("[0-1]+")){
            throw new IOException("Ошибка: Число в двоичной системе счисления может содержать только цифры 0 и 1. Попробуйте снова.");
       }
        char[] bin = x.toCharArray();
        for (int i = bin.length - 1; i>=0; i--)
        {
            dex+=(bin[i] - '0') *pow;
            pow*=2;
        }
        return dex;
    }
}
