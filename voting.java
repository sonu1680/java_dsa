
import java.util.Scanner;

class voting {
    public static void main(String[] args) {

        System.out.println("Enter age");

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >=18) {

            System.out.println("Eligible for voting" + " " + age);
        } else {
            System.out.println("Not Eligible for voting" + " " + age);
        }

        scan.close();

    }

}
