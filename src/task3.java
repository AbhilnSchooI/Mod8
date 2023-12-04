import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;
        int year = inputHelper.getRangedInt(scan, 1950, 2010, "Input the year");
        int month = inputHelper.getRangedInt(scan, 1,12,"Input the month");

        if(month == 2){
            day = inputHelper.getRangedInt(scan, 1,29,"Input the day");
        }else if(month == 4 || month == 6 || month == 9 || month == 11 ){
            day = inputHelper.getRangedInt(scan, 1,30,"Input the day");
        }else{
            day = inputHelper.getRangedInt(scan, 1,31,"Input the day");
        }

        int hour = inputHelper.getRangedInt(scan, 1,24,"Input the hour");
        int min = inputHelper.getRangedInt(scan, 1,59,"Input the min");
        System.out.printf("\n%-10s %5d", "year:", year);
        System.out.printf("\n%-10s %5d", "Month:", month);
        System.out.printf("\n%-10s %5d", "Day:", day);
        System.out.printf("\n%-10s %5d", "Hour:", hour);
        System.out.printf("\n%-10s %5d", "Minute:", min);
    }
}
