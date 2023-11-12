package applet;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletUI extends JApplet implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JButton myButton;
    private JLabel statusLabel;

    public void init() {
        setSize(300, 200);
        setName("Swing App Example");

        JPanel panel = new JPanel();
        myButton = new JButton("Click me!");
        myButton.addActionListener(this);
        panel.add(myButton);

        statusLabel = new JLabel("Status: ");
        panel.add(statusLabel);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            statusLabel.setText("Status: Button clicked!");
        }
    }
}
