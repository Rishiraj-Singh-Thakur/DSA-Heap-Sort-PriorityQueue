import java.util.*;

public class DeleteMinimumInMinHeap {
    public static void delete(ArrayList<Integer> arr ,int i){

        // step1 :- swap first to last
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        // step2:- delete last element
        arr.remove(arr.size()-1);

        // step3:- set our minHeap
        Heapify(arr , 0);
    }
    private  static void Heapify(ArrayList<Integer> arr , int i){
            int leftIdx = 2*i+1;
            int rightIdx = 2*i+2;
            int minIdx = i;

            if(leftIdx <arr.size() && arr.get(leftIdx)<arr.get(minIdx)){
                minIdx = leftIdx;
            }
            if(rightIdx <arr.size() && arr.get(rightIdx)<arr.get(minIdx)){
                minIdx = rightIdx;
            }
            if(minIdx !=i){
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                Heapify(arr , minIdx);
            }
        }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(0,2,3,5,6,4,7));
        System.out.println(arr);
        delete(arr ,0);
        System.out.println(arr);
    }
}
