package Magic8BallV1;

import javax.swing.*;

public class Tester1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Magic8Ball1();
            }
        });
    }
}
