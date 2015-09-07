package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class MainView extends JFrame {

    public MainView(PlotterView plotterView, InputDataView inputDataView) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(inputDataView, BorderLayout.EAST);
        add(plotterView, BorderLayout.WEST);
        setSize(new Dimension(800, 550));
        setPreferredSize(getSize());
        setLocationRelativeTo(null);
    }
}
