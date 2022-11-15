package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;
import static java.awt.Color.magenta;

public class TaromTicket {
    static JFrame taromFrame = new JFrame();
    static JPanel taromPanel = new JPanel();
    static JLabel bruxellesTicket2= new JLabel("Bruxelles(B) - CHARLEROI - 88$");
    static JLabel bucurestiTicket = new JLabel("Bucuresti(RO) - OTOPENI - 120 RON");
    static JLabel clujTicket = new JLabel("Cluj(RO) - Airport - 60 RON");
    static JLabel milanoTicket2 = new JLabel("Milano(I) - BERGAMO - 200 RON");


    //for ticket ui
    static JLabel nameTarom = new JLabel("NAME:");
    static JTextField nameTextTarom = new JTextField();
    static JLabel surnameTarom = new JLabel("SURNAME:");
    static JTextField surnameTextTarom = new JTextField();
    static JLabel emailTarom = new JLabel("E-MAIL:");
    static JTextField emailTextTarom = new JTextField();
    static JLabel phoneTarom = new JLabel("PHONE:");
    static JTextField phoneTextTarom = new JTextField();
    static JLabel companyTaromMessage = new JLabel("Welcome to TAROM Ticket Homepage!");
    static JButton taromTicketButton = new JButton();
    //-----------------------



    public void setTaromTicket(){
        taromFrame.setTitle("TAROM Ticket");
        taromFrame.setSize(2000,2000);
        taromFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        taromFrame.add(taromPanel);

        taromPanel.setBackground(white);
        taromPanel.setLayout(null);

        nameTarom.setBounds(180, 140, 550, 100);
        nameTarom.setFont(new Font("Serif", Font.BOLD, 34));
        nameTarom.setForeground(Color.blue);
        taromPanel.add(nameTarom);

        nameTextTarom.setBounds(300, 161, 350, 60);
        nameTextTarom.setFont(new Font("Serif", Font.BOLD, 34));
        nameTextTarom.setBackground(blue);
        nameTextTarom.setForeground(white);
        taromPanel.add(nameTextTarom);

        surnameTarom.setBounds(180, 240, 550, 100);
        surnameTarom.setFont(new Font("Serif", Font.BOLD, 34));
        surnameTarom.setForeground(Color.blue);
        taromPanel.add(surnameTarom);

        surnameTextTarom.setBounds(370, 261, 350, 60);
        surnameTextTarom.setFont(new Font("Serif", Font.BOLD, 34));
        surnameTextTarom.setBackground(blue);
        surnameTextTarom.setForeground(white);
        taromPanel.add(surnameTextTarom);

        emailTarom.setBounds(180, 340, 550, 100);
        emailTarom.setFont(new Font("Serif", Font.BOLD, 34));
        emailTarom.setForeground(Color.blue);
        taromPanel.add(emailTarom);

        emailTextTarom.setBounds(320, 361, 350, 60);
        emailTextTarom.setFont(new Font("Serif", Font.BOLD, 34));
        emailTextTarom.setBackground(blue);
        emailTextTarom.setForeground(white);
        taromPanel.add(emailTextTarom);

        phoneTarom.setBounds(180, 440, 550, 100);
        phoneTarom.setFont(new Font("Serif", Font.BOLD, 34));
        phoneTarom.setForeground(Color.blue);
        taromPanel.add(phoneTarom);

        phoneTextTarom.setBounds(320, 461, 350, 60);
        phoneTextTarom.setFont(new Font("Serif", Font.BOLD, 34));
        phoneTextTarom.setBackground(blue);
        phoneTextTarom.setForeground(white);
        taromPanel.add(phoneTextTarom);

        companyTaromMessage.setBounds(180, 540, 550, 100);
        companyTaromMessage.setFont(new Font("Serif", Font.BOLD, 27));
        companyTaromMessage.setForeground(Color.blue);
        taromPanel.add(companyTaromMessage);

        taromTicketButton.setBounds(900, 355, 300, 110 );
        taromTicketButton.setText("Order your Tarom Ticket!");
        taromTicketButton.setFont(new Font("Serif", Font.BOLD, 21));
        taromTicketButton.setBackground(blue);
        taromPanel.add(taromTicketButton);


        taromTicketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emailT = emailTextTarom.getText();

                JOptionPane.showMessageDialog(null, "Thank you for flying with us!We sent you a confirmation via e-mail:" + emailT + "!");
                return;
            }
        });



        taromFrame.setVisible(true);
    }

    public static void setBruxellesTicket2(){
        bruxellesTicket2.setBounds(470, 25, 750, 100);
        bruxellesTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        bruxellesTicket2.setForeground(Color.blue);
        taromPanel.add(bruxellesTicket2);
    }

    public static void setBucurestiTicket(){
        bucurestiTicket.setBounds(470, 25, 750, 100);
        bucurestiTicket.setFont(new Font("Serif", Font.BOLD, 43));
        bucurestiTicket.setForeground(Color.blue);
        taromPanel.add(bucurestiTicket);
    }

    public static void setClujTicket(){
        clujTicket.setBounds(470, 25, 750, 100);
        clujTicket.setFont(new Font("Serif", Font.BOLD, 43));
        clujTicket.setForeground(Color.blue);
        taromPanel.add(clujTicket);
    }

    public static void setMilanoTicket2(){
        milanoTicket2.setBounds(470, 25, 750, 100);
        milanoTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        milanoTicket2.setForeground(Color.blue);
        taromPanel.add(milanoTicket2);
    }

}
