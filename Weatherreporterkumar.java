package javapratice;


import java.util.Scanner;

public class Weatherreporterkumar {
    public static void main(String[] args) {
        System.out.println("Welcome to Kumar Weather Reporting Console App");
        System.out.println("------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the City you want: ");
        String city = scanner.nextLine();
        System.out.println("Getting Weather report for " + city);
    }
}



