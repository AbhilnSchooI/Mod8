import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int favInt = inputHelper.getInt(scan, "Enter your favorite int.");
        double favDouble = inputHelper.getDouble(scan, "enter your favorite double");
        System.out.println("your favorite int is, " + favInt);
        System.out.println("your favorite double is, " + favDouble);
    }

}
