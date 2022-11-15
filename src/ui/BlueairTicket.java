package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.blue;
import static java.awt.Color.white;

public class BlueairTicket {
    static JFrame blueairFrame = new JFrame();
    static JPanel blueairPanel = new JPanel();
    static JLabel bucurestiTicket2 = new JLabel("Bucuresti(RO) - OTOPENI - 60 RON");
    static JLabel iasiTicket = new JLabel("Iasi(RO) - Airport - 58 RON");
    static JLabel parisTicket2 = new JLabel("Paris(F) - BOVEAU - 300 RON");

    //for ticket ui
    static JLabel nameBlueair = new JLabel("NAME:");
    static JTextField nameTextBlueair = new JTextField();
    static JLabel surnameBlueair = new JLabel("SURNAME:");
    static JTextField surnameTextBlueair = new JTextField();
    static JLabel emailBlueair = new JLabel("E-MAIL:");
    static JTextField emailTextBlueair = new JTextField();
    static JLabel phoneBlueair = new JLabel("PHONE:");
    static JTextField phoneTextBlueair = new JTextField();
    static JLabel companyBlueairMessage = new JLabel("We are Romania's best way to fly!");
    static JButton blueairTicketButton = new JButton();
    //-----------------------


    public void setBlueairTicket(){
        blueairFrame.setTitle("BLUEAIR Ticket");
        blueairFrame.setSize(2000,2000);
        blueairFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blueairFrame.add(blueairPanel);

        blueairPanel.setBackground(blue);
        blueairPanel.setLayout(null);

        nameBlueair.setBounds(180, 140, 550, 100);
        nameBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        nameBlueair.setForeground(Color.cyan);
        blueairPanel.add(nameBlueair);

        nameTextBlueair.setBounds(300, 161, 350, 60);
        nameTextBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        nameTextBlueair.setBackground(white);
        nameTextBlueair.setForeground(blue);
        blueairPanel.add(nameTextBlueair);

        surnameBlueair.setBounds(180, 240, 550, 100);
        surnameBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        surnameBlueair.setForeground(Color.cyan);
        blueairPanel.add(surnameBlueair);

        surnameTextBlueair.setBounds(370, 261, 350, 60);
        surnameTextBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        surnameTextBlueair.setBackground(white);
        surnameTextBlueair.setForeground(blue);
        blueairPanel.add(surnameTextBlueair);

        emailBlueair.setBounds(180, 340, 550, 100);
        emailBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        emailBlueair.setForeground(Color.cyan);
        blueairPanel.add(emailBlueair);

        emailTextBlueair.setBounds(320, 361, 350, 60);
        emailTextBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        emailTextBlueair.setBackground(white);
        emailTextBlueair.setForeground(blue);
        blueairPanel.add(emailTextBlueair);

        phoneBlueair.setBounds(180, 440, 550, 100);
        phoneBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        phoneBlueair.setForeground(Color.cyan);
        blueairPanel.add(phoneBlueair);

        phoneTextBlueair.setBounds(320, 461, 350, 60);
        phoneTextBlueair.setFont(new Font("Serif", Font.BOLD, 34));
        phoneTextBlueair.setBackground(white);
        phoneTextBlueair.setForeground(blue);
        blueairPanel.add(phoneTextBlueair);

        companyBlueairMessage.setBounds(180, 540, 550, 100);
        companyBlueairMessage.setFont(new Font("Serif", Font.BOLD, 27));
        companyBlueairMessage.setForeground(Color.cyan);
        blueairPanel.add(companyBlueairMessage);

        blueairTicketButton.setBounds(900, 355, 300, 110 );
        blueairTicketButton.setText("Order your Blueair Ticket!");
        blueairTicketButton.setFont(new Font("Serif", Font.BOLD, 21));
        //blueairTicketButton.setBackground(blue);
        blueairPanel.add(blueairTicketButton);


        blueairTicketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emailB = emailTextBlueair.getText();

                JOptionPane.showMessageDialog(null, "Thank you for flying with us!We sent you a confirmation via e-mail:" + emailB + "!");
                return;
            }
        });



        blueairFrame.setVisible(true);
    }

    public static void setBucurestiTicket2(){
        bucurestiTicket2.setBounds(470, 25, 750, 100);
        bucurestiTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        bucurestiTicket2.setForeground(Color.cyan);
        blueairPanel.add(bucurestiTicket2);
    }

    public static void setIasiTicket(){
        iasiTicket.setBounds(470, 25, 750, 100);
        iasiTicket.setFont(new Font("Serif", Font.BOLD, 43));
        iasiTicket.setForeground(Color.cyan);
        blueairPanel.add(iasiTicket);
    }

    public static void setParisTicket2(){
        parisTicket2.setBounds(470, 25, 750, 100);
        parisTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        parisTicket2.setForeground(Color.cyan);
        blueairPanel.add(parisTicket2);
    }


}
