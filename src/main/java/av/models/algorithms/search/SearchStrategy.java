package av.models.algorithms.search;

import av.models.structure.Node;

/**
 * An interface that defines the contract for all graph search algorithm implementations.
 * Any search algorithm (e.g., DFS, BFS) should implement this interface.
 */
public interface SearchStrategy {
    /**
     * Executes the search algorithm starting from the specified node.
     *
     * @param startNode the node from which to begin the search
     */
    void search(Node startNode);
}
