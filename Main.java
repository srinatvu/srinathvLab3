import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner a = new Scanner(System.in);
  System.out.println("Please enter a number:");
  int i = a.nextInt();
  if(i>=0){
    for(int j = 0;i>=j;i--){
      System.out.println(i + "\n");
    }
  System.out.println("Blast off!");
  }
  else{
    for(int j = 0;i<=j;i++){
      System.out.println(i + "\n");
    }
  System.out.println("Blast off!");
  }
  }
}