package av.models.algorithms.search;

/**
 * Enum representing the visit state of a node during graph search algorithms.
 * Used to track the progress of traversal for each node.
 */
public enum VisitState {
    /** The node has not been visited yet. */
    NOT_VISITED,
    /** The node is currently being explored (in progress). */
    IN_PROGRESS,
    /** The node and all its neighbors have been fully explored. */
    VISITED
}
