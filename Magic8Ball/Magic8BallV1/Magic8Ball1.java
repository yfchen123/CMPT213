package Magic8BallV1;

import javax.swing.*;

public class Magic8Ball1 {
    JTextField question;
    JLabel answerLabel;
    JButton askMe;
    JFrame applicationFrame;

    String answer = "--";

    public Magic8Ball1() {
        applicationFrame = new JFrame();
        applicationFrame.setSize(400, 600);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        question = new JTextField();
        applicationFrame.add(question);

        answerLabel = new JLabel();
        applicationFrame.add(answerLabel);

        askMe = new JButton("Ask me!");
        applicationFrame.add(askMe);
        applicationFrame.setVisible(true);


    }
}
