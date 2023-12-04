import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        double price;
        double total = 0;
        boolean keepgoing = true;

        do {
             price = inputHelper.getRangedDouble(scan,.50,9.99,"Entered the item price: $");
            total = total + price;
            keepgoing = inputHelper.YNConfirm(scan, "Do you want to continue? Y/N");
            if(keepgoing == false){
                done = true;
            }
        } while (!done);
        System.out.printf("%-18s%5.2f", "Total cost in $: ", total);
    }
}
