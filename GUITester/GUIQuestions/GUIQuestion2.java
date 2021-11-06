package GUIQuestions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class GUIQuestion2 {
    private JCheckBox alpha;
    private JCheckBox beta;
    private JCheckBox gamma;
    private JLabel alphaLabel;
    private JLabel betaLabel;
    private JLabel gammaLabel;
    private JFrame myFrame;
    private JLabel currentSelected;
    private JLabel allSelected;
    private String s;
    private String a;
    private ArrayList<String> arr;

    private final int FRAME_HEIGHT = 120;
    private final int FRAME_WIDTH = 300;

    public GUIQuestion2(){
        s = " was just selected.";
        a = "Selected check boxes: ";
        arr = new ArrayList<>();
        myFrame = new JFrame();
        myFrame.setLayout(new FlowLayout());
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        alpha = new JCheckBox();
        alpha.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    currentSelected.setText("Alpha" + s);
                    arr.add("Alpha ");
                }
                else{
                    arr.remove("Alpha ");
                }
                allSelected.setText(a + convertArr(arr));
            }
        });
        myFrame.add(alpha);

        alphaLabel = new JLabel("Alpha");
        myFrame.add(alphaLabel);

        beta = new JCheckBox();
        beta.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    currentSelected.setText("Beta" + s);
                    arr.add("Beta ");
                }
                else{
                    arr.remove("Beta ");
                }
                allSelected.setText(a + convertArr(arr));
            }
        });
        myFrame.add(beta);

        betaLabel = new JLabel("Beta");
        myFrame.add(betaLabel);

        gamma = new JCheckBox();
        gamma.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    currentSelected.setText("Gamma" + s);
                    arr.add("Gamma ");
                }
                else{
                    arr.remove("Gamma ");
                }
                allSelected.setText(a + convertArr(arr));
            }
        });
        myFrame.add(gamma);

        gammaLabel = new JLabel("Gamma");
        myFrame.add(gammaLabel);

        currentSelected = new JLabel("Nothing Selected");
        currentSelected.setPreferredSize(new Dimension(FRAME_WIDTH - 50, 15));
        myFrame.add(currentSelected);

        allSelected = new JLabel();
        myFrame.add(allSelected);

        myFrame.setVisible(true);
    }

    public String convertArr(ArrayList<String> arr){
        String str = "";
        for(String i: arr){
            str += i;
        }
        return str;
    }


}
