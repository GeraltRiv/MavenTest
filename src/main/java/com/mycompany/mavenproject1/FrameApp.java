package com.mycompany.mavenproject1;
import java.awt.BorderLayout;

import javax.swing.JFrame;


public class FrameApp extends JFrame
{
	public FrameApp()
	{
		setBounds(100, 100, 280, 300);
		setTitle("Simple Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add( new PanelApp() );
		setVisible(true);
	}
}
