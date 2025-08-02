package av.models.algorithms.search;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import av.models.structure.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DFS implements SearchStrategy {
    private Map<Node, VisitState> visitStates = new HashMap<>();

    @Override
    public void search(Node startNode) {
        runDFS(startNode);
    }

    private void runDFS(Node node) {
        visitStates.put(node, VisitState.IN_PROGRESS);
        for (Edge edge : node.getEgdes()) {
            List<Node> adjacentNodes = edge.getNodes();
            Node neighbor = adjacentNodes.get(0).equals(node) ? adjacentNodes.get(1) : adjacentNodes.get(0);
            VisitState nodeState = visitStates.getOrDefault(neighbor, VisitState.NOT_VISITED);
            if (nodeState == VisitState.NOT_VISITED) {
                runDFS(neighbor);
            }
        }
        visitStates.put(node, VisitState.VISITED);
    }
}
