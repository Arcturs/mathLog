package ru.vsu.csf.Sashina;

public class Main {

    public static void main(String[] args) {
        Operations.operateWithNumbers(fromDocument.processFile("Kexamples.txt"));
        System.out.println();
        System.out.println("____________________________________________________________");
        System.out.println();
        Operations.operateWithArrays(fromDocument.processFile("Mexamples.txt"));
    }
}
