
import java.util.Scanner;

class leapyear {
    public static void main(String[] args) {

        System.out.println("Enter year");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {

                    System.out.println("leapyear");
                }
            } else {
                System.out.println("not leap year");
            }
            System.out.println("not leap year");

        }

        scan.close();

    }

}
