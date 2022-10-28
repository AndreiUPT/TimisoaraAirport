package ui;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.white;
import static java.awt.Color.yellow;

public class RyanairTicket {
    static JFrame ryanairFrame = new JFrame();
    static JPanel ryanairPanel = new JPanel();
    static JLabel barcelonaTicket3 = new JLabel("Barcelona(E) - EL PRAT");
    static JLabel londonTicket2 = new JLabel("London(UK) - LUTON");
    static JLabel manchesterTicket2 = new JLabel("Manchester(UK) - Airport");

    public void setRyanairTicket(){
        ryanairFrame.setTitle("RYANAIR Ticket");
        ryanairFrame.setSize(2000,2000);
        ryanairFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ryanairFrame.add(ryanairPanel);

        ryanairPanel.setBackground(yellow);
        ryanairPanel.setLayout(null);

        ryanairFrame.setVisible(true);
    }

    public void setBarcelonaTicket3(){
        barcelonaTicket3.setBounds(470, 25, 550, 100);
        barcelonaTicket3.setFont(new Font("Serif", Font.BOLD, 43));
        barcelonaTicket3.setForeground(Color.blue);
        ryanairPanel.add(barcelonaTicket3);
    }

    public void setLondonTicket2(){
        londonTicket2.setBounds(470, 25, 550, 100);
        londonTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        londonTicket2.setForeground(Color.blue);
        ryanairPanel.add(londonTicket2);
    }

    public void setManchesterTicket2(){
        manchesterTicket2.setBounds(470, 25, 550, 100);
        manchesterTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        manchesterTicket2.setForeground(Color.blue);
        ryanairPanel.add(manchesterTicket2);
    }

}
