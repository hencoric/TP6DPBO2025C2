import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {

    public static void main(String[] args) {
        JFrame menuFrame = new JFrame("Menu Utama");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(300, 200);
        menuFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 50));
        JButton tombolMulai = new JButton("Mulai Game");

        tombolMulai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuFrame.dispose();

                JFrame gameFrame = new JFrame("Flappy Bird");
                gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameFrame.setSize(360, 640);
                gameFrame.setLocationRelativeTo(null);
                gameFrame.setResizable(false);

                FlappyBird flappyBird = new FlappyBird();
                gameFrame.add(flappyBird);
                gameFrame.pack();
                flappyBird.requestFocus();
                gameFrame.setVisible(true);
            }
        });

        panel.add(tombolMulai);
        menuFrame.add(panel);
        menuFrame.setVisible(true);
    }
}
