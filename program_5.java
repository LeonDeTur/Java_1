/*
Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 
*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;;
// функция преобразования строки в символьный массива в обратном порядке
public class program_5 {
    public static char[] GetNumList(String input){
        char[] resultList = new char[input.length()-1];
        int j = 0;
        for (int i = input.length(); i > -1; i--){
            resultList[j] = input.charAt(i);
            j++;
        }
        return resultList;
    }
// функция поиска суммы слагаемых
    public static char[] SummandLists (char[] a, char[] b, int maxLength, int resultLength){
        char[] result = new char[resultLength];
        for (int i = 0; i < maxLength; i++){
            result[i] = '!';
        }

        for (int i = 0; i < maxLength; i++){
            if ((a[i] != '?') & (b[i] != '?')){
                int tmpA = a[i] - '0';
                int tmpB = b[i] - '0';
                int tmpResult = tmpA + tmpB;
                if ((tmpResult < 10) & (result[i] == '!')){
                    result[i] = (char)tmpResult;
                }
                else if ((tmpResult < 10) & (result[i] != '!')){
                    tmpResult = tmpResult + (int)result[i];
                    if (tmpResult < 10){
                    result[i] = (char)(tmpResult);
                    }
                    else{
                        result[i] = (char)(tmpResult % 10);
                        result[i+1] = (char)(tmpResult - tmpResult % 10);
                    }
                }
                else{
                    if (result[i] == '!'){
                        result[i] = (char)(tmpResult % 10);
                        result[i+1] = (char)(tmpResult - tmpResult % 10);
                    }
                    else{
                        result[i+1] = (char)(tmpResult - tmpResult % 10);
                        result[i] = (char)(tmpResult % 10 + (int)result[i]);
                    }
                }
            }
            else if((a[i] != '?') | (b[i] != '?')){
                if (a[i] == '?'){
                    result[i] = b[i];
                }
                else if(a[i] == '?'){
                    result[i] = a[i];
                }
            }
            else{
                continue;
            }
            
        }

        return result;
    }
// фунция преобразования массива в число
    public static int GetSummandNum (char[] array, int arrayLength){
        int result;
        if (array[0] != '!'){
            result = (int)(array[0]);
        }
        else{
            result = 0;
        }
        for (int i = 1; i < arrayLength; i++){
            if (array[i] != '!'){
                result += ((int)(array[i])) * 10^i;
            }
            else{
                continue;
            }
        }
        return result;
    }
// функция находит и вставляет на место знаков ? подходящие значения
    public static char[] GetResult (char[] array1, char[] array2, int differrence, int sum){
        String tmpArray1 = new String(array1);
        String tmpArray2 = new String(array2);
        int minArrayLength;
        if (tmpArray1.length() < tmpArray2.length()){
            minArrayLength = tmpArray1.length();
        }
        else{
            minArrayLength = tmpArray2.length();
        }

        char[] differenceArray = new char[String.valueOf(differrence).length()];
        for (int i = 0; i < String.valueOf(differrence).length(); i++){
            differenceArray[i] = (char)(differrence % 10);
            differrence = differrence / 10;
        }

        for (int i = 0; i < minArrayLength; i++){
            
        } 
    }

    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число в виде число + ? (например, 2?): ");
        String q = iScanner.next();
        System.out.printf("Введите второе число в виде число + ? (например, ?5): ");
        String w = iScanner.next();
        System.out.printf("Введите результат уравнения (целое число): ");
        int e = iScanner.nextInt();
        iScanner.close();

        char[] qList = GetNumList(q);
        char[] wList = GetNumList(w);

        int maxArrayLength;
        if (q.length() >= w.length()){maxArrayLength = q.length();}
        else{maxArrayLength = w.length();}


        int resultSize = e;
        int count = 0;
        while (resultSize > 9){
            resultSize = resultSize / 10;
            count++;
        }
        resultSize = count; 

        char [] result_array = SummandLists(qList, wList, maxArrayLength, resultSize);

        int summand = GetSummandNum(result_array, resultSize);

        int difference = e - summand;

    }
}
