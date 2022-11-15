package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;
import static java.awt.Color.blue;

public class RyanairTicket {
    static JFrame ryanairFrame = new JFrame();
    static JPanel ryanairPanel = new JPanel();
    static JLabel barcelonaTicket3 = new JLabel("Barcelona(E) - EL PRAT - 130$");
    static JLabel londonTicket2 = new JLabel("London(UK) - LUTON - 122$");
    static JLabel manchesterTicket2 = new JLabel("Manchester(UK) - Airport - 111$");

    //for ticket ui
    static JLabel nameRyan = new JLabel("NAME:");
    static JTextField nameTextRyan = new JTextField();
    static JLabel surnameRyan = new JLabel("SURNAME:");
    static JTextField surnameTextRyan = new JTextField();
    static JLabel emailRyan = new JLabel("E-MAIL:");
    static JTextField emailTextRyan = new JTextField();
    static JLabel phoneRyan = new JLabel("PHONE:");
    static JTextField phoneTextRyan = new JTextField();
    static JLabel companyRyanMessage = new JLabel("We are trying to offer yourself the best prices!");
    static JButton ryanTicketButton = new JButton();
    //-----------------------


    public void setRyanairTicket(){
        ryanairFrame.setTitle("RYANAIR Ticket");
        ryanairFrame.setSize(2000,2000);
        ryanairFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ryanairFrame.add(ryanairPanel);

        ryanairPanel.setBackground(yellow);
        ryanairPanel.setLayout(null);

        nameRyan.setBounds(180, 140, 550, 100);
        nameRyan.setFont(new Font("Serif", Font.BOLD, 34));
        nameRyan.setForeground(Color.blue);
        ryanairPanel.add(nameRyan);

        nameTextRyan.setBounds(300, 161, 350, 60);
        nameTextRyan.setFont(new Font("Serif", Font.BOLD, 34));
        nameTextRyan.setBackground(white);
        nameTextRyan.setForeground(blue);
        ryanairPanel.add(nameTextRyan);

        surnameRyan.setBounds(180, 240, 550, 100);
        surnameRyan.setFont(new Font("Serif", Font.BOLD, 34));
        surnameRyan.setForeground(Color.blue);
        ryanairPanel.add(surnameRyan);

        surnameTextRyan.setBounds(370, 261, 350, 60);
        surnameTextRyan.setFont(new Font("Serif", Font.BOLD, 34));
        surnameTextRyan.setBackground(white);
        surnameTextRyan.setForeground(blue);
        ryanairPanel.add(surnameTextRyan);

        emailRyan.setBounds(180, 340, 550, 100);
        emailRyan.setFont(new Font("Serif", Font.BOLD, 34));
        emailRyan.setForeground(Color.blue);
        ryanairPanel.add(emailRyan);

        emailTextRyan.setBounds(320, 361, 350, 60);
        emailTextRyan.setFont(new Font("Serif", Font.BOLD, 34));
        emailTextRyan.setBackground(white);
        emailTextRyan.setForeground(blue);
        ryanairPanel.add(emailTextRyan);

        phoneRyan.setBounds(180, 440, 550, 100);
        phoneRyan.setFont(new Font("Serif", Font.BOLD, 34));
        phoneRyan.setForeground(Color.blue);
        ryanairPanel.add(phoneRyan);

        phoneTextRyan.setBounds(320, 461, 350, 60);
        phoneTextRyan.setFont(new Font("Serif", Font.BOLD, 34));
        phoneTextRyan.setBackground(white);
        phoneTextRyan.setForeground(blue);
        ryanairPanel.add(phoneTextRyan);

        companyRyanMessage.setBounds(180, 540, 550, 100);
        companyRyanMessage.setFont(new Font("Serif", Font.BOLD, 27));
        companyRyanMessage.setForeground(Color.blue);
        ryanairPanel.add(companyRyanMessage);

        ryanTicketButton.setBounds(900, 355, 300, 110 );
        ryanTicketButton.setText("Order your Ryanair Ticket!");
        ryanTicketButton.setFont(new Font("Serif", Font.BOLD, 21));
        ryanairPanel.add(ryanTicketButton);


        ryanTicketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emailR = emailTextRyan.getText();

                JOptionPane.showMessageDialog(null, "Thank you for flying with us!We sent you a confirmation via e-mail:" + emailR + "!");
                return;
            }
        });


        ryanairFrame.setVisible(true);
    }

    public void setBarcelonaTicket3(){
        barcelonaTicket3.setBounds(470, 25, 750, 100);
        barcelonaTicket3.setFont(new Font("Serif", Font.BOLD, 43));
        barcelonaTicket3.setForeground(Color.blue);
        ryanairPanel.add(barcelonaTicket3);
    }

    public void setLondonTicket2(){
        londonTicket2.setBounds(470, 25, 750, 100);
        londonTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        londonTicket2.setForeground(Color.blue);
        ryanairPanel.add(londonTicket2);
    }

    public void setManchesterTicket2(){
        manchesterTicket2.setBounds(470, 25, 750, 100);
        manchesterTicket2.setFont(new Font("Serif", Font.BOLD, 43));
        manchesterTicket2.setForeground(Color.blue);
        ryanairPanel.add(manchesterTicket2);
    }

}
