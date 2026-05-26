import java.util.*;

public class DeleteMinimumInMinHeap {
    public static void delete(ArrayList<Integer> arr ,int i){

        int last = arr.get(arr.size()-1);
        int first = arr.get(0);

        arr.set(0, last);
        arr.set(arr.size()-1, first);
        arr.remove(arr.size()-1);

        heapify(arr , 0);
    }
    private  static void heapify(ArrayList<Integer> arr , int i){
            int leftChild = 2*i+1;
            int rightChild = 2*i+2;
            int minIdx = i;

            if(leftChild <arr.size()&& arr.get(leftChild)<arr.get(minIdx)){
                minIdx = leftChild;
            }

            if(rightChild <arr.size()&& arr.get(rightChild)<arr.get(minIdx)){
                minIdx = rightChild;
            }

            if(minIdx != i){
                int temp = arr.get(i);

                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(arr, minIdx);
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
