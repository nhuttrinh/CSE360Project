package Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel activityLabel;
	private JLabel durationLabel;
	private JLabel dependencyLabel;
	private JLabel warningLabel;
	
	private JTextField activityTextField;
	private JTextField durationTextField;
	private JTextField dependencyTextField;
	
	private JButton addButton;
	private JButton commandButton;
	
public	GuiPanel () {
	

	
	nameLabel = new JLabel("ENTER DATA");

	
	activityLabel = new JLabel("Activity Name");

	
	durationLabel = new JLabel("Duration");

	
	dependencyLabel = new JLabel("Dependencies");

	
	warningLabel = new JLabel("Click 'OK' once all activities have been added.");
	
	activityTextField = new JTextField(10);
	
	
	durationTextField = new JTextField(3);
	
	
	dependencyTextField = new JTextField(10);
	
	
	addButton = new JButton ("Add");

	
	commandButton = new JButton ("OK");

	
	add(nameLabel);
	add(activityLabel);
	add(activityTextField);
	add(durationLabel);
	add(durationTextField);
	add(dependencyLabel);
	add(dependencyTextField);
	add(addButton);
	add(warningLabel);
	add(commandButton);
	
	setBackground (Color.LIGHT_GRAY);
	setPreferredSize (new Dimension(150, 250));
}
	
}
