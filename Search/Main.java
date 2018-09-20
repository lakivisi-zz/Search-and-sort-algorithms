import java.util.*;

class Main {
  public static void main(String args[])
    {
      String resulString;
      Graph oGraph = new Graph();
      oGraph.root = new Node("Muchai");
      List<String> scNames = Arrays.asList("Ryan", "Julie", "Bob");
      List<String> placedfellows = Arrays.asList("frankj", "loid", "pol", "mary", "user");

      for(String str: scNames){
        oGraph.root.nodes.add(new Node(str));
      }

      ArrayList<Node> scNodes = oGraph.root.nodes;
      for(String fellowstr: placedfellows){
        Random rand = new Random();
        int x = rand.nextInt(scNodes.size());
        scNodes.get(x).nodes.add(new Node(fellowstr));

      }
      resulString = fellowDFSearch(oGraph.root, "ol");
      System.out.println("Depth First Search executing ....");
      System.out.println(resulString);

      resulString = fellowBFSearch(oGraph.root, "yrt");
      System.out.println("Breadth First Search executing ....");
      System.out.println(resulString);
    }

  public static String fellowDFSearch(Node root, String searchString){

    if (root == null) return "Graph is empty";

    if(root.name.contains(searchString)) return root.name + " found";

    if(root.nodes != null){
      for (Node node : root.nodes) {
        if (!node.name.contains(searchString)) fellowDFSearch(node, searchString);
        return searchString + " found";
        }
      }
    return "Not found";
  }

  public static String fellowBFSearch(Node root, String searchString){
    if (root == null) return "Graph is empty";

    Queue<Node> searchQueue = new LinkedList();
    searchQueue.add(root);

    while (!searchQueue.isEmpty()) {
      Node currnode = searchQueue.remove();
      if(currnode.name.contains(searchString)) return currnode.name + " found";

      for (Node newNode : currnode.nodes) {
        searchQueue.add(newNode);
      }
	  }
    return "Not found";
  }
}
