package MagicBallV4;

import Magic8BallV3.Magic8ball3;

import javax.swing.*;

public class Tester4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Magic8Ball4();
            }
        });
    }
}
