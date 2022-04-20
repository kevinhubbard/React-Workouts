import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreateWorkoutPanel extends JPanel {
	JButton arm = new JButton("Arms");
	JButton back = new JButton("Back");
	JButton chest = new JButton("Chest");
	
	//Constructor
	public CreateWorkoutPanel() {
		arm.setPreferredSize(new Dimension(150,150));
		back.setPreferredSize(new Dimension(150,150));
		chest.setPreferredSize(new Dimension(150,150));
		add(arm);
		add(back);
		add(chest);
	}
}