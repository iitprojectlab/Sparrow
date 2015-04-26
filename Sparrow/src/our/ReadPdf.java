package our;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class ReadPdf {

	public ReadPdf() 
	{
	   try 
	   {
           
			JFileChooser fChose=new JFileChooser();
			fChose.setFileSelectionMode(JFileChooser.FILES_ONLY);
			
			String line="",path;
			
			int yes=fChose.showOpenDialog(null);
			if(yes==JFileChooser.CANCEL_OPTION) return;
			
			File fName=fChose.getSelectedFile();
			
			if(fName==null)
				JOptionPane.showInternalMessageDialog(null, "please Select a file");
			
			else
			{
				path=fName.getAbsolutePath();
				try
				{
			        PdfReader reader = new PdfReader(path);
			        int n = reader.getNumberOfPages();
			        String str=PdfTextExtractor.getTextFromPage(reader, n); //Extracting the content from a particular page.
			        line+=str+"\n";
			        System.out.println(line);
			        
			        new SoundCreate(line);
		
			     }
			     catch (Exception e)
			     {
			            System.out.println(e);
			     }
			}// end of else		
	   }
	   catch (Exception e) 
	   {
		System.err.println(e);
	   }
	}

	 /*
	 public static void main(String[] args) {
		new ReadPdf();
	}
	*/
}

   
    
