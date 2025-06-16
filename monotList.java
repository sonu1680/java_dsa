import java.util.*;

public class monotList {

    public static void monotionic(ArrayList<Integer> list) {

        boolean inc = false;
        boolean dec = false;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= list.get(i + 1)) {
                inc = true;
            }
            if (list.get(i) >= list.get(i + 1)) {
                dec = true;
            }

        }
        System.out.println(dec + "" + inc);
        
        
    }


    public static void lonelyNum(ArrayList<Integer> list) {

        ArrayList<Integer> lone = new ArrayList<>();
        Collections.sort(list);

        for (int i = 1; i < list.size() - 1; i++) {

            if (list.get(i) - 1 != list.get(i - 1) || list.get(i) + 1 != list.get(i + 1)) {

                lone.add(list.get(i));

            }

        }

        System.out.println(lone);

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        lonelyNum(list);

    }
}
