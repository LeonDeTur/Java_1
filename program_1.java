// Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите номер треуголного числа (целое число): ");
        int num = iScanner.nextInt();
        int result = num * (num + 1)/2;
        System.out.printf("Треуголное число под номером " + num + ": " + result);
        iScanner.close();
    }
}