package revision.graphs;

import java.util.Objects;

public class WeightedGraphNode {
    int value;
    int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeightedGraphNode graphNode = (WeightedGraphNode) o;
        return value == graphNode.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    WeightedGraphNode(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}
