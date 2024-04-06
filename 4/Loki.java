import java.util.HashMap;
import java.util.*;

public class Loki {
  public static void main(String args[]){
    int DieA[] = {1,2,3,4,5,6};
    int DieB[] = {1,2,3,4,5,6};

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<6;i++){
      for(int j=0;j<6;j++){
        int x = DieA[i] + DieB[j];
        map.put(x,map.getOrDefault(x,0)+1);
      }
    }

    int A[] = new int[6];
    int B[] = new int[6];
    for(Map.Entry<Integer,Integer> i : map.entrySet()){
      
      int sum = i.getKey();
      int count = i.getValue();

      for(int j : DieA){
        if(sum - j >= 1 && sum - j <= 6){
          A[j-1] += count;
        }
      }

      for(int j : DieB){
        if(sum - j >= 1 && sum - j <= 6){
          B[j-1] += count;
        }
      }
    }

    for(int i=0;i<A.length;i++){
      if(A[i] > 4){
        int t = A[i] - 4;
        A[i] -= t;
        B[i] += t;
      }
    }

    System.out.println("The DieA become:");
    for(int i : A){
      System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("The DieB become:");
    for(int i : B){
      System.out.print(i+" ");
    }
  }
}
