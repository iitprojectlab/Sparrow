package our;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		///UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		MainInterface mI=new MainInterface();
		mI.setVisible(true);
	}

}
