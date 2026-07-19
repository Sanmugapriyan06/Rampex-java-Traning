package Day17.ClassTask;
import java.util.ArrayList;
import java.util.LinkedList;
public class Arraylinkedlist {
    public static void main(String[]args)throws InterruptedException{
        ArrayList<Integer> arr =new ArrayList();
        LinkedList<Integer> li=new LinkedList<>();
        long lstart=System.nanoTime();
        for(int i=0;i<10000;i++){
            li.add(i);
        }
        long lend=System.nanoTime();
        long start=System.nanoTime();
        for(int i=0;i<10000;i++){
            arr.add(i);
        }

            long end=System.nanoTime();
            System.out.println("Added in array");


        System.out.println(System.nanoTime());
    }
}
