package cinemaBooking;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        System.out.println("Cinema:");
        System.out.print(" ");
        int row = 8;
        int column = 7;

        for (int i = 1; i <= row; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i < column; i++) {

            System.out.printf("%d S S S S S S S S\n", i);
        }
    }

    //<60 --> 10$
    //>60 --> front half 10$ back half 8$ if odd number of total rows first half would be full number


    /*int getRowNColumns() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rowCount = scanner.nextInt();
        System.out.println("Enter the number of rows");
        int columnCount = scanner.nextInt();

        return rowCount, columnCount;

    }*/
}
