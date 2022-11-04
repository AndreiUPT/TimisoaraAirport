package ui;

import javax.swing.*;

import java.awt.*;

import static java.awt.Color.blue;
import static java.awt.Color.white;

public class TaromTicket {
    static JFrame taromFrame = new JFrame();
    static JPanel taromPanel = new JPanel();
    static JLabel bruxellesTicket2= new JLabel("Bruxelles(B) - CHARLEROI");
    static JLabel bucurestiTicket = new JLabel("Bucuresti(RO) - OTOPENI");
    static JLabel clujTicket = new JLabel("Cluj(RO) - Airport");
    static JLabel milanoTicket2 = new JLabel("Milano(I) - BERGAMO");


    public void setTaromTicket(){
        taromFrame.setTitle("TAROM Ticket");
        taromFrame.setSize(2000,2000);
        taromFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        taromFrame.add(taromPanel);

        taromPanel.setBackground(white);
        taromPanel.setLayout(null);

        taromFrame.setVisible(true);
    }

    public static void setBruxellesTicket2(){
        bruxellesTicket2.setBounds(470, 25, 550, 100);
        bruxellesTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        bruxellesTicket2.setForeground(Color.blue);
        taromPanel.add(bruxellesTicket2);
    }

    public static void setBucurestiTicket(){
        bucurestiTicket.setBounds(470, 25, 550, 100);
        bucurestiTicket.setFont(new Font("Serif", Font.BOLD, 43));
        bucurestiTicket.setForeground(Color.blue);
        taromPanel.add(bucurestiTicket);
    }

    public static void setClujTicket(){
        clujTicket.setBounds(470, 25, 550, 100);
        clujTicket.setFont(new Font("Serif", Font.BOLD, 43));
        clujTicket.setForeground(Color.blue);
        taromPanel.add(clujTicket);
    }

    public static void setMilanoTicket2(){
        milanoTicket2.setBounds(470, 25, 550, 100);
        milanoTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        milanoTicket2.setForeground(Color.blue);
        taromPanel.add(milanoTicket2);
    }

}
