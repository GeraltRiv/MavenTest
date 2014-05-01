package com.mycompany.mavenproject1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;



public class PanelApp  extends JPanel
{
	JTextField txt = null;

	Calculator calc = new Calculator();
	
	int firstV=0;
	char sign = '0';
	String val = "";
	int num1 = 0;
	int num2 = 0;



	public PanelApp()
	{
		setLayout(null);
		txt = new JTextField();
		
		txt.setHorizontalAlignment(0);		
		txt.setBounds(0, 10, 273, 22);
		add(txt);
		
		
	class ActionL implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			val = btn.getText();
			String display = txt.getText();
			txt.setText(display+""+ val);
			
		}
		
	}
	class OpL implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			val = btn.getText();
			if(val.equals("="))
			{
				num2 = Integer.valueOf(txt.getText());
				int result = calc.funct(num1, num2, sign);
				txt.setText(String.valueOf(result));
				
			}
			else{
				num1 = Integer.valueOf(txt.getText());
				sign = val.charAt(0);
				txt.setText("");
			}
		}
	}
	
	ActionL AL = new ActionL();
	OpL OL = new OpL();
	
	JPanel btnPanel = new JPanel();
	btnPanel.setBackground(Color.ORANGE);
	btnPanel.setLayout(new GridLayout(4, 3));
	btnPanel.setBounds(5, 35, 200, 200);
	add(btnPanel);
	btnPanel.setVisible(true);
	
	String[] btns ={"7","8", "9", "4", "5", "6", "1", "2", "3", "0"};
	
	
		for(int i = 0; i < btns.length; i++)
		{
			JButton btn = new JButton(btns[i]);
			btnPanel.add(btn);
			btn.addActionListener(AL);
		}
		
		JPanel opP = new JPanel();
		opP.setBackground(Color.black);
		opP.setLayout(new GridLayout(5, 1));
		opP.setBounds(205, 35, 50, 200);
		add(opP);
		
		String[] ops={"-","+","*", "/","="};
		for(int i = 0; i < ops.length; i++)
		{
			JButton btn = new JButton(ops[i]);
			opP.add(btn);
			btn.addActionListener(OL);
		}
	}
}

