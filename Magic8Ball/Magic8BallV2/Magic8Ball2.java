package Magic8BallV2;

import javax.swing.*;
import java.awt.*;

public class Magic8Ball2 {
    JTextField question;
    JLabel answerLabel;
    JButton askMe;
    JFrame applicationFrame;

    String answer = "--";
    public Magic8Ball2(){
        applicationFrame = new JFrame();
        applicationFrame.setSize(400, 600);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        question = new JTextField();
        applicationFrame.add(question, BorderLayout.NORTH);

        answerLabel = new JLabel();
        applicationFrame.add(answerLabel, BorderLayout.CENTER);

        askMe = new JButton("Ask me!");
        applicationFrame.add(askMe, BorderLayout.SOUTH);
        applicationFrame.setVisible(true);


    }
}
