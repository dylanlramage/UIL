import java.util.*;
import java.io.*;

public class hottestDay {
public static void main(String[] args) throws IOException{
Scanner scan = new Scanner(new File("input.dat"));
String day;
Double temp;
String day2;
Double temp2;
int count=0;
while(scan.hasNext()){
  day=scan.next();
  temp=scan.nextDouble();
  while(count<4){
    day2=scan.next();
    temp2=scan.nextDouble();
    if(temp2>temp){
      day=day2;
      temp=temp2;
    }
    else
      day=day;
    count++;
  }
  System.out.println(day+" had the hottest temperature.");
  count=0;
}
}
}
