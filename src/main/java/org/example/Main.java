package org.example;

public class Main {
    public static void main(String[] args) {

        String[][] array = {

                {"10", "20", "30", "40"},

                {"50", "60", "70", "80"},

                {"90", "100", "200", "300"},

                {"400", "500", "600", "700"}

        };
        try {

            int result = sumArrayElements(array);

            System.out.println("Сумма элементов: " + result);

        } catch (MyArraySizeException | MyArrayDataException e) {

            System.out.println("Ошибка: " + e.getMessage());

        }

    }
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4 || array[0].length != 4) {

            throw new MyArraySizeException("Неверный размер");

        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                try {

                    sum += Integer.parseInt(array[i][j]);

                } catch (NumberFormatException e) {

                    throw new MyArrayDataException("Неверные данные (" + i + "," + j + ")");

                }

            }

        }

        return sum;
    }
}