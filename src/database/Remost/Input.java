package database.Remost;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Input {
	private BufferedReader bufferedReader;

	public void setInputLine (String Command) {
		InputStream in_withcode = null;
		try {
			in_withcode = new ByteArrayInputStream(Command.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bufferedReader = new BufferedReader(new InputStreamReader(in_withcode));
	}

	public String getInputLine() {
		String inputLine = null;
		try {
			inputLine = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputLine;
	}
}
