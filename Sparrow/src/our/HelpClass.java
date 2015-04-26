package our;

import javax.swing.JOptionPane;

public class HelpClass {

	public HelpClass() {
		// TODO Auto-generated constructor stub
		String str="Click 'input text' for manually input text\n" +
				"or click 'input file' for read a .txt file\n";
		JOptionPane.showMessageDialog(null, str);
	}
}
