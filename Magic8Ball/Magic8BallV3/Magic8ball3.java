package Magic8BallV3;

import javax.swing.*;

public class Magic8ball3 {
    JTextField question;
    JLabel answerLabel;
    JButton askMe;
    JFrame applicationFrame;
    JPanel mainPanel;

    String answer = "--";

    public Magic8ball3(){
        applicationFrame = new JFrame();
        applicationFrame.setSize(300, 300);

        mainPanel = new JPanel();

        question = new JTextField();
        mainPanel.add(question);

        answerLabel = new JLabel();
        mainPanel.add(answerLabel);

        askMe = new JButton("Ask me anything!");
        mainPanel.add(askMe);


        applicationFrame.setVisible(true);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationFrame.add(mainPanel);
    }
}
