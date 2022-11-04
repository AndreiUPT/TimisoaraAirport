package ui;

import javax.swing.*;

import java.awt.*;

import static java.awt.Color.blue;

public class BlueairTicket {
    static JFrame blueairFrame = new JFrame();
    static JPanel blueairPanel = new JPanel();
    static JLabel bucurestiTicket2 = new JLabel("Bucuresti(RO) - OTOPENI");
    static JLabel iasiTicket = new JLabel("Iasi(RO) - Airport");
    static JLabel parisTicket2 = new JLabel("Paris(F) - BOVEAU");

    public void setBlueairTicket(){
        blueairFrame.setTitle("BLUEAIR Ticket");
        blueairFrame.setSize(2000,2000);
        blueairFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blueairFrame.add(blueairPanel);

        blueairPanel.setBackground(blue);
        blueairPanel.setLayout(null);

        blueairFrame.setVisible(true);
    }

    public static void setBucurestiTicket2(){
        bucurestiTicket2.setBounds(470, 25, 550, 100);
        bucurestiTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        bucurestiTicket2.setForeground(Color.cyan);
        blueairPanel.add(bucurestiTicket2);
    }

    public static void setIasiTicket(){
        iasiTicket.setBounds(470, 25, 550, 100);
        iasiTicket.setFont(new Font("Serif", Font.BOLD, 43));
        iasiTicket.setForeground(Color.cyan);
        blueairPanel.add(iasiTicket);
    }

    public static void setParisTicket2(){
        parisTicket2.setBounds(470, 25, 550, 100);
        parisTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        parisTicket2.setForeground(Color.cyan);
        blueairPanel.add(parisTicket2);
    }


}
