package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import model.structure.Graph;
import model.util.GraphUtils;
import view.PlotterView;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class PlotterController {

    private final PlotterView ploterView;
    private Timer timer;
    private int steps;

    public PlotterController() {
        ploterView = new PlotterView();
        initializeTimer();
    }

    public boolean animate() {
        boolean result = GraphUtils.isPlane(ploterView.getGraph());
        if (result) {
            steps = GraphUtils.steps(ploterView.getGraph());
            timer.start();
        }
        return result;
    }

    public void clean() {
        print(null);
    }

    public void print(Graph graph) {
        ploterView.setGraph(graph);
        ploterView.repaint();
    }

    public PlotterView getPlotterView() {
        return ploterView;
    }

    private void initializeTimer() {
        timer = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ploterView.repaint();
                if (--steps == 0) {
                    timer.stop();
                }
            }
        });
    }
}
