
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;


class Test {

	@org.junit.jupiter.api.Test
	public void testAddVertexes() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(5, 'F');
		
		graph.printGraph();
	}

	@org.junit.jupiter.api.Test
	public void testAddDuplicateKeyVertexes() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');	//Duplicate key
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(2, 'F');	//Duplicate key
		
	}
	
	@org.junit.jupiter.api.Test
	public void testAddEdges() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(5, 'F');
		
		graph.addEdges(0, 1, 4);
		graph.addEdges(0, 2, 3);
		graph.addEdges(1, 2, 1);
		graph.addEdges(1, 3, 2);
		graph.addEdges(2, 3, 4);
		graph.addEdges(3, 4, 2);
		graph.addEdges(4, 5, 6);
		
		graph.printGraph();
	}
	
	@org.junit.jupiter.api.Test
	public void testAddEdgesforUnexistedVertex() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		
		
		//graph.addEdges(3, 1, 4);
		
	}
	
	@org.junit.jupiter.api.Test
	public void testSetVertexValue() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		
		char ch = graph.getVertexValue(1);
		assertEquals('B', ch);
		
		graph.setVertexValue(1, 'H');
		ch = graph.getVertexValue(1);
		assertEquals('H', ch);
		
	}
	
	@org.junit.jupiter.api.Test
	public void testsetEdge() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(5, 'F');
		
		graph.addEdges(0, 1, 4);
		graph.addEdges(0, 2, 3);
		graph.addEdges(1, 2, 1);
		graph.addEdges(1, 3, 2);
		graph.addEdges(2, 3, 4);
		graph.addEdges(3, 4, 2);
		graph.addEdges(4, 5, 6);
		
		int i = graph.getEdgeValue(2, 3);
		assertEquals(4, i);
		
		graph.setEdgeValue(3, 2, 10);
		i = graph.getEdgeValue(2, 3);
		assertEquals(10, i);
		
		
	}
	
	@org.junit.jupiter.api.Test
	public void testRemoveVertex() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(5, 'F');
		
		graph.addEdges(0, 1, 4);
		graph.addEdges(0, 2, 3);
		graph.addEdges(1, 2, 1);
		graph.addEdges(1, 3, 2);
		graph.addEdges(2, 3, 4);
		graph.addEdges(3, 4, 2);
		graph.addEdges(4, 5, 6);
		
		graph.removeVertex(3);
		
		assertFalse(graph.hasVertex(3));
	
		
		
	}
	
	@org.junit.jupiter.api.Test
	public void testRemoveEdge() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(5, 'F');
		
		graph.addEdges(0, 1, 4);
		graph.addEdges(0, 2, 3);
		graph.addEdges(1, 2, 1);
		graph.addEdges(1, 3, 2);
		graph.addEdges(2, 3, 4);
		graph.addEdges(3, 4, 2);
		graph.addEdges(4, 5, 6);
		
		graph.removeEdges(3, 2);
		
		assertFalse(graph.hasAdjacent(2, 3));
	
		
		
	}
	
	@org.junit.jupiter.api.Test
	public void testSize() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(5, 'F');
		
		graph.addEdges(0, 1, 4);
		graph.addEdges(0, 2, 3);
		graph.addEdges(1, 2, 1);
		graph.addEdges(1, 3, 2);
		graph.addEdges(2, 3, 4);
		graph.addEdges(3, 4, 2);
		graph.addEdges(4, 5, 6);
		
		int i = graph.size();
		assertEquals(6, i);
		
		
		graph.removeVertex(3);
		
		i = graph.size();
		assertEquals(5, i);
		
		
	}
	
	@org.junit.jupiter.api.Test
	public void testSHortestPath() {
		
		Graph<Integer, Character> graph = new Graph<>();
		
		graph.addVertex(0, 'A');
		graph.addVertex(1, 'B');
		graph.addVertex(2, 'C');
		graph.addVertex(3, 'D');
		graph.addVertex(4, 'E');
		graph.addVertex(5, 'F');
		
		graph.addEdges(0, 1, 4);
		graph.addEdges(0, 2, 3);
		graph.addEdges(1, 2, 1);
		graph.addEdges(1, 3, 2);
		graph.addEdges(2, 3, 4);
		graph.addEdges(3, 4, 2);
		graph.addEdges(4, 5, 6);
		
		graph.getShortestPath(0);
		
	}
}
