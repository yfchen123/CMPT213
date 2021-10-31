import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MagicBall implements ActionListener{

    private JTextField questionTextField;
    private JLabel answerLabel;
    private JLabel instructionLabel;
    private JButton askMeButton;
    private JFrame applicationFrame;
    private JPanel mainPanel; //why?

    private String answer = "--";
    private String question = "Type your answer here: ";
    public final int WIDTH = 400;
    public final int HEIGHT = 600;
    public final int COLUMN = 40;
    Random random = new Random();

    private String possibleAnswer[] = {" It’s certain", "Most likely",
            "Ask again later", "Cannot predict now",
            "Don’t count on it", "Out look not so good"};

    public MagicBall() {
        applicationFrame = new JFrame("My Magic Eight Ball");
        applicationFrame.setSize(WIDTH, HEIGHT);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();

        instructionLabel = new JLabel(question);
        mainPanel.add(instructionLabel, BorderLayout.NORTH);


        questionTextField = new JTextField(COLUMN);
        // if you do NOT set the border, it stays in the CENTER
        mainPanel.add(questionTextField, BorderLayout.CENTER);

        answerLabel = new JLabel(answer);
        mainPanel.add(answerLabel, BorderLayout.SOUTH);

        askMeButton = new JButton("Ask Me!");
        //anonymous ActionListener class
        askMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answerLabel.setText(possibleAnswer[random.nextInt(possibleAnswer.length)]);
            }
        });
        mainPanel.add(askMeButton, BorderLayout.SOUTH);

        applicationFrame.add(mainPanel);
        applicationFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
