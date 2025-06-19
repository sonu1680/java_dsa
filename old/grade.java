package old;

import java.util.Scanner;

class grade {
    public static void main(String[] args) {

        System.out.println("Enter marks");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >=90) {

            System.out.println(" a grade:" + " " + number);
        } else if (number >=50 && number<=90) {
            System.out.println("b grade:" + " " + number);
        } else {
            System.out.println("c grade:" + " " + number);
        }

        scan.close();

    }

}
