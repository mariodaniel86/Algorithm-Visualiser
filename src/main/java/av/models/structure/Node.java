package av.models.structure;

import java.util.List;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private int id;
    private List<Edge> egdes = new ArrayList<Edge>();
}
