import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;

public class UI {
    public UI() {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        
        JButton btn = new JButton("Click me");
        JLabel label = new JLabel("Hello!");
        
        panel.add(btn);
        panel.add(label);

        frame.add(panel);

        btn.setText(label.getText());
        btn.setEnabled(false);

        frame.pack();
        frame.setVisible(true);

    }
}
