
import java.util.*;

class Graph {
  private Map<Vertex, List<Vertex>> adjList;

  Graph() {
    adjList = new Hashtable<>();
  }

  void addVertex(String label) {
    try {
      adjList.putIfAbsent(new Vertex(label), new ArrayList<Vertex>());
    } catch(NullPointerException e) {
      System.out.println("Exception: " + e);
    }
  }

  void removeVertex(String toDeleteKey) {
    Vertex toDelete = new Vertex(toDeleteKey);
    /*
     * Delete the toDelete Vertex from the list of the map values key -> val [if
     * toDelete exist here, remove first]
     */
    adjList.values().stream().forEach(e -> e.remove(toDelete));

    /*
     * Delete the toDelete Vertex at key of map key{if toDelete exists here} -> val
     * [some value]
     */
    adjList.remove(toDelete);
  }

  // Create a link/edge between 2 Vertex/Entity
  void addEdge(String key1, String key2) {
    // Initialize as objects
    Vertex edgeFrom = new Vertex(key1);
    Vertex edgeTo = new Vertex(key2);

    try {
      adjList.get(edgeFrom).add(edgeTo);
      adjList.get(edgeTo).add(edgeFrom);
    } catch(NullPointerException e) {
      System.out.println("Exception adding edge: " + e.getMessage());
    }
  }

  void removeEdge(String key1, String key2) {
    // Initialize as objects
    Vertex edgeFrom = new Vertex(key1);
    Vertex edgeTo = new Vertex(key2);

    // Gets the value for respectives keys
    List<Vertex> valueFrom = adjList.get(edgeFrom);
    List<Vertex> valueTo = adjList.get(edgeTo);

    /**
     * Checks if each key exist as value in respective toDelete and delete
     */
    if (valueFrom != null)
      valueFrom.remove(edgeTo);
    if (valueTo != null)
      valueFrom.remove(edgeFrom);
  }

  // Returns all the value from a given key
  List<Vertex> getAdjVertices(String key) {
    return adjList.get(new Vertex(key));
  }

  void print() {
    adjList.entrySet().forEach(entry -> {
      System.out.print(entry.getKey().label + ": [");
      List<Vertex> temp = entry.getValue();
      temp.forEach(vertex -> {
        System.out.print(" " + vertex.label);
      });
      System.out.print(" ]\n");
    });
  }

  /**
   * Depth-First Traversal
   */
  Set<String> dfsTraversal(Graph graph, String root) {
    Set<String> visited = new LinkedHashSet<String>();
    Stack<String> stack = new Stack<String>();
    stack.push(root);
    while (!stack.isEmpty()) {
      String vertex = stack.pop();
      if (!visited.contains(vertex)) {
        visited.add(vertex);
        for (Vertex v: graph.getAdjVertices(vertex)) {
          stack.push(v.label);
        }
      }
    }
    return visited;
  }

  /**
   * Breadth-First Traversal
   */
  Set<String> bfsTraversal(Graph graph, String root) {
    Set<String> visited = new LinkedHashSet<String>();
    Queue<String> queue = new LinkedList<String>();
    queue.add(root);
    visited.add(root);

    while (!queue.isEmpty()) {
      String vertex = queue.poll();
      for (Vertex v: graph.getAdjVertices(vertex)) {
        if (!visited.contains(v.label)) {
          visited.add(v.label);
          queue.add(v.label);
        }
      }
    }
    return visited;
  }

}
