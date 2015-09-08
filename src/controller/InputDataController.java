package controller;

import controller.action.ExampleAction;
import javax.swing.Action;
import model.structure.Graph;
import model.util.GraphUtils;
import view.ExampleView;
import view.InputDataView;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class InputDataController {

    private static final String ACCEPT_MESSAGE = 
            "<html>Se ejecuto la <br/>operacion correctamente</html>";
    private static final String ANIMATE_ERROR = 
            "<html>No se puede animar.<br/>No es un grafo plano</html>";
    private static final String GRAPH_ERROR = 
            "<html>No se puede crear<br/>el grafo</html>";
    private static final String EMPTY = "";
    private final InputDataView inputDataView;
    private final ExampleView exampleView;

    public InputDataController() {
        inputDataView = new InputDataView();
        exampleView = new ExampleView();
    }

    public void animationMessage(boolean state) {
        String message = state ? ACCEPT_MESSAGE : ANIMATE_ERROR;
        inputDataView.getLabel().setText(message);
    }

    public void cleanNotifications() {
        inputDataView.getTextArea().setText(EMPTY);
        inputDataView.getLabel().setText(EMPTY);
    }

    public Graph buildGraph() {
        String input = inputDataView.getTextArea().getText();
        Graph result = GraphUtils.buildGraph(input);
        String message = result == null ? GRAPH_ERROR : ACCEPT_MESSAGE;
        inputDataView.getLabel().setText(message);
        return result;
    }

    public void makeView(Action loadAction, Action cleanAction, Action animateAction) {
        inputDataView.makeView(loadAction, cleanAction, animateAction,
                openAction(Boolean.TRUE));
        exampleView.makeView(openAction(Boolean.FALSE));
    }

    public InputDataView getView() {
        return inputDataView;
    }

    public void showExample(boolean state) {
        exampleView.setVisible(state);
    }

    private ExampleAction openAction(boolean state) {
        return new ExampleAction(this, state);
    }
}
