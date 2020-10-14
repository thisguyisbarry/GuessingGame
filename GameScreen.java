import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameScreen extends JFrame implements ActionListener{
	
	//attributes are usually components of screen
	JLabel  label1, label2;
	JButton button1, button2;
	JPanel  centrePanel, southPanel, northPanel;

	public GameScreen() {
		
		super("Poop");
		setSize(300,300);
		
		setLayout(new BorderLayout());
		
		label1  = new JLabel("Java screen building");
		label1  = new JLabel("Some stuff");
		button1 = new JButton("Poop button");
		button2 = new JButton("New Button");
		
		//add a listener for button, this is 
		button1.addActionListener(this);
		
		northPanel  = new JPanel();
		centrePanel = new JPanel();
		southPanel  = new JPanel();
		
		centrePanel.add(label1);
		southPanel.add(button1);
		southPanel.add(button2);
		northPanel.add(label2);
		
		add(centrePanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		add(northPanel, BorderLayout.NORTH);
		setVisible(true);
		
	}
	
	
	//Event Handler
	public void actionPerformed(ActionEvent someEvent) {
		
		if(someEvent.getSource() == button1){
			
			//displays a popup
			JOptionPane.showMessageDialog(this, "Button 1 Click Works");
			
		}
		else {
			
			//displays a popup
			JOptionPane.showMessageDialog(this, "Button 2 Click Works");
			
		}
		
	}

}
