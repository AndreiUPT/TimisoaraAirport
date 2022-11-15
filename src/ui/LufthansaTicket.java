package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.blue;
import static java.awt.Color.white;

public class LufthansaTicket {
    static JFrame lufthansaFrame = new JFrame();
    static JPanel lufthansaPanel = new JPanel();
    static JLabel dortmundTicket2 = new JLabel("Dortmund(D) - Airport - 120$");
    static JLabel kolnTicket2 = new JLabel("Koln(D) - Airport - 110$");


    //for ticket ui
    static JLabel nameLufthansa = new JLabel("NAME:");
    static JTextField nameTextLufthansa = new JTextField();
    static JLabel surnameLufthansa = new JLabel("SURNAME:");
    static JTextField surnameTextLufthansa = new JTextField();
    static JLabel emailLufthansa = new JLabel("E-MAIL:");
    static JTextField emailTextLufthansa = new JTextField();
    static JLabel phoneLufthansa = new JLabel("PHONE:");
    static JTextField phoneTextLufthansa = new JTextField();
    static JLabel companyLufthansaMessage = new JLabel("We are in constantly way to Germany!");
    static JButton lufthansaTicketButton = new JButton();
    //-----------------------

    public void setLufthansaTicket(){
        lufthansaFrame.setTitle("LUFTHANSA.DE Ticket");
        lufthansaFrame.setSize(2000,2000);
        lufthansaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lufthansaFrame.add(lufthansaPanel);

        lufthansaPanel.setBackground(blue);
        lufthansaPanel.setLayout(null);

        nameLufthansa.setBounds(180, 140, 550, 100);
        nameLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        nameLufthansa.setForeground(Color.yellow);
        lufthansaPanel.add(nameLufthansa);

        nameTextLufthansa.setBounds(300, 161, 350, 60);
        nameTextLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        nameTextLufthansa.setBackground(white);
        nameTextLufthansa.setForeground(blue);
        lufthansaPanel.add(nameTextLufthansa);

        surnameLufthansa.setBounds(180, 240, 550, 100);
        surnameLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        surnameLufthansa.setForeground(Color.yellow);
        lufthansaPanel.add(surnameLufthansa);

        surnameTextLufthansa.setBounds(370, 261, 350, 60);
        surnameTextLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        surnameTextLufthansa.setBackground(white);
        surnameTextLufthansa.setForeground(blue);
        lufthansaPanel.add(surnameTextLufthansa);

        emailLufthansa.setBounds(180, 340, 550, 100);
        emailLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        emailLufthansa.setForeground(Color.yellow);
        lufthansaPanel.add(emailLufthansa);

        emailTextLufthansa.setBounds(320, 361, 350, 60);
        emailTextLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        emailTextLufthansa.setBackground(white);
        emailTextLufthansa.setForeground(blue);
        lufthansaPanel.add(emailTextLufthansa);

        phoneLufthansa.setBounds(180, 440, 550, 100);
        phoneLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        phoneLufthansa.setForeground(Color.yellow);
        lufthansaPanel.add(phoneLufthansa);

        phoneTextLufthansa.setBounds(320, 461, 350, 60);
        phoneTextLufthansa.setFont(new Font("Serif", Font.BOLD, 34));
        phoneTextLufthansa.setBackground(white);
        phoneTextLufthansa.setForeground(blue);
        lufthansaPanel.add(phoneTextLufthansa);

        companyLufthansaMessage.setBounds(180, 540, 550, 100);
        companyLufthansaMessage.setFont(new Font("Serif", Font.BOLD, 27));
        companyLufthansaMessage.setForeground(Color.yellow);
        lufthansaPanel.add(companyLufthansaMessage);

        lufthansaTicketButton.setBounds(900, 355, 300, 110 );
        lufthansaTicketButton.setText("Order your Lufthansa Ticket!");
        lufthansaTicketButton.setFont(new Font("Serif", Font.BOLD, 21));
        //lufthansaTicketButton.setBackground(yellow);
        lufthansaPanel.add(lufthansaTicketButton);


        lufthansaTicketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emailL = emailTextLufthansa.getText();

                JOptionPane.showMessageDialog(null, "Thank you for flying with us!We sent you a confirmation via e-mail:" + emailL + "!");
                return;
            }
        });



        lufthansaFrame.setVisible(true);
    }

    public static void setDortmundTicket2(){
        dortmundTicket2.setBounds(470, 25, 750, 100);
        dortmundTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        dortmundTicket2.setForeground(Color.yellow);
        lufthansaPanel.add(dortmundTicket2);
    }

    public static void setKolnTicket2(){
        kolnTicket2.setBounds(470, 25, 750, 100);
        kolnTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        kolnTicket2.setForeground(Color.yellow);
        lufthansaPanel.add(kolnTicket2);
    }

}
