package se.lexicon.falak.random_num;


import java.util.*;
public class App {
	
    public static void main( String[] args )
    {
      int c;
      //random integers in [0,100]
      Random t=new Random();
      for (c=1;c<=5;c++) {
    	  System.out.println(t.nextInt(300));
      }
      
      // new program
      int[]numbers=new int[] {10,20,30,40,50};
      int sum =0;
      for ( int i=0;i<=numbers.length;i++) {
          sum =sum +numbers[i];
          double avg=sum/numbers.length;
          System.out.println(" avrage is"+avg);
      } 
     
      
    }
    
   
}

