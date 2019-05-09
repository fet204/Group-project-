package inclass;

import java.io.*;
import java.util.*;

/** Models JavaPad's internal state. */
public class JavaPadModel {
	private String text;
	private String lastFileName;
	private int version;
	
	/** Constructs a new model. */
	public JavaPadModel() {
		text = "";
		lastFileName = null;
		version = 1;
	}
	
	/** Returns text of the file being edited.*  @return the text.*/
	public String getText() {
		return text;
	}
	
	/** Returns version number of the file being edited.*  @return the version.*/
	public int getVersion() {
		return version;
		}
	
	
	public boolean load(String filename) {
		boolean result = true;
		try {
			Scanner in = new Scanner(new File(filename));
			String newtext = "";
			while (in.hasNextLine()) {
				newtext += in.nextLine() + "\n";
			}
			
			text = newtext;
			}
		
		catch (IOException ioe) {
			result = false;
			}
		return result;
		}
	
	
	public boolean save(String filename) {
		boolean result = true;
		try {
			PrintStream out = new PrintStream(new File(filename));
			out.print(text);
			lastFileName = filename;
			}
catch (IOException ioe) {
	result = false;
	}
		return result;
		}
	public void setUndoPoint(String text) {
			this.text = text;
			version++;
	}
	}