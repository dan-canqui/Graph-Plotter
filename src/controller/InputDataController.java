package controller;

import controller.action.ExampleAction;
import javax.swing.Action;
import model.structure.Graph;
import view.ExampleView;
import view.InputDataView;


/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class InputDataController {

    private final ExampleAction closeExampleAction;
    private final ExampleAction openExampleAction;
    private final InputDataView inputDataView;
    private final ExampleView exampleView;

    public InputDataController() {
        closeExampleAction = new ExampleAction(this, Boolean.FALSE);
        openExampleAction = new ExampleAction(this, Boolean.TRUE);
        inputDataView = new InputDataView();
        exampleView = new ExampleView();
    }

    public void animationMessage(boolean state) {
    }

    public void cleanMessages() {
    }

    public Graph getGraph() {
        return null;
    }

    public void makeView(Action loadAction, Action cleanAction, Action animateAction) {
        inputDataView.makeView(loadAction, cleanAction, animateAction, openExampleAction);
        exampleView.makeView(closeExampleAction);
    }

    public InputDataView getView() {
        return inputDataView;
    }

    public void showExample(boolean state) {
        exampleView.setVisible(state);
    }
}
