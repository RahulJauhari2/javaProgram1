import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Traffic_signal extends JFrame {

    private JPanel redSn, yellowSn, greenSn, carPanel;
    private JButton startButton, stopButton, slowButton, reverseButton;

    Timer carMoveTimer;
    private int carSpeed = 1;
    private int direction = 1;
    private int carXposition = 10;

    public Traffic_signal() {

        setLayout(null);
        setSize(600, 400);
        setTitle("Traffic Signal Police");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        carPanel = new JPanel();
        carPanel.setBounds(carXposition, 310, 80, 40);
        add(carPanel);
        
        carMoveTimer = new Timer(10, new ActionListener() {
           // @Override
            public void actionPerformed(ActionEvent e) {
                if (carSpeed > 0) {
                    carXposition = carXposition + direction * carSpeed;
                    carPanel.setBounds(carXposition, 310, 80, 40);

                    if (carXposition >= getWidth() || carXposition <= 0) {
                        carMoveTimer.stop();
                    }
                }
            }
        });
    }

    public void startCarTimer() {
        carMoveTimer.start();
    }

    public static void main(String[] args) {
        Traffic_signal frame = new Traffic_signal();
        frame.setVisible(true);
        frame.startCarTimer();
    }
}
