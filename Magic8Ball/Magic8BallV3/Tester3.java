package Magic8BallV3;

import Magic8BallV1.Magic8Ball1;

import javax.swing.*;

public class Tester3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Magic8ball3();
            }
        });
    }
}
