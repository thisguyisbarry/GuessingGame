import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.Color;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameGUI extends JFrame implements ActionListener{
	
	JButton someButton, anotherButton;
	JLabel  someLabel, picLabel;
	JPanel  centrePanel, southPanel, northPanel;
	JTextArea someText;
	BufferedImage myPicture;

	public GameGUI(String someTitle) {
		
		super(someTitle);
		setSize(500,700);
		
		someButton  = new JButton("Make Guess");
		anotherButton = new JButton("Get Hint");
		someLabel = new JLabel("Name the main character.");
		someLabel.setOpaque(true);
		someText = new JTextArea(2, 20);
		someText.setToolTipText("Enter your answer then click \"make guess\" ");
 
		
		someButton.addActionListener(this);
		anotherButton.addActionListener(this);
		
		southPanel = new JPanel();
		southPanel.add(someButton);
		southPanel.add(anotherButton);
		add(southPanel, BorderLayout.SOUTH);
		
		
		northPanel = new JPanel();
		northPanel.add(someLabel);
		add(northPanel, BorderLayout.NORTH);
		
		
		centrePanel = new JPanel();
		
		try {
			myPicture = ImageIO.read(new File("C:/Users/bazo6/eclipse-workspace/JFrameExample/src/dip.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		centrePanel.add(picLabel);
		
		
		centrePanel.add(someText);
		add(centrePanel, BorderLayout.CENTER);
		
		
		setVisible(true);
		
	}

	
	public void actionPerformed(ActionEvent someEvent) {
		
		if(someEvent.getSource() == someButton){
			
			//displays a popup
			if(someText.getText().equalsIgnoreCase("Isaac"))
				JOptionPane.showMessageDialog(this, "Correct guess: " + someText.getText());
			else
				JOptionPane.showMessageDialog(this, "Incorrect guess, please try again");
			
			
		}
		
		if(someEvent.getSource() == anotherButton) {
			
			//displays a popup
			JOptionPane.showMessageDialog(this, "Hint: Biblical");
			
		}
		
	}



}
