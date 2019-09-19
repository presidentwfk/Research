import java.util.List;
import java.util.ArrayList;

public class Vertex {
	
	private List<Vertex> connections;
	private long profile;
	
	public Vertex(long p) {
		profile = p;
                connections = new ArrayList<Vertex>();
	}
	
	public void addConnection(Vertex n) {
		connections.add(n);
	}
	
	public long getProfile() {
		return profile;
	}
	
	public List<Vertex> getConnections(){
		return connections;
	}
        @Override
        public boolean equals(Object o){
          Vertex v = (Vertex)o;
          if(v.getProfile() == profile){
              return true;
          }
          return false;
        }
}
