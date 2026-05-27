public class HeapSortAlgorithm {
    public static void heapify(int i , int [] arr , int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left<size && arr[left] > arr[maxIdx]){
        // if(left<size && arr[left] < arr[maxIdx]){ for decreasing order

            maxIdx = left;
        }
        if(right<size && arr[right]> arr[maxIdx]){
        // if(right<size && arr[right]> arr[maxIdx]){ for decreasing order

            maxIdx = right;
        }
        if(maxIdx !=i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(maxIdx, arr, size);
        }
    }
    public static void HeapSort(int[] arr) {
        int size = arr.length;
        for(int i=size/2;i>=0;i--){
            heapify(i , arr , size);
        }

        // sorting
        for(int i=size-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(0, arr, i);
        }
    }
    public static void main(String[] args) {
        int arr [] = {3,2,4,8,6,5,1,0};
        HeapSort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}