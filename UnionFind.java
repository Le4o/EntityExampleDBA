package testproject;

public class UnionFind {
	
	private int[] nodes;
	private int[] rank;
	
	public int find(int i) {
		int p = this.nodes[i];
		if(i==p) {
			return i;
		}
		return nodes[i] = find(p);
	}
	
	public void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		
		if(rootX== rootY) return;
		
		if(this.rank[rootX] > this.rank[rootY]) {
			this.nodes[rootY] = rootX;
		}else if(this.rank[rootY] > this.rank[rootX]) {
			this.nodes[rootX] = rootY;
		}else {
			this.nodes[rootY] = rootX;
			this.rank[rootX]++;
		}
	}
	
	public UnionFind(int max) {
		this.nodes = new int[max];
		this.rank = new int[max];
		
		for(int i=0; i<max; i++) {
			this.nodes[i] = i;
			this.rank[i] = 0;
		}
	}
	
	//Main Content
	public static void main(String[] args) {
		
		int max = 5; //Max length of Union Find
		UnionFind uf = new UnionFind(max);
	}
	
}
