package Day3.HOMETASK;
import java.util.Scanner;
public class IF_ELSE {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number:");
            int a=scanner.nextInt();

            if(a>90){
                System.out.println("greater than 90");
            }
            else if(a>50){
                System.out.println("greater than 50");
            }
            else{
                System.out.println("greater than 10");
            }
            scanner.close();
        }
}
