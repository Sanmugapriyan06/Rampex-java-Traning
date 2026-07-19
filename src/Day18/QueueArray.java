package Day18;
import java.util.ArrayDeque;
public class QueueArray {
    public static void main(String[]args){
        String[]task={"download","compile","Task","deploy"};
        ArrayDeque<String>dq=new ArrayDeque<String>();
        for(String t:task) {
            dq.add(t);

        }
        for(String t:dq){
            System.out.print(t+"->");
        }
    }
}
