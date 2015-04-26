package our;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class HandlaExelFile {
	public HandlaExelFile(String s) {
		File f=new File(s);
		InputStream inputStream = null;
		
		try
		{
			inputStream = new FileInputStream (f.getAbsolutePath());
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "Sorry File not found");
		}

		POIFSFileSystem fileSystem = null;

		try
		{
			fileSystem = new POIFSFileSystem (inputStream);
			
			HSSFWorkbook      workBook = new HSSFWorkbook (fileSystem);
			HSSFSheet         sheet    = workBook.getSheetAt (0);
			Iterator<HSSFRow> rows     = sheet.rowIterator ();
		
			while (rows.hasNext ())
			{
				HSSFRow row = rows.next ();
				int i=row.getRowNum();
				i++;
				new SoundCreate("Number "+Integer.toString(i));
				//System.out.println ("No " + i);
				
				// once get a row its time to iterate through cells.
				Iterator<HSSFCell> cells = row.cellIterator ();
				
					while (cells.hasNext ())
					{
					HSSFCell cell = cells.next ();
						switch (cell.getCellType ())
						{
						
							case HSSFCell.CELL_TYPE_NUMERIC :
							{
								String str=Double.toString(cell.getNumericCellValue());
								new SoundCreate(str);
								//System.out.println (cell.getNumericCellValue ());
								break;
							}
							
							case HSSFCell.CELL_TYPE_STRING :
							{
								HSSFRichTextString richTextString = cell.getRichStringCellValue ();
								//System.out.println (richTextString.getString ());
								new SoundCreate(richTextString.getString ());
								break;
							}
							
							default :
							{
								break;
							}
						}	//end cell type
					}	// end cell loop
			}	//end row loop
		}
	catch (IOException e)
	{
		JOptionPane.showMessageDialog(null, "sorry this part is not working now");
	}
	}

}
