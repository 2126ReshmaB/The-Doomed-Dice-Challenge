import java.util.HashMap;
import java.util.*;

public class Probability {
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

    for(Map.Entry<Integer,Integer> i : map.entrySet()){
      double ans = (double)i.getValue()/36;
      System.out.print("The Probability of getting sum "+i.getKey()+" is "+i.getValue()+"/"+36+" -> ");
      System.out.printf("%.2f",ans);
      System.out.println();
    }
  }
}
