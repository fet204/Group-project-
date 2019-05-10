package inclass;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;


public class JavaPadGUI {
		public static void main(String[] args) {
			//SEPERATE PANELS FOR HOLDING THE PANELS
			JFrame window = new JFrame();
			JPanel southPanel = new JPanel(new FlowLayout());
			JPanel northPanel = new JPanel(new FlowLayout());
			
			window.setTitle("Microsoft JavaPad XP");
			window.setLocation(new Point(0,0));
			window.setSize(new Dimension(500,500));
			window.setVisible(true);
			
			//TEXT WINDOW
			TextArea textWindow = new TextArea("",15, 25, 1);
			window.add(textWindow,BorderLayout.CENTER);

			
			
			// NEW BUTTON
			JButton buttonNew = new JButton();
			buttonNew.setText("New");
			buttonNew.setSize(new Dimension(200, 200));
			northPanel.add(buttonNew);
			// Setting the text to a single space. "" doesn't work...
			buttonNew.addActionListener(new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent newFile) {
					textWindow.setText(" ");
				}
			});
			
			
			// SAVE BUTTON 
			JButton buttonSave = new JButton();
			buttonSave.setText("Save");
			northPanel.add(buttonSave);
			
			//SAVE FUNCTION
			buttonNew.addActionListener(new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent newFile) {
					
					// This "thing" writes over the file in hardcode??????
					// FileWriter hardcode = new FileWriter("hardcode.txt");
					
					
				}
			});
			
			
			// LOAD BUTTON
			JButton buttonLoad = new JButton();
			buttonLoad.setText("Load");
			northPanel.add(buttonLoad);
			
			
			// QUIT BUTTON 
			JButton buttonQuit = new JButton();
			buttonQuit.setText("Quit");
			northPanel.add(buttonQuit);
			
			// Test action listener saveAndQuit
			
			
			
			// Vince action edited 
			buttonQuit.addActionListener(new ActionListener(){
				 @Override
				    public void actionPerformed(ActionEvent saveAndQuit) {
				        int choice = JOptionPane.showConfirmDialog(buttonQuit, "Quitting; Save?","Quit", JOptionPane.YES_NO_OPTION);
				        
				        if (choice == JOptionPane.YES_OPTION) {
				        	
				        	//STILL NEED TO WRITE THE SAVE FUNCTION
				        	
				        	//Close Function
				        	
				        	
				        } 
				        
				    }
			});
			
			
			// Adding Panel to the window on north
			window.add(northPanel, BorderLayout.NORTH);
			
			
			// Fatimas bottom text.
			southPanel.add(new JLabel("Microsoft: Resistance is futile"));
	        window.add(southPanel,BorderLayout.SOUTH);
	        southPanel.setVisible(true);
	        
	        
			
			
			
			
			
		}
		
		
		

	}

	
	


