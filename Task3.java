
import java.util.Arrays;

public class Task3 {

    public static int[] transformArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Масив порожній");
        }

        int max = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[i] = array[i] + max;
            } else if (array[i] == 0) {
                result[i] = 1;
            } else {
                result[i] = array[i] * 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {-5, 0, 3, -2, 7, 4},
            {-10, -5, 0},
            {1, 2, 3},
            {}
        };

        for (int[] array : tests) {
            try {
                System.out.println(
                    "Початковий масив: " + Arrays.toString(array)
                    + " -> Результат: "
                    + Arrays.toString(transformArray(array))
                );
            } catch (IllegalArgumentException |
                     NullPointerException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        try {
            transformArray(null);
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
