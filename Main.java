package main;

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
	      
	      try {
	         // open input stream test.txt for reading purpose.
	         BufferedReader br = new BufferedReader(new FileReader("c:/Users/Will/Downloads/twitter_data.txt"));
	         while ((thisLine = br.readLine()) != null) {
	        	if(Character.isDigit(thisLine.charAt(0))) {
		         	String[] s = thisLine.split("\t");
		        	if(s.length > 1) {
			        	int first = Integer.parseInt(s[0]);
			        	int second = Integer.parseInt(s[1]);
			        	//System.out.println(first + " " + second);
			        	twitterGraph.addVertex(first);
			        	//System.out.println(twitterGraph.getAdjVertices(first));
			        	twitterGraph.addVertex(second);
			        	twitterGraph.addEdge(first, second);
		        	}
	        	}
	         }   
	         br.close();
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}        
}

