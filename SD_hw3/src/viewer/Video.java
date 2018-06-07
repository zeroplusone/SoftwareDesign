package viewer;

import java.io.File;

import javax.swing.JComponent;

public class Video extends Format {

	public Video(FileViewer fileViewer, File file) {
		super(fileViewer, file);
		System.out.println("I have a video view");
	}

	public JComponent getContent() {
		return null;
	}
}
