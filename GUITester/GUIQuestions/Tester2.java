package GUIQuestions;

import javax.swing.*;

public class Tester2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIQuestion2();
            }
        });
    }
}
