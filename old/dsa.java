package old;

import java.util.Scanner;

class dsa {
    public static void main(String[] args) {

        System.out.println("Enter number");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0) {

            System.out.println("number is positive:" + " " + number);
        } else if (number < 0) {
            System.out.println("numbe is negative:" + " " + number);
        }
        else{
            System.out.println("numbe is 0:" + " " + number);
        }

        scan.close();

    }

}
