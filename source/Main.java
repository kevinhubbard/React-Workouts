import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	public static JFrame frame = new JFrame("Workouts");
	static CreateWorkoutPanel cwp = new CreateWorkoutPanel();
	static ViewWorkoutPanel vwp = new ViewWorkoutPanel();
	static CenterPanel centerPanel = new CenterPanel();
	static  	JPanel topPanel = new JPanel();


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
		
	
	 	
	 	JButton addBtn = new JButton("Add");
	 	JButton viewBtn = new JButton("View");
	 	addBtn.addActionListener(new AddListener());
	 	viewBtn.addActionListener(new ViewListener());
		topPanel.add(addBtn);
		topPanel.add(viewBtn);
		frame.setSize(new Dimension(500, 500));
		frame.setJMenuBar(createMenu());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, topPanel);
		frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
		frame.setVisible(true);
	}

/*	public void updateFrame(String a) {
		if (a.equals("add")) {
			frame.getContentPane().add(BorderLayout.CENTER, new CreateWorkoutPanel());
		} else if (a.equals("view")) {
			frame.getContentPane().add(BorderLayout.CENTER, new CreateWorkoutPanel());
		}
	}*/

	public static void main(String[] args) {
		guiSetup();
	}

	private static class MenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("shit was clicked yo.");
		}
	}

	private static class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.getContentPane().removeAll();
			frame.getContentPane().add(BorderLayout.NORTH, topPanel);
			frame.getContentPane().add(BorderLayout.CENTER, cwp);
			frame.revalidate();
			frame.repaint();
		}
	}

	private static class ViewListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//frame.removeAll();
			frame.getContentPane().removeAll();
			frame.getContentPane().add(BorderLayout.NORTH, topPanel);
			frame.getContentPane().add(BorderLayout.CENTER, vwp);
			frame.revalidate();
			frame.repaint();
		}
	}
}