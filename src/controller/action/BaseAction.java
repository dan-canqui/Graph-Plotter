package controller.action;

import controller.MainController;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public abstract class BaseAction extends AbstractAction {

    protected MainController mainController;

    public BaseAction(MainController mainController) {
        this.mainController = mainController;
        initialSetup();
    }

    protected abstract String titleAction();

    protected abstract String pathImage();

    private void initialSetup() {
        ImageIcon image = null;
        putValue(Action.NAME, titleAction());
        putValue(Action.SMALL_ICON, image);
    }
}
