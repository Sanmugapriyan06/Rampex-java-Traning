package Day8.ClassTaskReverseArray;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[]args){
        String[]menu={"veg","non-veg","sweets","beverages"};
        String[] m1=new String[menu.length];
        String[] m2=new String[menu.length];
        for(int i=0;i<menu.length;i++) {
            m1[i] = menu[menu.length - 1-i];
        }
        for(int i=0;i<m1.length;i++){
            m2[i]=m1[m1.length-1-i];

        }
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));


        }
    }


