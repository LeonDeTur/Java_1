import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значение факториала: ");
        int num = iScanner.nextInt();
        int result = 1;
        while (num > 1){
            result = result * num;
            num --; 
        }
        System.out.printf("Факториал по " + num + " равен: " + result);
        iScanner.close();
    }
}