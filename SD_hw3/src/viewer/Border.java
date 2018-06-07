package viewer;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

public class Border {
	private FileViewer fileviewer;
	private boolean isUsed;

	public Border(FileViewer fileViewer) {
		this.fileviewer = fileViewer;
		isUsed = true;
	}

	protected void toggle(JScrollPane com) {
		if (!isUsed) {
			com.setBorder(BorderFactory.createLineBorder(Color.black));
		} else {
			com.setBorder(null);
		}

		fileviewer.setPane(com);
		isUsed = !isUsed;
	}
}
