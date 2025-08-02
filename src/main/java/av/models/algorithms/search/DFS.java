package av.models.algorithms.search;

import av.models.structure.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DFS implements SearchStrategy {
    @Override
    public void search(Node startNode) {
        runDFS(startNode);
    }

    private void runDFS(Node node) {

    }
}
