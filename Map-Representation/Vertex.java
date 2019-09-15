public class Vertex {
	int label; 
	Vertex(int i){
		label = i;
	}
	
	@Override
	public int hashCode() {
		return label;
	}
	@Override
	public boolean equals(Object o) {
		return ((Vertex) o).getLabel() == label;
	}
	
	
	int getLabel() {
		return label;
	}
	
	
}
