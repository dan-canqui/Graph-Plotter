package controller.action;

import controller.MainController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class AnimateGraphAction extends BaseAction {

    public AnimateGraphAction(MainController mainController) {
        super(mainController);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainController.animateGraph();
    }

    @Override
    protected String titleAction() {
        return "Animar";
    }

    @Override
    protected String pathImage() {
        return "image/animate.png";
    }
}
