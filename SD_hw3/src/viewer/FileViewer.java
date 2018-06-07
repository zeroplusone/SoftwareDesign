package viewer;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class FileViewer {

	private ScrollBar scrollBar;
	private Border border;
	private Format format;
	private JFrame frame;
	private JScrollPane pane;

	public FileViewer(JFrame frame) {
		scrollBar = new ScrollBar(this);
		border = new Border(this);
		format = new Format(this, null);
		this.frame = frame;
	}

	protected void finalize() {
		clearGui();
		scrollBar = null;
		border = null;
		format = null;
	}

	public void setFormat(Format f) {
		format = f;
		clearGui();
		createComponent();
	}

	public void setPane(JScrollPane pane) {
		this.pane = pane;
		frame.revalidate();
	}

	private void createComponent() {
		pane = new JScrollPane();
		pane.setLocation(10, 100);
		pane.setSize(450, 200);
		pane.setViewportView(format.getContent());
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		pane.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(pane);
		System.out.println("add panel");
		frame.revalidate();

	}

	public void toggleScrollBar() {
		scrollBar.toggle(pane);
	}

	public void toggleBorder() {
		border.toggle(pane);
	}

	private void clearGui() {
		if (pane != null) {
			pane.setVisible(false);
			frame.remove(pane);
		}
	}
}
