//stack with arraylist

import java.util.ArrayList;

public class StackWithArrayList {

    static class StackB {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            //System.out.println(list.size() == 0 ? true : false);
            return list.size() == 0 ;
            
        }

        public static void push(int data){
            list.add(data);
        }
        public static void pop(){
          
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            System.out.println("removed: "+top);
        }
        public static void peek(){
            System.out.println(list.get(list.size()-1));
        }
    }

    public static void main(String args[]) {
        StackB s = new StackB();
        s.isEmpty();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);   
        while(!s.isEmpty()){
            System.out.println(s.isEmpty());
            s.peek();
            s.pop();

        }

    }



}
