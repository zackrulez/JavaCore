package Lesson2;

public class Main {
    static String[][] arrayDataError = {{"1", "2", "3", "4"}, {"4", "3", "2", "o"}, {"3", "2", "4", "1"}, {"2", "1", "4", "3"}};
    static String[][] arraySizeError = {{"1", "2"}, {"3", "4"}, {"4", "5"}, {"5", "6"}};
    static String[][] arrayNoError = {{"1", "2", "3", "4"}, {"4", "3", "2", "1"}, {"3", "2", "4", "1"}, {"2", "1", "4", "3"}};

    public static void main(String[] args) {

        try {
            System.out.println("Array sum: " + getSumm(arrayNoError));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Array sum: " + getSumm(arraySizeError));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Array sum: " + getSumm(arrayDataError));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

    }
        static void checkValue(String[][] array) throws MyArraySizeException {
            if(array.length != 4 || array[0].length != 4) throw new MyArraySizeException();
        }
         static Integer getSumm(String[][] array) throws MyArrayDataException,MyArraySizeException{
            checkValue(array);
            Integer result = 0;
            int i = 0;
            int j = 0;
            try {
                for (; i < array.length; i++) {
                    j = 0;
                    for (; j < array.length; j++) {
                        result = result + Integer.parseInt(array[i][j]);
                    }
                }
            } catch (NumberFormatException ex) {
                throw new MyArrayDataException("Position error in: " + i + "," + j);
            }
            return result;
        }
    }

