import java.util.Arrays;

/**
 * My second home work
 * @author Nikolay Kasparov
 * @version dated: Jun 30, 2018
 */

public class HW2Lesson {
    public static void main(String args[]) {
        // test for task 1
        invertArray();

        // test for task 2
        fillArray();

        // test for task 3
        changeArray();

        // test for task 5
        searchMinMax();

    }

    /**
     * Задание 1.
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        int i;
        for (i = 0; i < 10; i++)
            if (arr[i] < 1) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        System.out.println("Результат изменений: " + Arrays.toString(arr));
    }

    /**
     * Задание 2.
     * Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void fillArray() {
        int[] a = new int[8];
        System.out.println("Значение до цикла: " + Arrays.toString(a));
        for (int x = 0; x < a.length; x++) {
            int[] mass = {0, 3, 6, 9, 12, 15, 18, 21};
            a[x] = mass[x];
        }
        System.out.println("Значение после цикла: " + Arrays.toString(a));
    }

    /**
     * Задание 3.
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    public static void changeArray() {
        int[] s = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Значение до цикла: " + Arrays.toString(s));
        for (int y = 0; y < s.length; y++) {
            if (s[y] < 6) {
                s[y] = s[y] * 2;
            }
        }
        System.out.println("Значение после цикла: " + Arrays.toString(s));
    }

    /**
     * Задание 5.
     * Задать одномерный массив и найти
     * в нем минимальный и максимальный элементы;
     * P.s. перед выполнением читал Шилдта там было аналогичные задание, которое я практиковал.
     * Поэтому условие (без помощи интернета) считаю выполненым.
     */
    public static void searchMinMax() {
        int[] h = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min, max;
        min = max = h[0];
        for (int k = 0; k < h.length; k++) {
            if (h[k] < min) min = h[k];
            if (h[k] > max) max = h[k];
        }
        System.out.println("Минимум и максимум: "+" " + min + " " + max);
    }

}