package viewer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Image extends Format {

	public Image(FileViewer fileViewer, File file) {
		super(fileViewer, file);
	}

	public JComponent getContent() {
		try {
			BufferedImage image = ImageIO.read(file);
			ImageIcon icon = new ImageIcon(image);
			JLabel label = new JLabel();
			label.setIcon(icon);
			return label;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
