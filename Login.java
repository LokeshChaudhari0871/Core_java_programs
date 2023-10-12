package com.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	JLabel user=new JLabel("Enter Username");
	JLabel pass=new JLabel("Enter Password");

	JTextField txtuser =new JTextField(10);
	JTextField txtpass =new JTextField(10);
	
	JButton login=new JButton("Login");
	Login()
	{
		setVisible(true);
		setSize(300, 300);
		setTitle("Logon Form");
		setLayout(new FlowLayout());
		add(user); add(txtuser);
		add(pass); add(txtpass);
		add(login);
		login.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String user=txtuser.getText();
		String pass =txtpass.getText();
		
		if(user.equals("Lokesh")&& pass.equals("lokesh@12")){
			JOptionPane.showMessageDialog(this, "Login Succesfully..");
		}
		else{
			JOptionPane.showMessageDialog(this, "Login fail");
		}
			
		
		if(user.equalsIgnoreCase(pass)){
		JOptionPane.showMessageDialog(this, "Login Succesfully");
		}
		else{
			JOptionPane.showMessageDialog(this, "Login fail");
		}
		
	}
}
