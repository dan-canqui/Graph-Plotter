package controller.action;

import controller.MainController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class LoadGraphAction extends BaseAction {

    public LoadGraphAction(MainController mainController) {
        super(mainController);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainController.loadGraph();
    }

    @Override
    protected String titleAction() {
        return "Cargar";
    }

    @Override
    protected String pathImage() {
        return "image/load.png";
    }
}
