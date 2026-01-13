import java.util.*;

public class InsertInMinHeap {
    public static void add( ArrayList<Integer> arr , int data){
        arr.add(data);
        int childIdx = arr.size()-1;
        int parentIdx = (childIdx -1)/2;
        while (arr.get(childIdx)<arr.get(parentIdx)) {
            // swap
            int temp = arr.get(childIdx);

            arr.set(childIdx, arr.get(parentIdx));
            arr.set(parentIdx, temp);
            childIdx = parentIdx;
            parentIdx = (parentIdx-1)/2;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(2,3,4,8,9));
        System.out.println(arr);
        add(arr, 1);
        System.out.println(arr);
        add(arr, 0);
        System.out.println(arr);
        add(arr, 5);
        System.out.println(arr);
    }
}
