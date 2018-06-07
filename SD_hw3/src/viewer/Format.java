package viewer;

import java.io.File;

import javax.swing.JComponent;
import javax.swing.JLabel;

public class Format {
	private FileViewer fileviewer;
	protected File file;

	public Format(FileViewer fileViewer, File file) {
		this.fileviewer = fileViewer;
		this.file = file;
	}

	public JComponent getContent() {
		return new JLabel("Please click the (text, image, video) button to open file.");

	}

}
