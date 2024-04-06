import java.util.*;
 class Combinations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of dice: ");
    int n = sc.nextInt();
    System.out.println("The total combinations are:");
    int totalCombinations = (int)Math.pow(6,n);
    System.out.println(totalCombinations);

    // 6 sides of die
    int DieA[] = {1,2,3,4,5,6};
    int DieB[] = {1,2,3,4,5,6};

    System.out.println("The Combinations are:");
    for(int i=0;i<6;i++){
      for(int j=0;j<6;j++){
        System.out.print("("+DieA[i]+","+DieB[j]+"), ");
      }
      System.out.println();
    }

    
  }
}