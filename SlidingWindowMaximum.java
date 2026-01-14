import java.util.*;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair> {
        int val, idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int n = arr.length;

        int[] result = new int[n - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // first window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        result[0] = pq.peek().val;

        // remaining windows
        for (int i = k; i < n; i++) {
            while (pq.peek().idx <= i - k) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            result[i - k + 1] = pq.peek().val;
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
