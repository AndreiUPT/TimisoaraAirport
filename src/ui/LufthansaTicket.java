package ui;

import javax.swing.*;

import java.awt.*;

import static java.awt.Color.blue;

public class LufthansaTicket {
    static JFrame lufthansaFrame = new JFrame();
    static JPanel lufthansaPanel = new JPanel();
    static JLabel dortmundTicket2 = new JLabel("Dortmund(D) - Airport");
    static JLabel kolnTicket2 = new JLabel("Koln(D) - Airport");

    public void setLufthansaTicket(){
        lufthansaFrame.setTitle("LUFTHANSA.DE Ticket");
        lufthansaFrame.setSize(2000,2000);
        lufthansaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lufthansaFrame.add(lufthansaPanel);

        lufthansaPanel.setBackground(blue);
        lufthansaPanel.setLayout(null);

        lufthansaFrame.setVisible(true);
    }

    public static void setDortmundTicket2(){
        dortmundTicket2.setBounds(470, 25, 550, 100);
        dortmundTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        dortmundTicket2.setForeground(Color.yellow);
        lufthansaPanel.add(dortmundTicket2);
    }

    public static void setKolnTicket2(){
        kolnTicket2.setBounds(470, 25, 550, 100);
        kolnTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        kolnTicket2.setForeground(Color.yellow);
        lufthansaPanel.add(kolnTicket2);
    }

}
