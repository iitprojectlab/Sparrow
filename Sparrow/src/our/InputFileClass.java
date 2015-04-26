package our;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InputFileClass {
	
	public InputFileClass() {
		// TODO Auto-generated constructor stub
		JFileChooser fChose=new JFileChooser();
		fChose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		
		
		int yes=fChose.showOpenDialog(null);
		if(yes==JFileChooser.CANCEL_OPTION) return;
		
		File fName=fChose.getSelectedFile();
		
		if(fName==null)
			JOptionPane.showInternalMessageDialog(null, "please Select a file");
		
		else{
			String s=fName.getAbsolutePath();
			if(s.endsWith(".txt"))
				new HandleTxtFile(s);
			else if(s.endsWith(".pdf"))
				new HandlePdfFile(s);
			else if(s.endsWith(".doc"))
				new HandleDocFile(s);
			else if(s.endsWith(".xls"))
				new HandlaExelFile(s);
			else
				JOptionPane.showMessageDialog(null, "Please Select .txt or .pdf or .doc format file");
			}
		
}
	/*
public static void main(String[] args) {
	new InputFileClass();
	}
	
	*/

}
