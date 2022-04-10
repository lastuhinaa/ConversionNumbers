import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("1 - Конвертация числа из 10-ой системы счисления в 16-ричную;\n" +
                    "2 - Конвертация числа из 10-ой системы счисления в 2-ую;\n" +
                    "3 - Конвертация числа из 2-ой системы счисления в 10-ую;\n" +
                    "3 - Конвертация числа из 2-ой системы счисления в 10-ую;\n" +
                    "4 - Закончить работу программы\n" +
                    "Для выбора пункта меню введите соответствующую цифру: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    try {
                        System.out.print("Введите число, которое хотите сконвертировать: ");
                        int dex = sc.nextInt();
                        System.out.println("Результат конвертации: " + ConversionNumbers.toHex(dex) + "\n");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage()+ "\n");
                    }
                    break;
                }
                case 2: {
                    try {
                        System.out.print("Введите число, которое хотите сконвертировать: ");
                        int dex = sc.nextInt();
                        System.out.println("Результат конвертации: " + ConversionNumbers.toBin(dex) + "\n");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage() + "\n");
                    }
                    break;
                }
                case 3: {
                    try {
                        System.out.print("Введите число, которое хотите сконвертировать: ");
                        String bin = sc.next();
                        System.out.println("Результат конвертации: " + ConversionNumbers.toDex(bin) + "\n");
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage() + "\n");
                    }
                    break;
                }
                case 4: {
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Такого пункта меню нет. Введите корректный пункт меню: ");
                    choice = sc.nextInt();
                    break;
                }
            }
        }
    }
}