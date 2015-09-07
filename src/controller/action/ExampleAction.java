/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.action;

import controller.InputDataController;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class ExampleAction extends AbstractAction {

    private final InputDataController inputDataController;
    private final boolean state;

    public ExampleAction(InputDataController inputDataController,
            boolean state) {
        this.inputDataController = inputDataController;
        this.state = state;
        putValue(Action.NAME, "?");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inputDataController.showExample(state);
    }
}
