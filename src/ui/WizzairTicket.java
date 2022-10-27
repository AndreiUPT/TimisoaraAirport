package ui;

import javax.swing.*;

import java.awt.*;

import static java.awt.Color.*;

public class WizzairTicket {
    static JFrame wizzairFrame = new JFrame();
    static JPanel wizzairPanel = new JPanel();
    static JLabel barcelonaTicket = new JLabel("Barcelona(E) - EL PRAT");
    static JLabel bruxellesTicket = new JLabel("Bruxelles(B) - CHARLEROI");
    static JLabel cagliariTicket = new JLabel("Cagliari(I) - ELMAS");
    static JLabel dortmundTicket = new JLabel("Dortmund(D) - Airport");
    static JLabel kolnTicket = new JLabel("Koln(D) - Airport");
    static JLabel madridTicket = new JLabel("Madrid(E) - BARAJAS");
    static JLabel milanoTicket = new JLabel("Milano(I) - BERGAMO");
    static JLabel parisTicket = new JLabel("Paris(F) - BOVEAU");

    public void setWizzairTicket(){
        wizzairFrame.setTitle("WIZZAIR Ticket");
        wizzairFrame.setSize(2000,2000);
        wizzairFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wizzairFrame.add(wizzairPanel);

        wizzairPanel.setBackground(white);
        wizzairPanel.setLayout(null);

        wizzairFrame.setVisible(true);
    }

    public void setBarcelonaTicket(){
        barcelonaTicket.setBounds(470, 25, 550, 100);
        barcelonaTicket.setFont(new Font("Serif", Font.BOLD, 43));
        barcelonaTicket.setForeground(Color.magenta);
        wizzairPanel.add(barcelonaTicket);
    }

    public static void setBruxellesTicket(){
        bruxellesTicket.setBounds(470, 25, 550, 100);
        bruxellesTicket.setFont(new Font("Serif", Font.BOLD, 43));
        bruxellesTicket.setForeground(Color.magenta);
        wizzairPanel.add(bruxellesTicket);
    }

    public static void setCagliariTicket(){
        cagliariTicket.setBounds(470, 25, 550, 100);
        cagliariTicket.setFont(new Font("Serif", Font.BOLD, 43));
        cagliariTicket.setForeground(Color.magenta);
        wizzairPanel.add(cagliariTicket);
    }

    public static void setDortmundTicket(){
        dortmundTicket.setBounds(470, 25, 550, 100);
        dortmundTicket.setFont(new Font("Serif", Font.BOLD, 43));
        dortmundTicket.setForeground(Color.magenta);
        wizzairPanel.add(dortmundTicket);
    }

    public static void setKolnTicket(){
        kolnTicket.setBounds(470, 25, 550, 100);
        kolnTicket.setFont(new Font("Serif", Font.BOLD, 43));
        kolnTicket.setForeground(Color.magenta);
        wizzairPanel.add(kolnTicket);
    }

    public static void setMadridTicket(){
        madridTicket.setBounds(470, 25, 550, 100);
        madridTicket.setFont(new Font("Serif", Font.BOLD, 43));
        madridTicket.setForeground(Color.magenta);
        wizzairPanel.add(madridTicket);
    }

    public static void setMilanoTicket(){
        milanoTicket.setBounds(470, 25, 550, 100);
        milanoTicket.setFont(new Font("Serif", Font.BOLD, 43));
        milanoTicket.setForeground(Color.magenta);
        wizzairPanel.add(milanoTicket);
    }

    public static void setParisTicket(){
        parisTicket.setBounds(470, 25, 550, 100);
        parisTicket.setFont(new Font("Serif", Font.BOLD, 43));
        parisTicket.setForeground(Color.magenta);
        wizzairPanel.add(parisTicket);
    }
}
