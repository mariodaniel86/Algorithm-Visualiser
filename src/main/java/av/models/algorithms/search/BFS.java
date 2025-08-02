package av.models.algorithms.search;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.List;
import java.util.ArrayDeque;

import av.models.structure.Node;
import av.models.structure.Edge;

import lombok.Getter;
import lombok.Setter;

/**
 * Implements the Breadth-First Search (BFS) algorithm as a search strategy.
 * This class performs a BFS traversal starting from a given node and tracks the visit state of each node.
 */
@Getter
@Setter
public class BFS implements SearchStrategy {

    /**
     * Initiates the BFS search starting from the specified node.
     *
     * @param startNode the node from which to start the BFS traversal
     */
    @Override
    public void search(Node startNode) {
        runBFS(startNode);
    }

    /**
     * Performs the BFS traversal from the given start node.
     * Uses a queue to explore nodes level by level and marks their visit states.
     *
     * @param startNode the node from which to begin the BFS traversal
     */
    private void runBFS(Node startNode) {
        Map<Node, VisitState> visitStates = new HashMap<>();
        Queue<Node> queue = new ArrayDeque<>();

        // Initialize the traversal by marking the start node as in progress and adding it to the queue.
        visitStates.put(startNode, VisitState.IN_PROGRESS);
        queue.add(startNode);

        // Traverse the graph in BFS order.
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            // Process current node here if needed

            // Iterate through all neighbors of the current node.
            for (Edge edge : node.getEgdes()) {
                List<Node> adjacentNodes = edge.getNodes();

                // Get the neighboring node.
                Node neighbor = adjacentNodes.get(0).equals(node) ? adjacentNodes.get(1) : adjacentNodes.get(0);
                VisitState nodeState = visitStates.getOrDefault(neighbor, VisitState.NOT_VISITED);
                if (nodeState == VisitState.NOT_VISITED) {
                    visitStates.put(neighbor, VisitState.IN_PROGRESS);
                    queue.add(neighbor);
                }
            }

            // Mark the node as fully visited after processing all neighbors.
            visitStates.put(node, VisitState.VISITED);
        }
    }

}
