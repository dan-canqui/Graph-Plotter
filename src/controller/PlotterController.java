package controller;

import model.structure.Graph;
import view.PlotterView;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class PlotterController {

    private final PlotterView ploterView;

    public PlotterController() {
        ploterView = new PlotterView();
    }

    public boolean animate() {
        return Boolean.FALSE;
    }

    public void clean() {
    }

    public void print(Graph graph) {
    }

    public PlotterView getPlotterView() {
        return ploterView;
    }
}
