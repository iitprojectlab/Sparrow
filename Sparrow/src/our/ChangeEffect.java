package our;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChangeEffect {
	public ChangeEffect() {
		// TODO Auto-generated constructor stub
		final SoundCreate sc=new SoundCreate();
		
		int duration, rate, volume;
		final JFrame frame2=new JFrame("Change some effacts");
		frame2.setSize(700, 400);
		frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
		frame2.setLayout(null);
		frame2.setLocationRelativeTo(null);
		
		JLabel label1=new JLabel("DurationStretch");
		frame2.add(label1);
		label1.setBounds(20, 0, frame2.getWidth()/5, (frame2.getHeight()/3)-40);
		
		final JSlider slider1=new JSlider(SwingConstants.HORIZONTAL, 0, 300, sc.getDuration());
		slider1.setPaintTicks(true);
		slider1.setPaintTrack(true);
		slider1.setPaintLabels(true);
		slider1.setToolTipText("change DurationStretch");
		slider1.setCursor(new Cursor(12));
		slider1.setMajorTickSpacing(20);
		
		slider1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, slider.getValue());
				sc.setDuration((Integer)slider1.getValue());
			}
		});
		frame2.add(slider1);
		slider1.setBounds((frame2.getWidth()/5), 0, 100+3*frame2.getWidth()/5, (frame2.getHeight()/3)-40);
		
		
		
		JLabel label2=new JLabel("Frequency Rate");
		frame2.add(label2);
		label2.setBounds(20, frame2.getHeight()/3-40, frame2.getWidth()/5,(frame2.getHeight()/3)-40);
		
		final JSlider slider2=new JSlider(SwingConstants.HORIZONTAL, 0, 300, sc.getRate());
		slider2.setPaintTicks(true);
		slider2.setPaintTrack(true);
		slider2.setPaintLabels(true);
		slider2.setToolTipText("change Frequency Rate");
		slider2.setCursor(new Cursor(12));
		slider2.setMajorTickSpacing(20);
		
		slider2.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, slider.getValue());
				sc.setRate((Integer)slider2.getValue());
			}
		});
		frame2.add(slider2);
		slider2.setBounds((frame2.getWidth()/5), frame2.getHeight()/3-40, 100+3*frame2.getWidth()/5, (frame2.getHeight()/3)-40);
		
		
		JLabel label3=new JLabel("Volume");
		frame2.add(label3);
		label3.setBounds(20, 2*frame2.getHeight()/3-80, frame2.getWidth()/5, (frame2.getHeight()/3)-40);
		
		final JSlider slider3=new JSlider(SwingConstants.HORIZONTAL, 0, 300, sc.getVolume());
		slider3.setPaintTicks(true);
		slider3.setPaintTrack(true);
		slider3.setPaintLabels(true);
		slider3.setToolTipText("change Volume");
		slider3.setCursor(new Cursor(12));
		slider3.setMajorTickSpacing(20);
		
		slider3.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, slider.getValue());
				sc.setVolume((Integer)slider3.getValue());
			}
		});
		frame2.add(slider3);
		slider3.setBounds((frame2.getWidth()/5), 2*frame2.getHeight()/3-80, 100+3*frame2.getWidth()/5, (frame2.getHeight()/3)-40);
		
		
		JButton ok=new JButton("ok");
		ok.setBounds((frame2.getWidth()/2)-80, frame2.getHeight()-80, 120, 30);
		frame2.add(ok);
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame2.setVisible(false);
			}
		});
		
		JButton back=new JButton("back");
		back.setBounds((frame2.getWidth()/2)+80, frame2.getHeight()-80, 120, 30);
		frame2.add(back);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame2.setVisible(false);
			}
		});
		
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
	}

}
