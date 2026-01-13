import java.util.*;

public class WeakestSoldier {
    static class Row implements Comparable <Row>{
        int Soldier ;
        int Idx ;

        public Row(int Soldier,int Idx){
            this.Soldier = Soldier;
            this.Idx = Idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.Soldier == r2.Soldier){
                return this.Idx - r2.Idx;
            }else{
                return this.Soldier-r2.Soldier;
            }
        }
    }
    public static void main(String[] args) {
        int Army[][] = {{1,1,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i = 0; i<Army.length; i++){
            int count = 0;
            for (int j = 0; j<Army[i].length;j++){
                count += Army[i][j] == 1 ? 1:0;
            }
            pq.add(new Row(count, i));
        }
        for(int i = 0;i<k; i++){
            System.out.println("Row"+pq.remove().Idx);
        }
    }
}
