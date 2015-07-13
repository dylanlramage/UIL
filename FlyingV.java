import java.util.*;
import java.io.*;

public class FlyingV {
public static void main(String[] args) throws IOException{
Scanner scan = new Scanner(new File("input.dat"));
String word;
int count=0;
while(scan.hasNextLine()){
  word=scan.nextLine();
  for(int i=0; i<word.length(); i++){
    count=i+1;
    while(count>0){
        System.out.print(word.substring(i,i+1));
        count--;
    }
      System.out.println();
  }
  for(int j=word.length()-2; j>=0; j--){
    count=j+1;
    while(count>0){
        System.out.print(word.substring(j,j+1));
        count--;
    }
      System.out.println();
  }
  System.out.println();

}
}
}
