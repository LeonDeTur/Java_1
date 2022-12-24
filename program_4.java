// Реализовать простой калькулятор 
// ("введите первое число"... "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")

import java.util.Scanner;;

public class program_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите первое число: ");
        int b = iScanner.nextInt();
        System.out.printf("Введите операцию: ");
        String input = iScanner.next();
        iScanner.close();
        char operator = input.charAt(0);
        int result = 0;
        if (operator == '+'){result = a + b;}
        else if (operator == '+'){result = a + b;}
        else if (operator == '+'){result = a + b;}
        else if (operator == '+'){result = a + b;}
        else if (operator == '+'){result = a + b;}
        System.out.printf("Результат операции: " + result);
    }
}
