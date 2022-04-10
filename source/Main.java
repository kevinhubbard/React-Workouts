import java.awt.*;
import javax.swing.*;

public class Main {



	public static void guiSetup() {
			 JFrame frame = new JFrame("Workouts");
	 JPanel panel = new JPanel();
	 JButton addBtn = new JButton("Add");
		panel.add(addBtn);
		frame.setSize(new Dimension(500, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		guiSetup();
	}
}