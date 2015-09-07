package view;

import java.awt.Graphics;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class ExampleView extends JWindow {

    public ExampleView() {
        setSize(400, 400);
        setPreferredSize(getSize());
    }

    public void makeView(Action closeAction) {
        add(imagePanel());
        add(buttonPanel(closeAction));
    }

    private JPanel imagePanel() {
        JPanel result = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
            }
        };
        return result;
    }

    private JPanel buttonPanel(Action closeAction) {
        JPanel result = new JPanel();
        result.add(new JButton(closeAction));
        return result;
    }
}
