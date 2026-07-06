package Day3.HOMETASK;
import java.util.Scanner;
public class POSITIVE_NEGATIVE_ODD_EVEN {

        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number : ");
            int a= sc.nextInt();
            if(a>0){
                System.out.println("Positive number");
                if(a%2==0){
                    System.out.println(" Positive Even number");
                }
                else{
                    System.out.println("Positive Odd number");
                }
            }
            else if(a<0){
                System.out.println("Negative number");
                if(a%2==0){
                    System.out.println("negative Even number");
                }
                else{
                    System.out.println("negative Odd number");
                }
            }
            else{
                System.out.println("Neutral number");
            }
            sc.close();
        }
}
