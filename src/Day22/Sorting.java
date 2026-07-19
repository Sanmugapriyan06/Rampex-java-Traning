package Day22;
import java.util.Arrays;
public class Sorting {


    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3,6};
        bubblesort(arr);
    }

    public static void bubblesort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {


            for (int j = 0; j < n-1; j++) {
                if ((arr[j] > arr[j + 1])) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}

