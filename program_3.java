// Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.List;

import javax.swing.ListModel;

public class program_3 {
    public static void main(String[] args) {
        
    int[] numArray = new int [1000];
    for (int i = 0; i < (numArray.length); i ++){
        numArray[i] = i + 1;
    }

    for (int i = 2; i < (numArray.length); i ++){
        for (int j = 0; j < (numArray.length - 1); j ++){
            if ((numArray[j] % i == 0) & (numArray[j] != i)){
                numArray[j] = 0;
            }
        }
    }
    int count = 0;
    for (int i = 0; i < numArray.length; i ++){
        if (numArray[i] == 0){
            count++;
        }
    }
    int[] resultArray = new int[1000 - count];
    count = 0;
    for (int i = 0; i < numArray.length; i++){
        if (numArray[i] != 0){
            resultArray[count] = numArray[i];
            count++;
        }
    }
    System.out.printf("Список простых чисел до 1000: \n");
    for (int i = 0; i < resultArray.length; i++){
        System.out.println(resultArray[i]);
    }

    }
}
