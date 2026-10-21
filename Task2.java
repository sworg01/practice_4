
import java.util.Arrays;

public class Task2 {

    public static int findMaxByIndex(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null!!");
        }

        if (array.length == 0) {
            throw new IndexOutOfBoundsException("Масив порожній!!");
        }

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int number : array) {
            if (index % 6 == 0 && number > max) {
                max = number;
            }
            index++;
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {10, 2, 3, 4, 5, 6, 20, 8, 9, 10, 11, 12, 15},
            {-5, -2, -3, -4, -5, -6, -1},
            {7, 3, 9},
            {}
        };

        for (int[] array : tests) {
            try {
                System.out.println(
                    "Масив: " + Arrays.toString(array)
                    + " -> Максимальний елемент з індексом, "
                    + "кратним 6: " + findMaxByIndex(array)
                );
            } catch (IndexOutOfBoundsException |
                     NullPointerException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        try {
            findMaxByIndex(null);
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
