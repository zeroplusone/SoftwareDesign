package viewer;

import javax.swing.JScrollPane;

public class ScrollBar {
	private FileViewer fileViewer;
	private Boolean isUsed;

	public ScrollBar(FileViewer fileViewer) {
		this.fileViewer = fileViewer;
		isUsed = false;

	}

	protected void toggle(JScrollPane com) {
		if (isUsed) {
			com.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			com.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		} else {
			com.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			com.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		}
		fileViewer.setPane(com);
		isUsed = !isUsed;
	}

}
