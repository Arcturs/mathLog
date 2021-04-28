package ru.vsu.csf.Sashina;

import java.util.List;
import java.math.*;

public class Operations {

    public static void operateWithNumbers (List<String> list) {
        if (list == null) {
            System.out.println("Mistake");
        } else {
            int k = 1;
            for (String value : list) {
                String [] array = value.split(" ");
                System.out.print("Пример №" + k + ": ");
                BigInteger x = new BigInteger(array[0]);
                System.out.print("первое число: " + array[0] + ", второе число: " + array[1] + " ");
                BigInteger y = new BigInteger(array[1]);
                int n = array[0].length();
                boolean flag = false;
                BigInteger ten = new BigInteger("10");
                if (n % 2 == 1) {
                    n++;
                    x = x.multiply(ten); //оба умножения нужны для нормального выполнения алгоритма
                    y = y.multiply(ten);
                    flag = true;
                }
                BigInteger result = Karatsuba.multiply(x, y, n);
                if (flag) {
                    result = result.divide(ten).divide(ten);
                }
                System.out.print("|| Результат: " + result);
                System.out.println();
                k++;
            }
        }
    }

    public static void operateWithArrays (List<String> list) {
        if (list == null) {
            System.out.println("Mistake");
        } else {
            int k = 1;
            for (String value : list) {
                System.out.print("Пример №" + k);
                String [] str = value.split(" ");
                int [] arr = new int [str.length];
                System.out.print(": исходный массив: ");
                for (int i = 0; i < str.length; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                    System.out.print(arr[i] + ", ");
                }
                MergeSort.sort(arr, 0, str.length - 1);
                System.out.print("|| результат: ");
                for (int i = 0; i < str.length; i++) {
                    System.out.print(arr[i] + ", ");
                }
                System.out.println();
                k++;
            }
        }
    }
}
