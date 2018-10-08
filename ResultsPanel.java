package Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResultsPanel extends JPanel {
	
	private JLabel nameLabel1;
	private JLabel nameLabel2;
	private JLabel activityLabel;
	private JLabel durationLabel;
	private JLabel dependencyLabel;

	
	private JTextField activityTextField;
	private JTextField durationTextField;
	private JTextField dependencyTextField;
	
	private JButton addButton;
	private JButton resetButton;
	private JButton exitButton;
	
public	ResultsPanel () {
	
	JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

	JPanel flow2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	JPanel flow3Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	JPanel gridPanel1 = new JPanel (new GridLayout(2,1));
	JPanel gridPanel2 = new JPanel (new GridLayout(2,1));
	JPanel gridPanel3 = new JPanel (new GridLayout(1,1));
	
	nameLabel1 = new JLabel("RESULTS");
	
	
	nameLabel2 = new JLabel("USER INPUT(S)");

	
	activityLabel = new JLabel("Activity Name");

	
	durationLabel = new JLabel("Duration");

	
	dependencyLabel = new JLabel("Dependencies");

	
	activityTextField = new JTextField(0);
	activityTextField.setPreferredSize(new Dimension(80, 80));
	
	
	durationTextField = new JTextField(0);
	durationTextField.setPreferredSize(new Dimension(80, 80));
	
	dependencyTextField = new JTextField(0);
	dependencyTextField.setPreferredSize(new Dimension(80, 80));
	
	
	addButton = new JButton ("Add more activities");

	
	resetButton = new JButton ("Reset");
	
	
	exitButton = new JButton ("Exit");

	
	flow1Panel.add(nameLabel1);
	flow2Panel.add(nameLabel2);
	flow2Panel.add(activityLabel);
	flow2Panel.add(activityTextField);
	flow2Panel.add(durationLabel);
	flow2Panel.add(durationTextField);
	flow2Panel.add(dependencyLabel);
	flow2Panel.add(dependencyTextField);
	flow3Panel.add(addButton);
	flow3Panel.add(resetButton);
	flow3Panel.add(exitButton);
	
	gridPanel1.add(flow1Panel);
	gridPanel2.add(flow2Panel);
	gridPanel3.add(flow3Panel);
	
	
	add(gridPanel1, BorderLayout.NORTH);
	add(gridPanel2, BorderLayout.CENTER);
	add(gridPanel3, BorderLayout.SOUTH);
	
	setBackground (Color.LIGHT_GRAY);
	setPreferredSize (new Dimension(600, 350));
	addButton.addActionListener(new ButtonListener());
	resetButton.addActionListener(new ButtonListener());
	exitButton.addActionListener(new ButtonListener());	
}
private class ButtonListener implements ActionListener
{
 public void actionPerformed (ActionEvent event)
 	{
	 if(event.getSource() == addButton) {}
	 
	 if(event.getSource() == resetButton) {
		 activityTextField.setText("");
		 durationTextField.setText("");
		 dependencyTextField.setText("");
	 }
	 
	 if(event.getSource() == exitButton) {System.exit(0);}
 	}
}

}

