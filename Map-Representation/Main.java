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
	         BufferedReader br = new BufferedReader(new FileReader("../twitter-2010.txt"));
	         while ((thisLine = br.readLine()) != null) {
	        	if(Character.isDigit(thisLine.charAt(0))) {
		         	String[] s = thisLine.split(" ");
		        	//System.out.println("Numbers: " + s.length);
                                //if(s.length > 1) {
			        int first = Integer.parseInt(s[0]);
			        int second = Integer.parseInt(s[1]);
			        //System.out.println(first + " " + second);
			        twitterGraph.addVertex(first);
			        //System.out.println(twitterGraph.getAdjVertices(first));
			        twitterGraph.addVertex(second);
			        twitterGraph.addEdge(first, second);
                                linesParsed++;
		        	//}
	        	}
	         }   
	         br.close();
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

	      long stopTime = System.currentTimeMillis();
              long elapsedTime = stopTime - startTime;
              System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
              System.out.println("Lines parsed: " + linesParsed);

	}        
}

