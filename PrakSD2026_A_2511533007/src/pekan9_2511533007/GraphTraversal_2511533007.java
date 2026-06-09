package pekan9_2511533007;
import java.util.*;

public class GraphTraversal_2511533007 {
    private Map<String, List<String>> graph_3007 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_3007(String node1_3007, String node2_3007) {
        graph_3007.putIfAbsent(node1_3007, new ArrayList<>());
        graph_3007.putIfAbsent(node2_3007, new ArrayList<>());
        graph_3007.get(node1_3007).add(node2_3007);
        graph_3007.get(node2_3007).add(node1_3007);
    }

    // Menampilkan graf awal
    public void printGraph_3007() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_3007 : graph_3007.keySet()) {
            System.out.print(node_3007 + " -> ");
            List<String> neighbors_3007 = graph_3007.get(node_3007);
            System.out.println(String.join(", ", neighbors_3007));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs_3007(String start_3007) {
        Set<String> visited_3007 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_3007(start_3007, visited_3007);
        System.out.println();
    }

    private void dfsHelper_3007(String current_3007, Set<String> visited_3007) {
        if (visited_3007.contains(current_3007)) return;
        visited_3007.add(current_3007);
        System.out.print(current_3007 + " ");
        for (String neighbor_3007 : graph_3007.getOrDefault(current_3007, new ArrayList<>())) {
            dfsHelper_3007(neighbor_3007, visited_3007);
        }
    }
    
    //BFS iteratif
    public void bfs_3007(String start_3007) {
    	Set<String> visited_3007 = new HashSet<>();
    	Queue<String> queue_3007 = new LinkedList<>();
    	queue_3007.add(start_3007);
    	visited_3007.add(start_3007);
    	System.out.println("Penelusuran BFS:");
    	while (!queue_3007.isEmpty()) {
    		String current_3007 = queue_3007.poll();
    		System.out.print(current_3007 + " ");
    		for (String neighbor_3007 : graph_3007.getOrDefault(current_3007, new ArrayList<>())) {
    			if (!visited_3007.contains(neighbor_3007)) {
    				queue_3007.add(neighbor_3007);
    				visited_3007.add(neighbor_3007);
    			}
    		}
    	}
    	System.out.println();
    }
    // main
    public static void main(String[] args) {
    	GraphTraversal_2511533007 graph_3007 = new GraphTraversal_2511533007();
    	
    	//contoh graf: A-B, A-C, B-D, B-E
    	graph_3007.addEdge_3007("A", "B");
    	graph_3007.addEdge_3007("A", "C");
    	graph_3007.addEdge_3007("B", "D");
    	graph_3007.addEdge_3007("B", "E");
    	// cetak graf awal
    	System.out.println("Graf Awal adalah: ");
    	graph_3007.printGraph_3007();
    	// lakukan penelusuran
    	graph_3007.dfs_3007("A");
    	graph_3007.bfs_3007("A");
    	
    }
}