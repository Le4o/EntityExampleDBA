package testproject;

import java.util.ArrayList;

public class Grafo {
	
	public class Graph {
			
		ArrayList<Node> nodes;
		ArrayList<Edge> edges;
		
		public Graph() {
			nodes = new ArrayList<Node>();
			edges = new ArrayList<Edge>();
		}
		
		public void InsertNode(Node n) {
			this.nodes.add(n);
		}
		
		public void InsertEdge(Node n1, Node n2, int weight) {
			if(!n1.adj.contains(n2)) {
				this.edges.add(new Edge(n1, n2, weight));
				n1.adj.add(n2);
				
				this.edges.add(new Edge(n2, n1, weight));
				n2.adj.add(n1);
			}
		}
		
		public boolean EdgeExists(int valueV1, int valueV2) {
			for(Edge e : this.edges) {
				if(e.N1.Value == valueV1 && e.N2.Value == valueV2) {
					return true;
				}
			}
			return false;
		}
		
		public Edge GetEdge(Node n1, Node n2) {
			for(Edge e : this.edges) {
				if(e.N1 == n1 && e.N2 == n2) {
					return e;
				}
			}
			return null;
		}
		
		public int NumNodes() {
			return this.nodes.size();
		}
	}
	
	public class Node {
		
		int Value;
		ArrayList<Node> adj;
		
		public Node() {
			adj = new ArrayList<Node>();
		}
	}
	
	public class Edge {
		
		Node N1;
		Node N2;
		int Weight;
		
		public Edge(Node n1, Node n2, int weight) {
			this.N1 = n1;
			this.N2 = n2;
			this.Weight = weight;
		}
	}
	
	///Instance the graph and code;
	public static void main (final String []args) {
		
		Graph g = new Grafo(). new Graph();

	}
}
