package cinemaBooking;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        int row, column;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        row = sc.nextInt();

        System.out.println("Enter the number of columns");
        column = sc.nextInt();


        if (column * row > 60) {
            int income = (column * (row / 2) * 10) + (column * (row - (row / 2)) * 8);
            System.out.println("Total income: " + income);
        } else {
            System.out.println("Total income: " + column * row * 10);
        }

/*        System.out.println("Cinema:");
        System.out.print(" ");


        for (int i = 1; i <= row; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i < column; i++) {

            System.out.printf("%d S S S S S S S S\n", i);
        }*/
    }
}
