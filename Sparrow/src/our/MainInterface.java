package our;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainInterface extends JFrame{
	private int length=120, width=30;
	
	public MainInterface() 
	{
		// TODO Auto-generated constructor stub
		setSize(500, 500);
		setLocationRelativeTo(null);
		//setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel=new JPanel();
		mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setLayout(null);
		
		//JPanel subPanel1=new JPanel();
		JButton start,inputText, inputFile, help,exit;
		
		//---------------------------------------------------start button----------------------------------
		start=new JButton("-->start<--");
		start.setBounds((getWidth()/2)-length/2, getHeight()/2, length, width);
		mainPanel.add(start);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new StartClass();
			}
		});
		
		//-----------------------------------------------------input Text----------------------------------
		inputText=new JButton("input text");
		inputText.setBounds((getWidth()/2)-length-width, getHeight()/2+width*2, length, width);
		mainPanel.add(inputText);
		inputText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new InputTextInterface();
			}
		});
		
		//-------------------------------------------------------input file-----------------------------------
		inputFile=new JButton("input file");
		inputFile.setBounds((getWidth()/2)+width, getHeight()/2+width*2, length, width);
		mainPanel.add(inputFile);
		inputFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new InputFileClass();
			}
		});
		
		
		//-------------------------------------------------------help----------------------------------------
		help=new JButton("help");
		help.setBounds((getWidth()/2)-length-length/2-width, getHeight()/2+width*4, length, width);
		mainPanel.add(help);
		help.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new HelpClass();
			}
		});
		
		//-------------------------------------------------exit-----------------------------------------------
		exit=new JButton("exit");
		exit.setBounds((getWidth()/2)+width+length/2, getHeight()/2+width*4, length, width);
		mainPanel.add(exit);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		add(mainPanel);
	}

}
