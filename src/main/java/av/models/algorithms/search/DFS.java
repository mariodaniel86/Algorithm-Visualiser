package av.models.algorithms.search;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import av.models.structure.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Implements the Depth-First Search (DFS) algorithm as a search strategy.
 * This class maintains the visit state of each node and performs a recursive DFS traversal.
 */
@Getter
@Setter
public class DFS implements SearchStrategy {
    /**
     * A map tracking the visit state of each node during the DFS traversal.
     */
    private Map<Node, VisitState> visitStates = new HashMap<>();

    /**
     * Initiates the DFS search starting from the specified node.
     *
     * @param startNode the node from which to start the DFS traversal
     */
    @Override
    public void search(Node startNode) {
        runDFS(startNode);
    }

    /**
     * Recursively performs the DFS traversal from the given node.
     * Marks nodes as in progress, explores their neighbors, and marks them as visited when done.
     *
     * @param node the current node being visited
     */
    private void runDFS(Node node) {
        // Marks the current node as in progress.
        visitStates.put(node, VisitState.IN_PROGRESS);

        // Goes through all neighbors of current node.
        for (Edge edge : node.getEgdes()) {
            List<Node> adjacentNodes = edge.getNodes();

            // Gets the other node.
            Node neighbor = adjacentNodes.get(0).equals(node) ? adjacentNodes.get(1) : adjacentNodes.get(0);
            VisitState nodeState = visitStates.getOrDefault(neighbor, VisitState.NOT_VISITED);

            // If the node is not visited then recurse and go through the neighbors of that node.
            if (nodeState == VisitState.NOT_VISITED) {
                runDFS(neighbor);
            }
        }
        // When done, mark the node as visited.
        visitStates.put(node, VisitState.VISITED);
    }
}
