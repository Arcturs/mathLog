package ru.vsu.csf.Sashina;

public class MergeSort {

    public static void merge(int [] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int leftPart[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            leftPart[i] = a[l + i];
        }
        int rightPart[] = new int[n2];
        for (int j = 0; j < n2; j++) {
            rightPart[j] = a[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) { //слияние
            if (leftPart[i] <= rightPart[j]) {
                a[k] = leftPart[i];
                i++;
            } else {
                a[k] = rightPart[j];
                j++;
            }
            k++;
        } //правая часть закончилась, а в левой части еще остались элементы
        //тогда, мы еще копируем в A оставшиеся эл-ты, чтобы они не пропали
        //делятся эл-ты так, что в левой части больше или столько же, чем в правой
        //так что в цикле для правой части нет нужды
        while (i < n1) {
            a[k] = leftPart[i];
            i++;
            k++;
        }
    }

    public static void sort(int [] a, int l, int r) {
        if (l < r) {
            int m =l + (r - l)/2;
            sort(a, l, m); //делим на левую часть
            sort(a, m + 1, r); //делим на правую часть
            merge(a, l, m, r); //слияние двух частей
        }
    }
}
