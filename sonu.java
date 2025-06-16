public class sonu {

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr2[] = new int[arr.length];

        for (int i = 0; i <= arr.length - 3; i++) {
            arr2[i] = findMax(arr[i], arr[i + 1], arr[i + 2]);
        }

        arr2[arr.length - 2] = Math.max(arr[arr.length - 2], arr[arr.length - 3]);
        arr2[arr.length - 1] = arr[arr.length - 1];

        for (int a : arr2) {
            System.out.print(a + " ");
        }
    }
}
