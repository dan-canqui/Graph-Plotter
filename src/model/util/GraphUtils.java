package model.util;

import model.structure.Graph;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class GraphUtils {

    private static final String ADJACENCY_MATRIX ="";
    private static final String ADJACENCY_LIST ="";
    private static final String EDGE_SET ="";

    public static Graph buildGraph(String inputGraph) {
        if (inputGraph.matches(ADJACENCY_MATRIX)) {
            return buildAdjacencyMatrix(inputGraph);
        }
        if (inputGraph.matches(ADJACENCY_LIST)) {
            return buildAdjacencyList(inputGraph);
        }
        if (inputGraph.matches(EDGE_SET)) {
            return buildEdgeSet(inputGraph);
        }
        return null;
    }

    public static boolean isPlane(Graph graph) {
        return Boolean.FALSE;
    }

    public static int steps(Graph graph) {
        return 0;
    }

    private static Graph buildAdjacencyMatrix(String inputGraph) {
        return null;
    }

    private static Graph buildAdjacencyList(String inputGraph) {
        return null;
    }

    private static Graph buildEdgeSet(String inputGraph) {
        return null;
    }
}
