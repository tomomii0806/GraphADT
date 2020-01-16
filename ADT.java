
import java.util.ArrayList;

public interface ADT<Key, Value> {

	public void addVertex(Key key, Value val);
	
	public void addEdges(Key from, Key to, int weight);
	
	public void removeVertex(Key v);
	
	public void removeEdges(Key from, Key to);
	
	public Value getVertexValue(Key key);
	
	public boolean setVertexValue(Key key, Value newVal);
	
	public boolean hasVertex(Key key);
	
	public int getEdgeValue(Key from, Key to);
	
	public boolean setEdgeValue(Key from, Key to, int weight);
	
	//lists all vertices y such that there is an edge from the vertices x to y
	public ArrayList<Key> getNeighbors(Key key);
	
	//tests whether there is an edge from the vertices x to y
	public boolean hasAdjacent(Key from, Key to);
	
	public void getShortestPath(Key start);
	
	public void printGraph();
	
	public int size();
}
