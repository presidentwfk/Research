import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	     Graph twitterGraph = new Graph();
	     String thisLine = null;
	     System.out.println("Working");
	     long startTime = System.currentTimeMillis();
             long linesParsed = 0;
	      try {
	         // open input stream test.txt for reading purpose.
	         BufferedReader br = new BufferedReader(new FileReader("../subset.txt"));
	         while ((thisLine = br.readLine()) != null) {
	        	if(Character.isDigit(thisLine.charAt(0))) {
		         	String[] s = thisLine.split(" ");
		        	long first = Long.parseLong(s[0]);
			        long second = Long.parseLong(s[1]);
			        twitterGraph.addVertex(first);
                                twitterGraph.addConnection(second);
	        	} 
              }   
	         br.close();
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

	      long stopTime = System.currentTimeMillis();
              long elapsedTime = stopTime - startTime;
              System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
              System.out.println("Graph Size: " + twitterGraph.getSize());
	}        
}
