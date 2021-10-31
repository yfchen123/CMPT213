import javax.swing.*;
import java.awt.*;

public class MagicEightBall {
    private JTextField questionTextField;
    private JLabel answerLabel;
    private JButton askMeButton;
    private JFrame applicationFrame;
    public final int WIDTH = 400;
    public final int HEIGHT = 600;
    public final int COLUMN = 50;

    private String answer = "--";

    public MagicEightBall() {
        applicationFrame = new JFrame("My Magic Eight Ball");
        applicationFrame.setSize(WIDTH, HEIGHT);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        questionTextField = new JTextField(COLUMN);
        // if you do NOT set the border, it stays in the CENTER
        applicationFrame.add(questionTextField, BorderLayout.NORTH);

        answerLabel = new JLabel(answer);
        applicationFrame.add(answerLabel, BorderLayout.CENTER);

        askMeButton = new JButton("Ask Me!");
        applicationFrame.add(askMeButton, BorderLayout.SOUTH);

        applicationFrame.setVisible(true);
    }
}
