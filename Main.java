import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int year = sc.nextInt();

        // checking whether it is a leap year or not
        // using isLeapYear() method of LeapYear class
        System.out.println(LeapYear.isLeapYear(year));

        // closing resource
        sc.close();
    }
}
