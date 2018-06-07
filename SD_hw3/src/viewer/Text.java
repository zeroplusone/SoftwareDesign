package viewer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JLabel;

public class Text extends Format {
	
	public Text(FileViewer fileViewer, File file){
		super(fileViewer,file);
		System.out.println("I have a TextView.");
	}
	public JComponent getContent(){
		try {
			return new JLabel(readFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String readFile() throws IOException{
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            sb.append(line);
		            sb.append("\n");
		            line = br.readLine();
		        }
		        return sb.toString();
		    } finally {
		        br.close();
		    }
	}
}
