package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class PlotterView extends JPanel {

    public PlotterView() {
        setBorder(new TitledBorder("Mostrar Grafo"));
        setSize(new Dimension(550, 550));
        setPreferredSize(getSize());
        setBackground(Color.WHITE);
    }
}
