package our;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class HandleDocFile {
	public HandleDocFile(String s) {
	
		File f=new File(s);

		WordExtractor extractor = null ;
		try {
		
			FileInputStream fis=new FileInputStream(f.getAbsolutePath());
			HWPFDocument document=new HWPFDocument(fis);
			extractor = new WordExtractor(document);
			String [] fileData = extractor.getParagraphText();
			for(int i=0;i<fileData.length;i++){
				if(fileData[i] != null)
				new SoundCreate(fileData[i]);
			}
		}
		catch(Exception exep){
			System.out.println("error");
		}
	
	}
}
