import javax.swing.*;

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
        applicationFrame.add(questionTextField);

        answerLabel = new JLabel(answer);
        applicationFrame.add(answerLabel);

        askMeButton = new JButton("Ask Me!");
        applicationFrame.add(askMeButton);

        applicationFrame.setVisible(true);
    }
}
