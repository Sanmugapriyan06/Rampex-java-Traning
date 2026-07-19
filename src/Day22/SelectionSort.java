package Day22;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[]args){
        int[] arr={2,1,3,5,4};
        selectionsort(arr);
    }
    public static void selectionsort(int [] arr) {
        int minIndex = 0;
        int aMin=0;
        int temp;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[aMin];
            arr[aMin]=temp;
            aMin++;
        }
        System.out.print(Arrays.toString(arr));
    }

}
