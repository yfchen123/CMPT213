package GUIQuestions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIQuestion1 implements ActionListener {
    private JTextField textField;
    private JButton pushButton;
    private JLabel label1;
    private JLabel label2;
    private JFrame myFrame;
    private final int FRAME_HEIGHT = 150;
    private final int FRAME_WIDTH = 350;
    private final int TEXT_WIDTH = 15;

    public GUIQuestion1(){
        myFrame = new JFrame();
        myFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        myFrame.setLayout(new FlowLayout());
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Enter Text: ");
        myFrame.add(label1);

        textField = new JTextField("Please enter in something!");
        textField.setColumns(TEXT_WIDTH);
        textField.addActionListener(this);
        myFrame.add(textField);

        pushButton = new JButton("Reverse");
        pushButton.addActionListener(this);
        myFrame.add(pushButton);

        label2 = new JLabel("No text entered yet. Please enter in some text.");
        label2.setPreferredSize(new Dimension(FRAME_WIDTH - 50, 25));
        myFrame.add(label2);

        myFrame.setVisible(true);
    }

    /**
     * This is a method for reversing string.
     * @param s
     * @return
     */

    public String reverse(String s){
        String myStr = "";
        for(int i = s.length() - 1; i >= 0; i--){
            myStr += s.charAt(i);
        }
        return myStr;
    }

    /**
     * When the enter key is pressed the input inside of the textbox should be displayed
     * in label2.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == textField){
            String s1 = "You pressed ENTER. Text is: ";
            label2.setText(s1 + textField.getText());
        }
        else if(e.getSource() == pushButton){
            String myStr = textField.getText();
            textField.setText(reverse(myStr));
        }
    }
}
