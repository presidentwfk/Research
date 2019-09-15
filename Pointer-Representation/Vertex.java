import java.util.List;

public class Vertex {
	
	private List<TwitterNode> connections;
	private int profile;
	
	public Vertex(List<TwitterNode> c) {
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
