package our;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleTxtFile {
	public HandleTxtFile(String s) {
		// TODO Auto-generated constructor stub
		String line,fileRead;
		
		File f=new File(s);
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(f.exists()){
			
			try {
				while((line=bf.readLine())!=null)
					new SoundCreate(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	}

}
