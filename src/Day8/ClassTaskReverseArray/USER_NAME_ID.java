package Day8.ClassTaskReverseArray;
import java.util.Scanner;
public class USER_NAME_ID {
        public static void main(String[] args) {
            String userId = "Sandy@123";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your user id : ");
            String InputId = sc.nextLine();
            if (InputId.equals(userId)) {
                System.out.println("Welcome");
            } else {
                System.out.println("Enter correct user id");
            }

        }
}
