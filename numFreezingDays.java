import java.util.*;
import java.io.*;

public class numFreezingDays {
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("input.dat"));
    double x = 0.0;
    int count = 0;
    while(scan.hasNextLine()){
      String[] line = scan.nextLine().split(",");
      double[] nums = new double[line.length];
      for(int i=0; i<line.length; i++){
        line[i]=line[i].trim();
        nums[i]=Double.parseDouble(line[i]);
        if(nums[i]<=32){
          count++;
        }
      }
      System.out.println("There were "+count+" days below freezing.");
      count = 0;
      }
    }
  }
