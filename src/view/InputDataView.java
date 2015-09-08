package view;

import java.awt.GridLayout;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class InputDataView extends JPanel {

    private final JTextArea textArea;
    private final JLabel label;

    public InputDataView() {
        setSize(240, 550);
        setPreferredSize(getSize());
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        textArea = textAreaPanel();
        label = new JLabel();
    }

    public void makeView(Action loadAction, Action cleanAction,
            Action animateAction, Action exampleAction) {
        add(descriptionPanel(exampleAction));
        add(textArea);
        add(buttonPanel(loadAction, cleanAction));
        add(notificationPanel());
        add(buttonPanel(animateAction));
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JLabel getLabel() {
        return label;
    }

    private JTextArea textAreaPanel() {
        JTextArea result = new JTextArea();
        result.setBorder(new TitledBorder("Ingrese un grafo"));
        return result;
    }

    private JPanel descriptionPanel(Action exampleAction) {
        JPanel result = new JPanel();
        result.add(new JLabel("Use el siguiente ejemplo"));
        result.add(new JButton(exampleAction));
        return result;
    }

    private JPanel buttonPanel(Action... actions) {
        JPanel result = new JPanel();
        for (Action current : actions) {
            result.add(new JButton(current));
        }
        return result;
    }

    private JPanel notificationPanel() {
        JPanel result = new JPanel(new GridLayout());
        result.setBorder(new TitledBorder("Notificaciones"));
        result.setSize(Integer.MAX_VALUE, 150);
        result.setPreferredSize(result.getSize());
        result.setMaximumSize(result.getSize());
        result.add(label);
        return result;
    }
}
