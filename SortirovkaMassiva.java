import java.io.IOException;
import java.util.Arrays;

public class SortirovkaMassiva {
    public static void main (String [] args){
      int arr[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
      int a, b, t, size;
      size = 10;
              System.out.println("Исходный массив:\n" + Arrays.toString(arr));
    for (a=1;  a < size; a++) {
        for (b = size-1; b>= a; b--){
            if (arr[b-1]<arr[b]) {
                t = arr[b];
                arr [b] = arr[b-1];
                arr[b-1] = t;
            }
        }
    }
    System.out.println("Отсортированный массив");
    for(int i = 0; i<size; i++) System.out.println(" " + arr[i]);
    }
}