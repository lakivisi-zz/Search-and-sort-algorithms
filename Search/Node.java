import java.util.ArrayList;

public class Node {
	String name;
	boolean isVisited;
	ArrayList<Node> nodes;
	public Node(String name) {
		this.name = name;
    this.nodes = new ArrayList<>();
	}
}
