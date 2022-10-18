package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.lightGray;

public class Destinations {
    static JFrame destinationsFrame = new JFrame();
    static JPanel destinationsPanel = new JPanel();
    static JButton back1 = new JButton("Back");
    static JLabel message4 = new JLabel();

    public void setDestinationsUI() {
        destinationsFrame.setTitle("Traian Vuia Airport-Timisoara");
        destinationsFrame.setSize(2000, 2000);
        destinationsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        destinationsFrame.add(destinationsPanel);

        destinationsPanel.setBackground(lightGray);
        destinationsPanel.setLayout(null);

        back1.setBounds(0, 0,100,40);
        back1.setFont(new Font("Serif", Font.BOLD, 40));
        destinationsPanel.add(back1);

        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Welcome wlk = new Welcome();

                destinationsFrame.setVisible(false);

                wlk.setWelcomeUI();
            }
        });


        message4.setBounds(550, 14, 490, 70);
        message4.setText("DESTINATIONS");
        message4.setFont(new Font("Serif", Font.BOLD, 47));
        message4.setForeground(Color.black);
        destinationsPanel.add(message4);

        destinationsFrame.setVisible(true);

    }
}
