package av.models.structure;

import java.util.List;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Graph {
    private List<Node> nodes = new ArrayList<Node>();

    public Graph() {

    }

}
