import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username;
        boolean done = false;

        do {
            username = inputHelper.getNonZeroLenString(scan, "Enter a username");
            if(!username.equals(" ")){
                done = true;
            }else{
                System.out.println("you cant enter a blank username");
            }
        } while (!done);

        System.out.println("ther username you entered is: " + username);
    }
}
