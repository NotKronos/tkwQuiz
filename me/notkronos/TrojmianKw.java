package me.notkronos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.*;

public class TrojmianKw extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JButton button;
	JTextField[] textFields = new JTextField[11];
	JLabel polecenie, a, b, c, d;
	public TrojmianKw() {
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(800, 600);
		setLayout(null);
		
		polecenie = new JLabel("Placeholder");
		polecenie.setBounds(350, -10, 390, 80);
		this.add(polecenie);
		
		a = new JLabel();
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		new TrojmianKw();
	}
}
