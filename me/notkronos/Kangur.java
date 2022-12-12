package me.notkronos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Kangur extends JFrame implements ActionListener {
    private JFrame frame;
    private JRadioButton b1, b2, b3, b4, b5,
            bb1, bb2, bb3, bb4, bb5,
            bB1, bB2, bB3, bB4, bB5,
            bBB1, bBB2, bBB3, bBB4, bBB5;
    private boolean b, bb, bbb, bbbb;
    private int wynik = 100;
    private JLabel ll2, ll2A, ll2B, ll2C,
            lll1, lll2, lll3,
            l1, l2, l3, l4;
    public Kangur() {
        super();
        frame = new JFrame();
        JButton k; // = new JButton();
        k = new JButton("sprawdz");


        k.addActionListener(this);
        k.setActionCommand("cmdOK");
        k.setBounds(310, 720, 100, 40);
        //Create the label
        JLabel label = new JLabel(">>>>> zadanie 16/1998", JLabel.CENTER);
        label.setBounds(130, 0, 140, 80);

        JLabel label1 = new JLabel("W pudełku jest 15 kul w kolorach białym, czerwonym i czarnym.");
        label1.setBounds(30, 50, 400, 80);

        JLabel label2 = new JLabel("Liczba kul białych jest 7 razy większa od liczby kul czerwonych.");
        label2.setBounds(30, 80, 400, 80);


        JLabel label3 = new JLabel("Ile czarnych kul znajduje się w pudełku?");
        label3.setBounds(30, 110, 400, 80);
        //DRUGIE ZADANIE
        ll2 = new JLabel(">>>>> zadanie 9/2008", JLabel.CENTER);
        ll2.setBounds(30, 180, 400, 80);

        ll2A = new JLabel("W roku 2008 konkurs \"Kangur Matematyczny\" odbywa się w Polsce po raz");
        ll2A.setBounds(30, 210, 460, 80);

        ll2B = new JLabel("siedemnasty. Magda uczestniczyła w siódmej edycji tego konkursu, gdy miała");
        ll2B.setBounds(30, 240, 480, 80);

        ll2C = new JLabel("10 lat. W którym roku urodziła się Magda?");
        ll2C.setBounds(30, 270, 480, 80);
        //TRZECIE ZADANIE
        lll1 = new JLabel(">>>>> zadanie 11/2008", JLabel.CENTER);
        lll1.setBounds(0, 340, 400, 80);

        lll2 = new JLabel("Gosia jest wyższa niż Ania, a niższa niż Tania. Irena jest wyższa niż Kasia, a niższa niż Gosia.");
        lll2.setBounds(30, 370, 520, 80);

        lll3 = new JLabel("Która z dziewcząt jest najwyższa?");
        lll3.setBounds(30, 400, 480, 80);
        //ZADANIE CZWARTE
        l1 = new JLabel(">>>>> zadanie 20/2008", JLabel.CENTER);
        l1.setBounds(30, 500, 400, 80);

        l2 = new JLabel("Piotr ma tyle samo braci co sióstr.");
        l2.setBounds(30, 530, 520, 80);

        l3 = new JLabel("Jego siostra Ania ma dwa razy więcej braci niż sióstr.");
        l3.setBounds(30, 550, 480, 80);

        l4 = new JLabel("Ile dzieci jest w tej rodzinie?");
        l4.setBounds(30, 570, 400, 80);
        //Create the radio buttons
        b1 = new JRadioButton("A. 1 ");
        b2 = new JRadioButton("B. 3 ");
        b3 = new JRadioButton("C. 5 ");
        b4 = new JRadioButton("D. 7 ");
        b5 = new JRadioButton("E. 9 ");

        bb1 = new JRadioButton("A. 1986 ");
        bb2 = new JRadioButton("B. 1983 ");
        bb3 = new JRadioButton("C. 1998 ");
        bb4 = new JRadioButton("D. 1990 ");
        bb5 = new JRadioButton("E. 1988 ");

        bB1 = new JRadioButton("A. Gosia ");
        bB2 = new JRadioButton("B. Ania ");
        bB3 = new JRadioButton("C. Kasia ");
        bB4 = new JRadioButton("D. Irena ");
        bB5 = new JRadioButton("E. Tania ");

        bBB1 = new JRadioButton("A. 3 ");
        bBB2 = new JRadioButton("B. 4 ");
        bBB3 = new JRadioButton("C. 5 ");
        bBB4 = new JRadioButton("D. 6 ");
        bBB5 = new JRadioButton("E. 7 ");
        //Set the position of the radio buttons
        b1.setBounds(40, 160, 60, 50);
        b2.setBounds(100, 160, 60, 50);
        b3.setBounds(160, 160, 60, 50);
        b4.setBounds(220, 160, 60, 50);
        b5.setBounds(280, 160, 60, 50);

        bb1.setBounds(40, 320, 100, 50);
        bb2.setBounds(140, 320, 100, 50);
        bb3.setBounds(240, 320, 100, 50);
        bb4.setBounds(340, 320, 100, 50);
        bb5.setBounds(440, 320, 100, 50);

        bB1.setBounds(40, 450, 100, 50);
        bB2.setBounds(140, 450, 100, 50);
        bB3.setBounds(240, 450, 100, 50);
        bB4.setBounds(340, 450, 100, 50);
        bB5.setBounds(440, 450, 100, 50);

        bBB1.setBounds(40, 630, 100, 50);
        bBB2.setBounds(140, 630, 100, 50);
        bBB3.setBounds(240, 630, 100, 50);
        bBB4.setBounds(340, 630, 100, 50);
        bBB5.setBounds(440, 630, 100, 50);

        //Add radio buttons to group
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        bg.add(b5);

        ButtonGroup bgg = new ButtonGroup();
        bgg.add(bb1);
        bgg.add(bb2);
        bgg.add(bb3);
        bgg.add(bb4);
        bgg.add(bb5);

        ButtonGroup grupa3 = new ButtonGroup();
        grupa3.add(bB1);
        grupa3.add(bB2);
        grupa3.add(bB3);
        grupa3.add(bB4);
        grupa3.add(bB5);

        ButtonGroup grupa4 = new ButtonGroup();
        grupa4.add(bBB1);
        grupa4.add(bBB2);
        grupa4.add(bBB3);
        grupa4.add(bBB4);
        grupa4.add(bBB5);
        //Add buttons to frame
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        frame.add(ll2);
        frame.add(ll2A);
        frame.add(ll2B);
        frame.add(ll2C);

        frame.add(lll1);
        frame.add(lll2);
        frame.add(lll3);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        frame.add(bb1);
        frame.add(bb2);
        frame.add(bb3);
        frame.add(bb4);
        frame.add(bb5);

        frame.add(bB1);
        frame.add(bB2);
        frame.add(bB3);
        frame.add(bB4);
        frame.add(bB5);

        frame.add(bBB1);
        frame.add(bBB2);
        frame.add(bBB3);
        frame.add(bBB4);
        frame.add(bBB5);


        frame.add(k);

        frame.setSize(800, 900);
        frame.setTitle("zadania z logiki");
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) { new Kangur(); }
}
