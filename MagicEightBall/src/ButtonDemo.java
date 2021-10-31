import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener {

    private JFrame frame;
    private JLabel label;
    private JButton btnUp;
    private JButton btnDown;

    public final int WIDTH = 220;
    public final int HEIGHT = 90;

    private String output = "Press a button";
    private String UP = "up";
    private String DOWN = "Down";

    public ButtonDemo() {
        frame = new JFrame("A Button Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnUp = new JButton(UP);
        btnDown = new JButton(DOWN);
        btnUp.addActionListener(this);
        btnDown.addActionListener(this);

        frame.add(btnUp);
        frame.add(btnDown);

        label = new JLabel(output);
        frame.add(label);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(UP)) label.setText("You pressed up.");
        else label.setText("You pressed down.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
