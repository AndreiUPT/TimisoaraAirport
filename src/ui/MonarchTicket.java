package ui;

import javax.swing.*;

import java.awt.*;

import static java.awt.Color.blue;
import static java.awt.Color.white;

public class MonarchTicket {
    static JFrame monarchFrame = new JFrame();
    static JPanel monarchPanel = new JPanel();
    static JLabel barcelonaTicket2 = new JLabel("Barcelona(E) - EL PRAT");
    static JLabel londonTicket = new JLabel("London(UK) - LUTON");
    static JLabel manchesterTicket = new JLabel("Manchester(UK) - Airport");


    public void setMonarchTicket(){
        monarchFrame.setTitle("MONARCH.CO.UK Ticket");
        monarchFrame.setSize(2000,2000);
        monarchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        monarchFrame.add(monarchPanel);

        monarchPanel.setBackground(blue);
        monarchPanel.setLayout(null);

        monarchFrame.setVisible(true);
    }

    public void setBarcelonaTicket2(){
        barcelonaTicket2.setBounds(470, 25, 550, 100);
        barcelonaTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        barcelonaTicket2.setForeground(Color.orange);
        monarchPanel.add(barcelonaTicket2);
    }

    public void setLondonTicket(){
        londonTicket.setBounds(470, 25, 550, 100);
        londonTicket.setFont(new Font("Serif", Font.BOLD, 43));
        londonTicket.setForeground(Color.orange);
        monarchPanel.add(londonTicket);
    }

    public void setManchesterTicket(){
        manchesterTicket.setBounds(470, 25, 550, 100);
        manchesterTicket.setFont(new Font("Serif", Font.BOLD, 43));
        manchesterTicket.setForeground(Color.orange);
        monarchPanel.add(manchesterTicket);
    }

}
