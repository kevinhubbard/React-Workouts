import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static JMenuBar createMenu() {
		JMenuBar jmb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem nmi = new JMenuItem("New Workout");
		JMenuItem vmi = new JMenuItem("View Workout");
		JMenuItem emi = new JMenuItem("Exit");

		emi.addActionListener(new MenuListener());

		file.add(nmi);
		file.add(vmi);
		file.add(emi);

		jmb.add(file);
		return jmb;
	}

	public static void guiSetup() {
		JFrame frame = new JFrame("Workouts");
	 	JPanel panel = new JPanel();
	 	JButton addBtn = new JButton("Add");
		panel.add(addBtn);
		frame.setSize(new Dimension(500, 500));
		frame.setJMenuBar(createMenu());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		guiSetup();
	}

	private static class MenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("shit was clicked yo.");
		}
	}
}