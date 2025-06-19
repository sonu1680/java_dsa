package old;

import java.util.Scanner;

class evenodd {
    public static void main(String[] args) {

        System.out.println("Enter number");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number %2== 0) {

            System.out.println("number is even:" + " " + number);
        }  else {
            System.out.println("numbe is odd:" + " " + number);
        }

        scan.close();

    }

}
