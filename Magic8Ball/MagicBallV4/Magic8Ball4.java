package MagicBallV4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Magic8Ball4 implements ActionListener {
    String possibleAnswer[] = {"It's certain", "Most likely", "Ask again later"
    , "Cannot predict now", "Outlook not so good"};
    Random random = new Random();

    JButton askMe;
    JFrame myFrame;
    JPanel mainPanel;
    JLabel answer;

    public Magic8Ball4(){
        myFrame = new JFrame();
        mainPanel = new JPanel();

        askMe = new JButton("Ask me!");
        askMe.addActionListener(this);
        mainPanel.add(askMe);

        answer = new JLabel();
        mainPanel.add(answer);

        myFrame.add(mainPanel);


        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        answer.setText(possibleAnswer[random.nextInt(possibleAnswer.length)]);
    }
}
