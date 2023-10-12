package com.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameDemo extends JFrame implements ActionListener{
	JButton b1=new JButton("Exit");
	FrameDemo()
	{
		setVisible(true);
		setTitle("Calculator");
		setSize(300,200);
		add(b1);
		setLayout(new FlowLayout());
		b1.addActionListener(this);
	}
		public static void main(String[] args) 
		{
			FrameDemo f1= new FrameDemo();
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);
		
	}

}
