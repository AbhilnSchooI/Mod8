import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = inputHelper.getRegExString(scan, "Enter your SSN: (***-**-****)","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);
        String studentNum = inputHelper.getRegExString(scan,"Enter your Student M number","(M|m)\\d{5}");
        System.out.println("Your student M number is: " + studentNum);
        String menu = inputHelper.getRegExString(scan,"Menu: O - Open  S - Save  V - View   Q - Quit","[OoSsVvQq]");
        System.out.println("You choose: " + menu.toUpperCase());
    }
}
