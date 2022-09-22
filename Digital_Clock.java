package javaproject;

import java.awt.Font;
import java.awt.GridLayout;

//import java.sql.Date;


//import javax.print.attribute.DateTimeSyntax;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Digital_Clock extends JFrame
{
	private JLabel heading;
	private JLabel clockLabel;
	
	
	private Font font = new Font("" , Font.BOLD, 35);

	Digital_Clock()
	{
		super.setTitle("Sagar's clock");
		super.setSize(400 , 400);
		super.setLocation(300, 50);
		this.createGUI();
		this.startClock();
		super.setVisible(true);
	}
	

	public void createGUI()
	{
		heading = new JLabel("sagar's clock");
		clockLabel = new JLabel("clock");
		
		heading .setFont(font);
		clockLabel.setFont(font);
		
		
		
		this.setLayout(new GridLayout(2 ,1));
		this.add(heading);
		this.add(clockLabel);
	}
	public void startClock()
	{
		
		//ActionList al= new ActionList();
		//Timer timer =  new Timer();
		 String  Datetime = new java.util.Date().toString();
		
		clockLabel.setText( Datetime);
	}

}

