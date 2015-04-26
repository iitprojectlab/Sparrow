package our;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class HandlePdfFile {
	public HandlePdfFile(String s) {
		// TODO Auto-generated constructor stub
		String path = s;
		try
		{
	        PdfReader reader = new PdfReader(path);
	        int n = reader.getNumberOfPages();
	        String str=PdfTextExtractor.getTextFromPage(reader, n); //Extracting the content from a particular page.
	        String line = str+"\n";
	        System.out.println(line);
	        
	        new SoundCreate(line);

	     }
	     catch (Exception e)
	     {
	            System.out.println(e);
	     }	
	}

}
