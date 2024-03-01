package org.example;


import static org.example.Main.getMain;
public class Array {
    static String[][] negative1 = {{"4", "5", "6"}, {"1", "2", "3"}, {"7", "8", "9"}};
    static String[][] negative2 = {{"0", "1", "2", "3"}, {"3", "2", "1", "0"}, {"a", "a", "a", "a"}, {"b", "b", "b", "b"}};
    static String[][] positive = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "1", "2", "3"}, {"4", "5", "6", "7"}};
    public static void main(String[] args) {

        try {
            System.out.println("Сумма массива: " + getMain(positive) + " - Верно");
        } catch (MyArraySizeException | MyArrayDataException ex) {}

        try {
            System.out.println("Сумма массива: " + getMain(negative1));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println("Не верно");
        }
        try {
            System.out.println("Сумма массива: " + getMain(negative2));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println("Не верные данные");
        }
    }
}
