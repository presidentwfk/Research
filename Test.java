package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("c:/Users/Will/Downloads/twitter_graph.txt"));
			
			for(int i = 0; i < 100; i++) {
				String thisLine = br.readLine();
				String[] lineArr = thisLine.split(" ");
				System.out.println(thisLine + ": " + lineArr.length);
			}
		}
		catch(Exception e) {
			
		}
		
		
	}
}
