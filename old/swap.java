package old;
public class swap {
    public static void main(String args[]) {

        int arr[] = { 12, 43, 54, 65, 3, 42, 4, 6 };

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] > arr[arr.length - 1 - i]) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;

            }
        }
    

    for(int a:arr){
        System.out.print(a+",");
    }
    
}
}