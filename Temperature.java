import java.util.*;
import java.io.*;

public class Temperature {
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("input.dat"));
    double temp = scan.nextDouble();
    while (scan.hasNextDouble() || scan.hasNextInt()){
      if(temp>32.0){
        System.out.println("Not below freezing.");
      }
      else{
        System.out.println("Below freezing.");
      }
      temp=scan.nextDouble();
    }
  }
}
