package av.models.algorithms.sort;

import java.util.List;

/**
 * An interface that defines the contract for all sorting algorithm implementations.
 * Any sorting algorithm (e.g., BubbleSort, QuickSort) should implement this interface.
 */
public interface SortStrategy {
    /**
     * Sorts the provided list in-place according to the algorithm's logic.
     *
     * @param array the list to be sorted
     */
    void sort(List<?> array);
}
