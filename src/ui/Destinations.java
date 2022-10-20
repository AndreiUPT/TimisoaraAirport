package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.lightGray;

public class Destinations {
    static JFrame destinationsFrame = new JFrame();
    static JPanel destinationsPanel = new JPanel();
    static JButton back1 = new JButton("Back");
    static JLabel message4 = new JLabel();
    static JLabel barcelona = new JLabel();
    static JLabel bruxelles = new JLabel();
    static JLabel bucuresti = new JLabel();
    static JLabel cagliari = new JLabel();
    static JLabel cluj = new JLabel();
    static JLabel dortmund = new JLabel();
    static JLabel iasi = new JLabel();
    static JLabel koln = new JLabel();


    static JButton monarchBarcelona = new JButton("MONARCH");
    static JButton ryanairBarcelona = new JButton("RYANAIR");
    static JButton wizzairBarcelona = new JButton("WIZZAIR");
    static JButton wizzairBruxelles = new JButton("WIZZAIR");
    static JButton taromBruxelles = new JButton("TAROM");
    static JButton taromBucuresti = new JButton("TAROM");
    static JButton blueairBucuresti = new JButton("BLUE AIR");
    static JButton wizzairCagliari = new JButton("WIZZAIR");
    static JButton taromCluj = new JButton("TAROM");
    static JButton lufthansaDortmund = new JButton("LUFTHANSA");
    static JButton wizzairDortmund = new JButton("WIZZAIR");
    static JButton blueairIasi = new JButton("BLUE AIR");
    static JButton lufthansaKoln = new JButton("LUFTHANSA");
    static JButton wizzairKoln = new JButton("WIZZAIR");


    public void setDestinationsUI() {
        destinationsFrame.setTitle("Traian Vuia Airport-Timisoara");
        destinationsFrame.setSize(2000, 2000);
        destinationsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        destinationsFrame.add(destinationsPanel);

        destinationsPanel.setBackground(lightGray);
        destinationsPanel.setLayout(null);

        back1.setBounds(0, 0,100,40);
        back1.setFont(new Font("Serif", Font.BOLD, 40));
        destinationsPanel.add(back1);


        message4.setBounds(550, 14, 490, 70);
        message4.setText("DESTINATIONS");
        message4.setFont(new Font("Serif", Font.BOLD, 47));
        message4.setForeground(Color.black);
        destinationsPanel.add(message4);

    //city{
        barcelona.setBounds(100, 115, 240, 40);
        barcelona.setText("Barcelona(E)");
        barcelona.setFont(new Font("Serif", Font.BOLD, 31));
        barcelona.setForeground(Color.black);
        destinationsPanel.add(barcelona);

        bruxelles.setBounds(100, 195, 240, 40);
        bruxelles.setText("Bruxelles(B)");
        bruxelles.setFont(new Font("Serif", Font.BOLD, 31));
        bruxelles.setForeground(Color.black);
        destinationsPanel.add(bruxelles);

        bucuresti.setBounds(100, 275, 240, 40);
        bucuresti.setText("Bucuresti(RO)");
        bucuresti.setFont(new Font("Serif", Font.BOLD, 31));
        bucuresti.setForeground(Color.black);
        destinationsPanel.add(bucuresti);

        cagliari.setBounds(100, 355, 240, 40);
        cagliari.setText("Cagliari(I)");
        cagliari.setFont(new Font("Serif", Font.BOLD, 31));
        cagliari.setForeground(Color.black);
        destinationsPanel.add(cagliari);

        cluj.setBounds(100, 435, 240, 40);
        cluj.setText("Cluj(RO)");
        cluj.setFont(new Font("Serif", Font.BOLD, 31));
        cluj.setForeground(Color.black);
        destinationsPanel.add(cluj);

        dortmund.setBounds(100, 515, 240, 40);
        dortmund.setText("Dortmund(D)");
        dortmund.setFont(new Font("Serif", Font.BOLD, 31));
        dortmund.setForeground(Color.black);
        destinationsPanel.add(dortmund);

        iasi.setBounds(100, 595, 240, 40);
        iasi.setText("Iasi(RO)");
        iasi.setFont(new Font("Serif", Font.BOLD, 31));
        iasi.setForeground(Color.black);
        destinationsPanel.add(iasi);

        koln.setBounds(100, 675, 240, 40);
        koln.setText("Koln(D)");
        koln.setFont(new Font("Serif", Font.BOLD, 31));
        koln.setForeground(Color.black);
        destinationsPanel.add(koln);
    //}

        //buttons{
        monarchBarcelona.setBounds(300, 115,140,40);
        monarchBarcelona.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(monarchBarcelona);
        ryanairBarcelona.setBounds(440, 115,140,40);
        ryanairBarcelona.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(ryanairBarcelona);
        wizzairBarcelona.setBounds(580, 115,140,40);
        wizzairBarcelona.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(wizzairBarcelona);

        wizzairBruxelles.setBounds(300, 195,140,40);
        wizzairBruxelles.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(wizzairBruxelles);
        taromBruxelles.setBounds(440, 195,140,40);
        taromBruxelles.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(taromBruxelles);

        taromBucuresti.setBounds(300, 275,140,40);
        taromBucuresti.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(taromBucuresti);
        blueairBucuresti.setBounds(440, 275,140,40);
        blueairBucuresti.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(blueairBucuresti);

        wizzairCagliari.setBounds(300, 355,140,40);
        wizzairCagliari.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(wizzairCagliari);

        taromCluj.setBounds(300, 435,140,40);
        taromCluj.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(taromCluj);

        lufthansaDortmund.setBounds(300, 515,140,40);
        lufthansaDortmund.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(lufthansaDortmund);
        wizzairDortmund.setBounds(440, 515,140,40);
        wizzairDortmund.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(wizzairDortmund);

        blueairIasi.setBounds(300, 595,140,40);
        blueairIasi.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(blueairIasi);

        lufthansaKoln.setBounds(300, 675,140,40);
        lufthansaKoln.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(lufthansaKoln);
        wizzairKoln.setBounds(440, 675,140,40);
        wizzairKoln.setFont(new Font("Serif", Font.BOLD, 20));
        destinationsPanel.add(wizzairKoln);

        //}


        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Welcome wlk = new Welcome();

                destinationsFrame.setVisible(false);

                wlk.setWelcomeUI();
            }
        });

        destinationsFrame.setVisible(true);

    }
}
