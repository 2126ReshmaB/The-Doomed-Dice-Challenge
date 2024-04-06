import java.util.*;

class Distribution {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int DieA[] = {1,2,3,4,5,6};
    int DieB[] = {1,2,3,4,5,6};

    System.out.println("Here are the total possible combinations:");
    for(int i=0;i<6;i++){
      for(int j=0;j<6;j++){
        System.out.print("("+DieA[i]+","+DieB[j]+"), ");
      }
      System.out.println();
    }

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<6;i++){
      for(int j=0;j<6;j++){
        int x = DieA[i] + DieB[j];
        map.put(x,map.getOrDefault(x,0)+1);
      }
    }
    
    for(Map.Entry<Integer,Integer> i : map.entrySet()){
      System.out.println("The sum "+i.getKey()+" occurs "+i.getValue()+" times");
    }

  }

}