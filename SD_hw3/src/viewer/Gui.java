package viewer;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Gui {
	private static JFrame frame;
	private final static int WIDTH = 540, HEIGHT = 400;
	private final JFileChooser fc = new JFileChooser();

	private static FileViewer fileViewer = null;
	private final static String formatString[] = new String[] { "text", "image", "video" };
	private final static int formatTypeNum = formatString.length;
	private JButton fileBtn[] = new JButton[formatTypeNum];

	private final static String displayString[] = new String[] { "border", "scroll"};
	private final static int displayTypeNum = displayString.length;
	private JButton displayBtn[] = new JButton[displayTypeNum];

	private static ActionListener formatListener;
	private static ActionListener displayListener;

	public static void main(String[] args) {
		new Gui();
	}

	public Gui() {
		createJFrame();
		createButton();
		showJFrame();
	}

	private void createJFrame() {

		frame = new JFrame("FileViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setResizable(false);
	}

	private void showJFrame() {
		frame.pack();
		frame.setVisible(true);

	}

	private void createButton() {

		formatListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				// create new FileViewer
				if(fileViewer!=null){
					fileViewer.finalize();
				}
				fileViewer = new FileViewer(frame);
				System.out.println("new file viewer " + command);
				File file=readFile();
				if(file!=null){
					if (formatString[0].equals(command)) {
						// text
				       fileViewer.setFormat(new Text(fileViewer,file));
					} else if (formatString[1].equals(command)) {
						// image
						fileViewer.setFormat(new Image(fileViewer, file));
					} else if (formatString[2].equals(command)) {
						// video
						fileViewer.setFormat(new Video(fileViewer,file));
					}
				}
			}
		};

		displayListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				System.out.println("toggle display " + command);
				if (displayString[0].equals(command)) {
					// border
					if (fileViewer != null)
						fileViewer.toggleBorder();
				} else if (displayString[1].equals(command)) {
					// scroll bar
					if (fileViewer != null)
						fileViewer.toggleScrollBar();
				}

			}

		};

		for (int i = 0; i < formatTypeNum; ++i) {
			fileBtn[i] = new JButton(formatString[i]);
			fileBtn[i].setActionCommand(formatString[i]);
			fileBtn[i].addActionListener(formatListener);
			fileBtn[i].setSize(80, 20);
			fileBtn[i].setLocation(100*i+10, 10);
			frame.add(fileBtn[i]);
		}
		for (int i = 0; i < displayTypeNum; ++i) {
			displayBtn[i] = new JButton(displayString[i]);
			displayBtn[i].setActionCommand(displayString[i]);
			displayBtn[i].addActionListener(displayListener);
			displayBtn[i].setSize(80,20);
			displayBtn[i].setLocation(100*i+10, 40);
			frame.add(displayBtn[i]);
		}

	}
	
	private File readFile(){
		int returnVal = fc.showOpenDialog(frame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            System.out.println("Opening: " + file.getName());
            return file;
        } else {
            System.out.println("Open command cancelled by user.");
            return null;
        }
	}

}
