public class arryOddeve{

    public static void main(String[] args) {
        int[] numbers = { 10, 21, 32, 43, 54, 65, 76, 87, 98, 109 };

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }
    }
}
