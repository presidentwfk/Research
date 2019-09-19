import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	private List<Vertex> adjVertices;
	
	public Graph() {
		adjVertices = new ArrayList<Vertex>();
	}	
	/*public List<Vertex> getAdjVertices(int label){
		return adjVertices.get(new Vertex(label));
	}*/
        public long getSize(){
            return adjVertices.size();
        }
	
	void addVertex(long label) {
            /*
            int i = adjVertices.indexOf(new Vertex(label));
            if(i == -1){
              adjVertices.add(new Vertex(label));
              return adjVertices.size() - 1;
            }
            return i;*/
            if(adjVertices.size() > 0){
                if(adjVertices.get(adjVertices.size() - 1).getProfile() < label){
                    adjVertices.add(new Vertex(label));
                }
            }
            else{
                adjVertices.add(new Vertex(label));
            }
	}
	
        void addConnection(long label){
            /*int firstIndex = -1;
            int secondIndex = -1;
            for(int i = 0; i < adjVertices.size(); i++){
             if(adjVertices.get(i).getProfile() == label1){
               firstIndex = i;
             } 
             else if(adjVertices.get(i).getProfile() == label2){
               secondIndex = i;
             }
             if(firstIndex != -1 && secondIndex != -1){
               //System.out.println("Test");
               break;
             }
            }
            //System.out.println("First index " + firstIndex + ", Second index " + secondIndex);
            if(firstIndex != secondIndex){
              adjVertices.get(firstIndex).addConnection(new Vertex(label2));
              adjVertices.get(secondIndex).addConnection(new Vertex(label1));
            }
            */
            adjVertices.get(adjVertices.size() - 1).addConnection(new Vertex(label));
            //adjVertices.get(label1).addConnection(new Vertex(label2));
        }
         
	/*void removeVertex(int label) {
	    Vertex v = new Vertex(label);
	    adjVertices.values().stream().forEach(e -> e.remove(v));
	    adjVertices.remove(new Vertex(label));
	}*/
	
	/*void addEdge(int label1, int label2) {
		Vertex v1 = new Vertex(label1);
	    Vertex v2 = new Vertex(label2);
	    adjVertices.get(v1).add(v2);
	    adjVertices.get(v2).add(v1);	    
	}
	
	void removeEdge(int label1, int label2) {
	    Vertex v1 = new Vertex(label1);
	    Vertex v2 = new Vertex(label2);
	    List<Vertex> eV1 = adjVertices.get(v1);
	    List<Vertex> eV2 = adjVertices.get(v2);
	    if (eV1 != null)
	        eV1.remove(v2);
	    if (eV2 != null)
	        eV2.remove(v1);
	}*/
        
	
}
