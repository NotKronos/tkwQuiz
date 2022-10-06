package me.notkronos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.util.Objects;

public class TrojmianKw extends JFrame implements ActionListener {
	float score = 0;
	JButton button;
	JTextField[] textFields = new JTextField[12];
	JLabel polecenie, a, b, c, d;
	String[] answers = { "x^2", "-2x", "-8", "x^2", "10x", "16", "x^2", "3x", "-18", "x^2", "-10x", "21"};
	public TrojmianKw() {
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(800, 600);
		setLayout(null);
		
		polecenie = new JLabel("Rozwiaz. Podniesie do potegi nalezy zapisac jako \"x^n\", miedzy minusem a liczba nie nalezy stawiac spacji.");
		polecenie.setBounds(79, -10, 798, 80);
		this.add(polecenie);
		
		a = new JLabel("(x + 2)(x-4) = ");
		a.setBounds(30, 30, 400, 80);
		this.add(a);

		textFields[0] = new JTextField();
		textFields[0].setBounds(30, 80, 40, 15);
		this.add(textFields[0]);
		setVisible(true);

		textFields[1] = new JTextField();
		textFields[1].setBounds(90, 80, 40, 15);
		this.add(textFields[1]);
		setVisible(true);

		textFields[2] = new JTextField();
		textFields[2].setBounds(150, 80, 40, 15);
		this.add(textFields[2]);
		setVisible(true);

		b = new JLabel("(x + 2)(x + 8) = ");
		b.setBounds(30, 120, 400, 80);
		this.add(b);

		textFields[3] = new JTextField();
		textFields[3].setBounds(30, 170, 40, 15);
		this.add(textFields[3]);
		setVisible(true);

		textFields[4] = new JTextField();
		textFields[4].setBounds(90, 170, 40, 15);
		this.add(textFields[4]);
		setVisible(true);

		textFields[5] = new JTextField();
		textFields[5].setBounds(150, 170, 40, 15);
		this.add(textFields[5]);
		setVisible(true);

		c = new JLabel("(x - 3)(x + 6) = ");
		c.setBounds(30, 210, 400, 80);
		this.add(c);

		textFields[6] = new JTextField();
		textFields[6].setBounds(30, 260, 40, 15);
		this.add(textFields[6]);
		setVisible(true);

		textFields[7] = new JTextField();
		textFields[7].setBounds(90, 260, 40, 15);
		this.add(textFields[7]);
		setVisible(true);

		textFields[8] = new JTextField();
		textFields[8].setBounds(150, 260, 40, 15);
		this.add(textFields[8]);
		setVisible(true);

		d = new JLabel("(x - 7)(x - 3) = ");
		d.setBounds(30, 300, 400, 80);
		this.add(d);

		textFields[9] = new JTextField();
		textFields[9].setBounds(30, 350, 40, 15);
		this.add(textFields[9]);
		setVisible(true);

		textFields[10] = new JTextField();
		textFields[10].setBounds(90, 350, 40, 15);
		this.add(textFields[10]);
		setVisible(true);

		textFields[11] = new JTextField();
		textFields[11].setBounds(150, 350, 40, 15);
		this.add(textFields[11]);

		button  = new JButton("Check");
		button.addActionListener(this);
		button.setActionCommand("cmdOK");
		button.setBounds(66, 400, 80, 25);
		this.add(button);

		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("cmdOK")) {
			score = 0;
			try {
				for(int i = 0; i < 12; i++) {
					if(Objects.equals(textFields[i].getText(), answers[i])) score += 1;
				}

				String result = "Twoj wynik to " + score + "/12 punktow";

				JOptionPane.showMessageDialog(this, result, "informacja o wyniku", JOptionPane.INFORMATION_MESSAGE);
			} catch (NumberFormatException e) {
				System.err.println("i/o error");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new TrojmianKw();
	}
}
