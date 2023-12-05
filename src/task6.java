import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String msg = scan.nextLine();
        inputHelper.prettyHeader(msg);
    }
}
