package controller.action;

import controller.MainController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class CleanGraphAction extends BaseAction {

    public CleanGraphAction(MainController mainController) {
        super(mainController);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainController.cleanGraph();
    }

    @Override
    protected String titleAction() {
        return "Limpiar";
    }

    @Override
    protected String pathImage() {
        return "image/clean.png";
    }
}
