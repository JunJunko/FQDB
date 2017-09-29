package database.log.undo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import database.bean.undo.UndoBean;

public class UndoLog {

	static private File UndoLog = new File(new String("log/Undo.log"));
	
	private StringBuffer UndoBuffer;

	public Boolean WriteUndoLog(UndoBean Undo) {
		Boolean WriterStatus = true;
		try {
			FileUtils.writeStringToFile(UndoLog, Undo.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			WriterStatus = false;
		}
		return WriterStatus;

	}
	
	public Boolean WriteUndoLog(UndoBean Undo) {}

}
