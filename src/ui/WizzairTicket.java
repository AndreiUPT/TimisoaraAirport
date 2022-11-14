package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.magenta;
import static java.awt.Color.white;

public class WizzairTicket {
    static JFrame wizzairFrame = new JFrame();
    static JPanel wizzairPanel = new JPanel();
    static JLabel barcelonaTicket = new JLabel("Barcelona(E) - EL PRAT - 125$");
    static JLabel bruxellesTicket = new JLabel("Bruxelles(B) - CHARLEROI - 90$");
    static JLabel cagliariTicket = new JLabel("Cagliari(I) - ELMAS - 69$");
    static JLabel dortmundTicket = new JLabel("Dortmund(D) - Airport - 20$");
    static JLabel kolnTicket = new JLabel("Koln(D) - Airport - 15$");
    static JLabel madridTicket = new JLabel("Madrid(E) - BARAJAS - 99$");
    static JLabel milanoTicket = new JLabel("Milano(I) - BERGAMO - 120$");
    static JLabel parisTicket = new JLabel("Paris(F) - BOVEAU - 137$");

    //for ticket ui
    static JLabel nameWizzair = new JLabel("NAME:");
    static JTextField nameTextWizzair = new JTextField();
    static JLabel surnameWizzair = new JLabel("SURNAME:");
    static JTextField surnameTextWizzair = new JTextField();
    static JLabel emailWizzair = new JLabel("E-MAIL:");
    static JTextField emailTextWizzair = new JTextField();
    static JLabel phoneWizzair = new JLabel("PHONE:");
    static JTextField phoneTextWizzair = new JTextField();
    static JLabel companyWizzMessage = new JLabel("We're glad to have you as a customer!");
    static JButton wizzairTicketButton = new JButton();
   //-----------------------

    public void setWizzairTicket(){
        wizzairFrame.setTitle("WIZZAIR Ticket");
        wizzairFrame.setSize(2000,2000);
        wizzairFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wizzairFrame.add(wizzairPanel);

        wizzairPanel.setBackground(white);
        wizzairPanel.setLayout(null);

        nameWizzair.setBounds(180, 140, 550, 100);
        nameWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        nameWizzair.setForeground(Color.magenta);
        wizzairPanel.add(nameWizzair);

        nameTextWizzair.setBounds(300, 161, 350, 60);
        nameTextWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        nameTextWizzair.setBackground(magenta);
        nameTextWizzair.setForeground(white);
        wizzairPanel.add(nameTextWizzair);

        surnameWizzair.setBounds(180, 240, 550, 100);
        surnameWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        surnameWizzair.setForeground(Color.magenta);
        wizzairPanel.add(surnameWizzair);

        surnameTextWizzair.setBounds(370, 261, 350, 60);
        surnameTextWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        surnameTextWizzair.setBackground(magenta);
        surnameTextWizzair.setForeground(white);
        wizzairPanel.add(surnameTextWizzair);

        emailWizzair.setBounds(180, 340, 550, 100);
        emailWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        emailWizzair.setForeground(Color.magenta);
        wizzairPanel.add(emailWizzair);

        emailTextWizzair.setBounds(320, 361, 350, 60);
        emailTextWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        emailTextWizzair.setBackground(magenta);
        emailTextWizzair.setForeground(white);
        wizzairPanel.add(emailTextWizzair);

        phoneWizzair.setBounds(180, 440, 550, 100);
        phoneWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        phoneWizzair.setForeground(Color.magenta);
        wizzairPanel.add(phoneWizzair);

        phoneTextWizzair.setBounds(320, 461, 350, 60);
        phoneTextWizzair.setFont(new Font("Serif", Font.BOLD, 34));
        phoneTextWizzair.setBackground(magenta);
        phoneTextWizzair.setForeground(white);
        wizzairPanel.add(phoneTextWizzair);

        companyWizzMessage.setBounds(180, 540, 550, 100);
        companyWizzMessage.setFont(new Font("Serif", Font.BOLD, 27));
        companyWizzMessage.setForeground(Color.magenta);
        wizzairPanel.add(companyWizzMessage);

        wizzairTicketButton.setBounds(900, 355, 300, 110 );
        wizzairTicketButton.setText("Order your Wizzair Ticket!");
        wizzairTicketButton.setFont(new Font("Serif", Font.BOLD, 21));
        wizzairTicketButton.setBackground(magenta);
        wizzairPanel.add(wizzairTicketButton);


        wizzairTicketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailTextWizzair.getText();

                JOptionPane.showMessageDialog(null, "Thank you for flying with us!We sent you a confirmation via e-mail:" + email + "!");
                return;
            }
        });


        wizzairFrame.setVisible(true);
    }

    public void setBarcelonaTicket(){
        barcelonaTicket.setBounds(470, 25, 750, 100);
        barcelonaTicket.setFont(new Font("Serif", Font.BOLD, 43));
        barcelonaTicket.setForeground(Color.magenta);
        wizzairPanel.add(barcelonaTicket);
    }

    public static void setBruxellesTicket(){
        bruxellesTicket.setBounds(470, 25, 750, 100);
        bruxellesTicket.setFont(new Font("Serif", Font.BOLD, 43));
        bruxellesTicket.setForeground(Color.magenta);
        wizzairPanel.add(bruxellesTicket);
    }

    public static void setCagliariTicket(){
        cagliariTicket.setBounds(470, 25, 750, 100);
        cagliariTicket.setFont(new Font("Serif", Font.BOLD, 43));
        cagliariTicket.setForeground(Color.magenta);
        wizzairPanel.add(cagliariTicket);
    }

    public static void setDortmundTicket(){
        dortmundTicket.setBounds(470, 25, 750, 100);
        dortmundTicket.setFont(new Font("Serif", Font.BOLD, 43));
        dortmundTicket.setForeground(Color.magenta);
        wizzairPanel.add(dortmundTicket);
    }

    public static void setKolnTicket(){
        kolnTicket.setBounds(470, 25, 750, 100);
        kolnTicket.setFont(new Font("Serif", Font.BOLD, 43));
        kolnTicket.setForeground(Color.magenta);
        wizzairPanel.add(kolnTicket);
    }

    public static void setMadridTicket(){
        madridTicket.setBounds(470, 25, 750, 100);
        madridTicket.setFont(new Font("Serif", Font.BOLD, 43));
        madridTicket.setForeground(Color.magenta);
        wizzairPanel.add(madridTicket);
    }

    public static void setMilanoTicket(){
        milanoTicket.setBounds(470, 25, 750, 100);
        milanoTicket.setFont(new Font("Serif", Font.BOLD, 43));
        milanoTicket.setForeground(Color.magenta);
        wizzairPanel.add(milanoTicket);
    }

    public static void setParisTicket(){
        parisTicket.setBounds(470, 25, 750, 100);
        parisTicket.setFont(new Font("Serif", Font.BOLD, 43));
        parisTicket.setForeground(Color.magenta);
        wizzairPanel.add(parisTicket);
    }


}

