package av.controllers;

import av.models.structure.Node;
import av.models.algorithms.search.SearchStrategy;

/**
 * Controller responsible for managing the visualization of graph search algorithms.
 * It allows setting a search strategy and initiating the search process from a given node.
 */
public class GraphVisualiserController {
    private SearchStrategy strategy;

    /**
     * Sets the search algorithm strategy to be used by this controller.
     *
     * @param strategy the search strategy to use
     */
    public void setSearchAlgorithm(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Starts the search process using the currently set search strategy,
     * beginning from the specified start node.
     *
     * @param startNode the node from which to start the search
     */
    public void startSearch(Node startNode) {
        strategy.search(startNode);
    }
}
