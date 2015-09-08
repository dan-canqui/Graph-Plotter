package controller;

import controller.action.AnimateGraphAction;
import controller.action.CleanGraphAction;
import controller.action.LoadGraphAction;
import model.structure.Graph;
import view.InputDataView;
import view.PlotterView;
import view.MainView;
import javax.swing.Action;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class MainController {

    private InputDataController inputDataController;
    private PlotterController plotterController;
    private Action animateAction;
    private Action cleanAction;
    private Action loadAction;
    private MainView mainView;

    public MainController() {
        initControllers();
        initActions();
        initViews();
    }

    public void run() {
        mainView.setVisible(Boolean.TRUE);
    }

    public void animateGraph() {
        boolean state = plotterController.animate();
        inputDataController.animationMessage(state);
    }

    public void cleanGraph() {
        inputDataController.cleanNotifications();
        animateAction.setEnabled(Boolean.FALSE);
        plotterController.clean();
    }

    public void loadGraph() {
        Graph graph = inputDataController.buildGraph();
        if (graph != null) {
            animateAction.setEnabled(Boolean.TRUE);
            plotterController.print(graph);
        }
    }

    private void initControllers() {
        inputDataController = new InputDataController();
        plotterController = new PlotterController();
    }

    private void initActions() {
        animateAction = new AnimateGraphAction(this);
        cleanAction = new CleanGraphAction(this);
        loadAction = new LoadGraphAction(this);

        animateAction.setEnabled(Boolean.FALSE);
    }

    private void initViews() {
        inputDataController.makeView(loadAction, cleanAction, animateAction);
        PlotterView plotterView = plotterController.getPlotterView();
        InputDataView inputDataView = inputDataController.getView();
        mainView = new MainView(plotterView, inputDataView);
    }
}
