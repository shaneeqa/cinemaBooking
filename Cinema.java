package cinemaBooking;

import java.util.Scanner;

public class Cinema {
    private Scanner sc;
    int row, column;
    char[][] seats;

    public Cinema() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.seatingArrangement();
        cinema.bookSeat();
    }

    void userInput() {
        do {
            System.out.println("Enter the number of rows");
            row = sc.nextInt();
            if (row > 9)
                System.out.println("MAXIMUM NUMBER OF ROWS CAN BE 9 OR LESS");
        } while (row > 9);

        System.out.println("Enter the number of columns");
        column = sc.nextInt();
    }

    void printHeader() {
        System.out.println("Cinema:");
        System.out.print("  ");

        for (int a = 1; a <= column; a++) {
            System.out.printf("%d ", a);
        }
        System.out.println();
    }

    void printSeats() {
        printHeader();

        int x = 1;

        for (char[] seat : seats) {
            System.out.print(x + " ");
            for (char c : seat) {
                System.out.print(c + " ");
            }
            x++;
            System.out.println();
        }
    }

    void seatingArrangement() {
        userInput();

        seats = new char[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                seats[i][j] = 'S';
            }
        }

        printSeats();
    }

    void bookSeat() {
        System.out.println("\n====Seat Booking====");

        int r, s;

        while (true) {
            System.out.println("Enter a row number");
            r = sc.nextInt();

            if (r <= 0 || r > row) {
                System.out.println("WRONG INPUT: Entered row number is not matching. Maximum row count is " + row);
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter a seat number in that row");
            s = sc.nextInt();
            if (s <= 0 || s > column) {
                System.out.println("WRONG INPUT: Entered column number is not matching. Maximum column count is " + column);
            } else {
                break;
            }
        }

        seats[r - 1][s - 1] = 'B';

        printSeats();

        /**
         * ticket prices
         */
        if (row * column < 60 ) {
            System.out.println("Ticket Price: " + 10);
        } else {
            if(r<row/2){
                System.out.println("Ticket Price: " +10);
            } else {
                System.out.println("Ticket Price: " + 8);
            }
        }
    }
}
