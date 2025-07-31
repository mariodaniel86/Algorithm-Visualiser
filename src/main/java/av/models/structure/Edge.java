package av.models.structure;

import java.util.List;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edge {
    private int id;
    private List<Node> nodes = new ArrayList<Node>();
}
