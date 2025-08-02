package av.controllers;

import av.models.structure.Node;
import av.models.algorithms.search.SearchStrategy;

public class GraphVisualiserController {
    private SearchStrategy strategy;

    public void setSearchAlgorithm(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void startSearch(Node startNode) {
        strategy.search(startNode);
    }
}
