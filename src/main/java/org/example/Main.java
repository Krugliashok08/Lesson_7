package org.example;

public class Main {
    static int sizeA = 4;
    static int sizeB = 4;
    public static void check(String[][] array) throws MyArraySizeException {
        if (array.length!= sizeA || array[0].length!= sizeB) throw new MyArraySizeException();
    }
    public static Integer getMain(String [][] array) throws MyArrayDataException, MyArraySizeException {
        check(array);
        Integer result = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[0].length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException ("Ошибка: " +i +"," +j);
        }
        return result;
    }
}