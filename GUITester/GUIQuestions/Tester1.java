package GUIQuestions;

import javax.swing.*;

public class Tester1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIQuestion1();
            }
        });
    }
}
