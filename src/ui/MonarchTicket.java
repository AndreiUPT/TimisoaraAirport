package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.blue;
import static java.awt.Color.white;

public class MonarchTicket {
    static JFrame monarchFrame = new JFrame();
    static JPanel monarchPanel = new JPanel();
    static JLabel barcelonaTicket2 = new JLabel("Barcelona(E) - EL PRAT - 127$");
    static JLabel londonTicket = new JLabel("London(UK) - LUTON - 125$");
    static JLabel manchesterTicket = new JLabel("Manchester(UK) - Airport - 117$");

    //for ticket ui
    static JLabel nameMonarch = new JLabel("NAME:");
    static JTextField nameTextMonarch = new JTextField();
    static JLabel surnameMonarch = new JLabel("SURNAME:");
    static JTextField surnameTextMonarch = new JTextField();
    static JLabel emailMonarch = new JLabel("E-MAIL:");
    static JTextField emailTextMonarch = new JTextField();
    static JLabel phoneMonarch = new JLabel("PHONE:");
    static JTextField phoneTextMonarch = new JTextField();
    static JLabel companyMonarchMessage = new JLabel("#VisitUKwithMonarch:)");
    static JButton monarchTicketButton = new JButton();
    //-----------------------


    public void setMonarchTicket(){
        monarchFrame.setTitle("MONARCH.CO.UK Ticket");
        monarchFrame.setSize(2000,2000);
        monarchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        monarchFrame.add(monarchPanel);

        monarchPanel.setBackground(blue);
        monarchPanel.setLayout(null);

        nameMonarch.setBounds(180, 140, 550, 100);
        nameMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        nameMonarch.setForeground(Color.orange);
        monarchPanel.add(nameMonarch);

        nameTextMonarch.setBounds(300, 161, 350, 60);
        nameTextMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        nameTextMonarch.setBackground(white);
        nameTextMonarch.setForeground(blue);
        monarchPanel.add(nameTextMonarch);

        surnameMonarch.setBounds(180, 240, 550, 100);
        surnameMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        surnameMonarch.setForeground(Color.orange);
        monarchPanel.add(surnameMonarch);

        surnameTextMonarch.setBounds(370, 261, 350, 60);
        surnameTextMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        surnameTextMonarch.setBackground(white);
        surnameTextMonarch.setForeground(blue);
        monarchPanel.add(surnameTextMonarch);

        emailMonarch.setBounds(180, 340, 550, 100);
        emailMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        emailMonarch.setForeground(Color.orange);
        monarchPanel.add(emailMonarch);

        emailTextMonarch.setBounds(320, 361, 350, 60);
        emailTextMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        emailTextMonarch.setBackground(white);
        emailTextMonarch.setForeground(blue);
        monarchPanel.add(emailTextMonarch);

        phoneMonarch.setBounds(180, 440, 550, 100);
        phoneMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        phoneMonarch.setForeground(Color.orange);
        monarchPanel.add(phoneMonarch);

        phoneTextMonarch.setBounds(320, 461, 350, 60);
        phoneTextMonarch.setFont(new Font("Serif", Font.BOLD, 34));
        phoneTextMonarch.setBackground(white);
        phoneTextMonarch.setForeground(blue);
        monarchPanel.add(phoneTextMonarch);

        companyMonarchMessage.setBounds(180, 540, 550, 100);
        companyMonarchMessage.setFont(new Font("Serif", Font.BOLD, 27));
        companyMonarchMessage.setForeground(Color.orange);
        monarchPanel.add(companyMonarchMessage);

        monarchTicketButton.setBounds(900, 355, 300, 110);
        monarchTicketButton.setText("Order your Monarch Ticket!");
        monarchTicketButton.setFont(new Font("Serif", Font.BOLD, 21));
        monarchPanel.add(monarchTicketButton);


        monarchTicketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emailM = emailTextMonarch.getText();

                JOptionPane.showMessageDialog(null, "Thank you for flying with us!We sent you a confirmation via e-mail:" + emailM + "!");
                return;
            }
        });



        monarchFrame.setVisible(true);
    }

    public void setBarcelonaTicket2(){
        barcelonaTicket2.setBounds(470, 25, 750, 100);
        barcelonaTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        barcelonaTicket2.setForeground(Color.orange);
        monarchPanel.add(barcelonaTicket2);
    }

    public void setLondonTicket(){
        londonTicket.setBounds(470, 25, 750, 100);
        londonTicket.setFont(new Font("Serif", Font.BOLD, 43));
        londonTicket.setForeground(Color.orange);
        monarchPanel.add(londonTicket);
    }

    public void setManchesterTicket(){
        manchesterTicket.setBounds(470, 25, 750, 100);
        manchesterTicket.setFont(new Font("Serif", Font.BOLD, 43));
        manchesterTicket.setForeground(Color.orange);
        monarchPanel.add(manchesterTicket);
    }

}
