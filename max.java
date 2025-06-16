
import java.util.Scanner;

class max {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = scan.nextInt();
        System.out.println("Enter number 2");

        int number2 = scan.nextInt();

       System.out.println("Max of number is "+Math.max(number1,number2));

        scan.close();

    }

}
