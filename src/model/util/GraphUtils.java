package model.util;

import java.util.ArrayList;
import java.util.List;
import model.structure.Graph;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class GraphUtils {

    private static final String ADJACENCY_MATRIX
            = "(\\[\\w+(,\\w+)*\\]\n?)+";
    private static final String ADJACENCY_LIST
            = "(\\w+(->\\w+)*\n?)+";
    private static final String EDGE_SET
            = "\\{\\w+(,\\w+)*\\}\n\\{\\{\\w+,\\w+\\}(,\\{\\w+,\\w+\\})*\\}";

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
        Graph result = new Graph();
        String[] lines = inputGraph.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] items = lines[i].split("[,\\[\\]]");
            for (int j = 0; j < items.length; j++) {
                if (i == 0) {
                    result.addVertex(items[i]);
                } else {
                    result.addEdge(i - 1, j);
                }
            }
        }
        return result;
    }

    private static Graph buildAdjacencyList(String inputGraph) {
        Graph result = new Graph();
        List<String[]> edges = new ArrayList<>();
        String[] lines = inputGraph.split("\n");
        for (String line : lines) {
            String[] items = line.split("->");
            result.addVertex(items[0]);
            edges.add(items);
        }
        for (int i = 0; i < edges.size(); i++) {
            String[] edge = edges.get(i);
            for (int j = 1; j < edge.length; j++) {
                result.addEdge(i, edge[j]);
            }
        }
        return result;
    }

    private static Graph buildEdgeSet(String inputGraph) {
        Graph result = new Graph();
        String[] lines = inputGraph.split("\n");
        String[] items = lines[0].split("[\\{\\},]");
        for (String item : items) {
            result.addVertex(item);
        }
        for (int i = 1; i < lines.length; i++) {
            items = lines[i].split("[\\{\\},]");
            for (int j = 0; j < items.length; j += 2) {
                    result.addEdge(j, j + 1);
            }
        }
        return result;
    }
}
