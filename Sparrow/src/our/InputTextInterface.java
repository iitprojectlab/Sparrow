package our;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InputTextInterface {
	
	public InputTextInterface() {
		// TODO Auto-generated constructor stub
		final JFrame frame1=new JFrame("Input Text Class");
		frame1.setSize(500, 500);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		frame1.setLayout(null);
		
		JPanel l=new JPanel();
		l.setBackground(Color.DARK_GRAY);
		final JTextArea area=new JTextArea(20,30);
		l.setBounds(20, 20, frame1.getWidth()-40, frame1.getHeight()-100);
		l.add(new JScrollPane(area),BorderLayout.CENTER);
		
		
		area.setWrapStyleWord(true);
		area.setLineWrap(true);
		JScrollPane pane = new JScrollPane(area);

		l.add(pane);
		frame1.add(l);
		
		JButton effect=new JButton("effect");
		effect.setBounds(20, frame1.getHeight()-70, 120, 30);
		frame1.add(effect);
		effect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new ChangeEffect();
			}
		});
		
		JButton ok=new JButton("ok");
		ok.setBounds((frame1.getWidth()/2)-80, frame1.getHeight()-70, 120, 30);
		frame1.add(ok);
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new SoundCreate(area.getText());
			}
		});
		
		JButton back=new JButton("back");
		back.setBounds((frame1.getWidth()/2)+100, frame1.getHeight()-70, 120, 30);
		frame1.add(back);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame1.setVisible(false);
			}
		});
		
		
		frame1.setVisible(true);
	}

}
