import javax.swing.*;

public class Tester {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MagicEightBall();
            }
        });
    }
}
