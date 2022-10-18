package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static java.awt.Color.lightGray;

public class Welcome implements ActionListener{
    static JFrame welcomeFrame = new JFrame();
    static JPanel welcomePanel = new JPanel();
    static JLabel imageLabel = new JLabel();

    static JLabel wizzair = new JLabel();
    static JLabel monarch = new JLabel();
    static JLabel lufthansa = new JLabel();
    static JLabel ryanair = new JLabel();
    static JLabel blueair = new JLabel();
    static JLabel tarom = new JLabel();
    static JLabel message1 = new JLabel();
    static JLabel message2 = new JLabel();
    static JButton button1 = new JButton();
    static JLabel message3 = new JLabel();

    public void setWelcomeUI(){
        welcomeFrame.setTitle("Traian Vuia Airport-Timisoara");
        welcomeFrame.setSize(2000,2000);
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.add(welcomePanel);

        welcomePanel.setBackground(lightGray);
        welcomePanel.setLayout(null);

        imageLabel.setBounds(350,-300,2000,1100);
        ImageIcon img = new ImageIcon("/Users/andrei-r.ionescu/Desktop/java/TimisoaraAirport/src/ui/TSR.jpg");
        imageLabel.setIcon(img);
        welcomePanel.add(imageLabel);

        wizzair.setBounds(50, 50, 180, 100);
        wizzair.setText("WIZZAIR!");
        wizzair.setFont(new Font("Serif", Font.BOLD, 34));
        wizzair.setForeground(Color.magenta);
        welcomePanel.add(wizzair);

        monarch.setBounds(35, 180, 310, 100);
        monarch.setText("MONARCH.CO.UK");
        monarch.setFont(new Font("Serif", Font.BOLD, 34));
        monarch.setForeground(Color.blue);
        welcomePanel.add(monarch);

        lufthansa.setBounds(50, 310, 310, 100);
        lufthansa.setText("LUFTHANSA");
        lufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        lufthansa.setForeground(Color.blue);
        welcomePanel.add(lufthansa);

        ryanair.setBounds(1100, 50, 310, 100);
        ryanair.setText("RYANAIR");
        ryanair.setFont(new Font("Serif", Font.BOLD, 34));
        ryanair.setForeground(Color.yellow);
        welcomePanel.add(ryanair);

        blueair.setBounds(1100, 180, 310, 100);
        blueair.setText("BLUE AIR");
        blueair.setFont(new Font("Serif", Font.BOLD, 34));
        blueair.setForeground(Color.blue);
        welcomePanel.add(blueair);

        tarom.setBounds(1100, 310, 310, 100);
        tarom.setText("TAROM");
        tarom.setFont(new Font("Serif", Font.BOLD, 34));
        tarom.setForeground(Color.blue);
        welcomePanel.add(tarom);

        message1.setBounds(250, 500, 900, 150 );
        message1.setText("Welcome to the Timisoara's Airport home page!");
        message1.setFont(new Font("Serif", Font.BOLD, 40));
        message1.setForeground(Color.black);
        welcomePanel.add(message1);

        message2.setBounds(100, 600, 900, 150 );
        message2.setText("Please click");
        message2.setFont(new Font("Serif", Font.BOLD, 40));
        message2.setForeground(Color.black);
        welcomePanel.add(message2);

        button1.setBounds(300, 655, 100, 40);
        button1.setText("here");
        button1.setFont(new Font("Serif", Font.BOLD, 40));
        welcomePanel.add(button1);

        message3.setBounds(400, 600, 900, 150 );
        message3.setText("to see our possible destinations!");
        message3.setFont(new Font("Serif", Font.BOLD, 40));
        message3.setForeground(Color.black);
        welcomePanel.add(message3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Destinations d = new Destinations();

                welcomeFrame.setVisible(false);

                d.setDestinationsUI();
            }
        });


        welcomeFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
