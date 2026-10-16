import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleButtonUI implements ActionListener
{
    JFrame mainFrame;
    JPanel mainPanel;
    JButton button;
    public SimpleButtonUI()
    {
        this.mainFrame = new JFrame("Demo");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();

        this.button = new JButton("Heads"); 
        this.button.addActionListener(this);

        if (true) {
        this.mainPanel.add(this.button);
        this.mainFrame.add(this.mainPanel);
        this.mainFrame.pack();
        this.mainFrame.setVisible(true);

        }
    }
    public void actionPerformed(ActionEvent e) {
        if (this.button.getText().equals("Heads")) {
            this.button.setText("Tails");
        } else {
            this.button.setText("Heads");
        }
    }

}
