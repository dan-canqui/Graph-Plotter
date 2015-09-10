package model.structure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class Graph {

    private final List<Vertex> vertices;
    private final List<Edge> edges;
    private final Random random;

    public Graph() {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
        random = new Random();
    }

    public void addVertex(String value) {
        vertices.add(new Vertex(value, random.nextInt(500), random.nextInt(500)));
    }

    public void addEdge(int leftIndex, int rightIndex) {
        Vertex left = vertices.get(leftIndex);
        Vertex right = vertices.get(rightIndex);
        edges.add(new Edge(left, right));
    }

    public void addEdge(int leftIndex, String rightValue) {
        Vertex left = vertices.get(leftIndex);
        for (Vertex right : vertices) {
            if (right.getValue().equals(rightValue)) {
                edges.add(new Edge(left, right));
            }
        }
    }

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
            vertex.move();
            vertex.paint(g);
        }
    }
}
