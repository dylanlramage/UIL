import java.util.*;
import java.io.*;

public class freezingDays {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("input.dat"));
    int a;
    int b;
    while(scan.hasNext()){
      a = scan.nextInt();
      b = scan.nextInt();
      for(int i = a; i <= b; i++){
        if(i%2!=0){
          System.out.print(i+" ");
        }
      }
      System.out.println();
    }
  }
}
