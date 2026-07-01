package Day7.ClassTask.Array;
import java.util.Arrays;
public class ArrayMAX {
    public static void main(String[]args){
        int[]num={1,2,3,5,4};
        int SMAX=num[0];
        int MAX=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>MAX){
                SMAX=MAX;
                MAX=num[i];
            }
            else if(num[i]>SMAX){
                SMAX=num[i];
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(SMAX);
    }
}
