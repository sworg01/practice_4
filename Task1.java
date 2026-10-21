
import java.util.Arrays;

public class Task1 {

    public static int findMaxEven(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        boolean found = false;
        int max = Integer.MIN_VALUE;

        for (int number : array) {
            if (number % 2 == 0) {
                if (!found || number > max) {
                    max = number;
                    found = true;
                }
            }
        }

        if (!found) {
            throw new IllegalArgumentException(
                "Масив не містить парних елементів!!!"
            );
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {3, 8, 5, 12, 7, 4},
            {-8, -2, -6},
            {1, 3, 5, 7},
            {}
        };

        for (int[] array : tests) {
            try {
                System.out.println(
                    "Масив: " + Arrays.toString(array)
                    + " -> Максимальний парний елемент: "
                    + findMaxEven(array)
                );
            } catch (IllegalArgumentException |
                     NullPointerException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        try {
            findMaxEven(null);
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
