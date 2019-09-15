package main;

import java.util.List;

public class TwitterNode {
	
	private List<TwitterNode> connections;
	private int profile;
	
	public TwitterNode(List<TwitterNode> c) {
		connections = c;
	}
	
	public void addConnection(TwitterNode n) {
		connections.add(n);
	}
	
	public int getProfile() {
		return profile;
	}
	
	public List<TwitterNode> getConnections(){
		return connections;
	}
}
