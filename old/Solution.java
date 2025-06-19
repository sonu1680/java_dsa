package old;
import java.util.*;
class Solution {
    public static List<Integer> findDuplicates(int[] arr) {
       Set<Integer> ar=new HashSet<>();
       Set<Integer> sonu = new HashSet<>();

  for(int a:arr){
    if(!ar.add(a)){
        sonu.add(a);
    }
  }
return new ArrayList<>(sonu);
    }

    public static void main(String args[]) {

        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> a = findDuplicates(arr);
  

    }
}