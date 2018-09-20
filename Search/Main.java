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
      resulString = fellowSearch(oGraph.root, "ol");
      System.out.println(resulString);
    }

  public static String fellowSearch(Node root, String searchString){

    if (root == null) return "Graph is empty";

    if(root.name.contains(searchString)) return "Person found";

    if(root.nodes != null){
      for (Node node : root.nodes) {
        if (!node.name.contains(searchString)) fellowSearch(node, searchString);
        return searchString + " found";
        }
      }
    return "Not found";
  }
}
