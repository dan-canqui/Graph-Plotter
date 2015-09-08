package model.structure;

import java.awt.Graphics;
import java.util.List;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class Graph {

    private List<Vertex> vertices;
    private List<Edge> edges;

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void paint(Graphics g) {
        for (Edge edge : edges) {
            edge.paint(g);
        }
        for (Vertex vertex : vertices) {
            vertex.paint(g);
        }
    }
}
