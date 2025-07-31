package av.models.algorithms.search;

import av.models.structure.Node;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Search {
    private Node startNode;

    public Search(Node startNode) {
        this.startNode = startNode;
    }

    protected abstract void search();
}
