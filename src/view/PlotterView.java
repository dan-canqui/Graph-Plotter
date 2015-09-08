package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import model.structure.Graph;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class PlotterView extends JPanel {

    private Graph graph;

    public PlotterView() {
        setBorder(new TitledBorder("Mostrar Grafo"));
        setSize(new Dimension(550, 550));
        setPreferredSize(getSize());
        setBackground(Color.WHITE);
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (graph != null) {
            graph.paint(g);
        }
    }
}
