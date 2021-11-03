package Magic8Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Magic8Ball implements ActionListener{
    private JPanel askMePanel;
    private JCheckBox moreAnswersCheckBox;
    private JPanel mainPanel;
    private JFrame applicationFrame;
    private JButton askMe;
    private JTextField questionTextField;
    private JComboBox questionComboBox;
    private DefaultComboBoxModel model;
    private String[] possibleQuestions = {
            "What is the weather like?", "Who will I marry?",
            "Is it going to be cold outside?"
    };
    private JLabel myLabel;

    public Magic8Ball(){
        applicationFrame = new JFrame();
        mainPanel = new JPanel();
        askMePanel = new JPanel();
        askMePanel.setLayout(new BoxLayout(askMePanel, BoxLayout.X_AXIS));
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        askMe = new JButton("Ask me!");
        askMe.addActionListener(this);

        moreAnswersCheckBox = new JCheckBox("More Answers!");
        moreAnswersCheckBox.addActionListener(this);

        myLabel = new JLabel("This is where your answer goes!");
        mainPanel.add(myLabel);

        questionTextField = new JTextField(20);
        questionTextField.setMaximumSize(new Dimension(300
        , questionTextField.getPreferredSize().height));
        questionTextField.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(questionTextField);

        model = new DefaultComboBoxModel(possibleQuestions);
        questionComboBox = new JComboBox(model);
        questionComboBox.setEditable(true);
        questionComboBox.setSelectedIndex(-1);
        questionComboBox.setMaximumSize(new Dimension(300,
                questionComboBox.getPreferredSize().height
        ));
        questionComboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        questionComboBox.addActionListener(this);
        mainPanel.add(questionComboBox);



        askMePanel.add(Box.createRigidArea(new Dimension(
                moreAnswersCheckBox.getPreferredSize().width, 0
        )));
        askMePanel.add(Box.createRigidArea(new Dimension(10 , 0)));
        askMePanel.add(askMe);
        askMePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        askMePanel.add(moreAnswersCheckBox);

        mainPanel.add(askMePanel);
        mainPanel.add(Box.createRigidArea(new Dimension(30, 20)));

        applicationFrame.setSize(400, 200);
        applicationFrame.setContentPane(mainPanel);
        applicationFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equalsIgnoreCase("Ask me!")){
            if (questionComboBox.getSelectedItem() == null){
                myLabel.setText("Please choose a question!");
                return;
            }
            String s = questionComboBox.getSelectedItem().toString();

            if(s.equalsIgnoreCase("What is the weather like?")){
                myLabel.setText("Very chilly.");
            }
            else if(s.equalsIgnoreCase("Who will I marry?")){
                myLabel.setText("You have to ask yourself that.");
            }
            else{
                myLabel.setText("Of Course!");
            }
        }else{
            if(e.getActionCommand().equalsIgnoreCase("More Answers!")){
                if(questionTextField.getText().equals("")){
                    myLabel.setText("Please type something first...");
                    return;
                }
                else if(model.getIndexOf(questionTextField.getText()) != -1){
                    myLabel.setText("This option already exists!");
                }
                else{
                    myLabel.setText("Option has been added!");
                    questionComboBox.addItem(questionTextField.getText());
                }
            }
        }
    }


}
