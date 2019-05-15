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
			
			// Main window
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
			buttonNew.addActionListener(new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent newFile) {
					textWindow.setText(" "); //setText must be something to work. "" won't work.
				}
			});
			
			
			// SAVE BUTTON 
			JButton buttonSave = new JButton();
			buttonSave.setText("Save");
			northPanel.add(buttonSave);
			
			//SAVE FUNCTION
			buttonNew.addActionListener(new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent saveFile) {
					
					// This "thing" writes over the file in hardcode??????
					/*
					 * trying to use the FileWriter to take the text from the textWindow 
					 * and replace the works in hardcode. That way it will act like a save function.
					 * if i can reverse this process, i can actually knock out the load button too!
					 
					String text = "";
					String lastFileName = null;
					try {
						PrintStream out = new PrintStream(new File("hardcode.txt"));
						out.print(text);
						lastFileName = "hardcode.txt";
						}
					catch (IOException ioe) {
						//result = false;
						}
					
					*/
					
					
				}
			});
			
			
			// LOAD BUTTON
			JButton buttonLoad = new JButton();
			buttonLoad.setText("Load");
			northPanel.add(buttonLoad);
			// ActionListener
			buttonLoad.addActionListener(new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent loadFile) {
					
				}
			});
			
			
			// QUIT BUTTON 
			JButton buttonQuit = new JButton();
			buttonQuit.setText("Quit");
			northPanel.add(buttonQuit);
						
			// Vince action edited 
			buttonQuit.addActionListener(new ActionListener(){
				 @Override
				    public void actionPerformed(ActionEvent saveAndQuit) {
				        int choice = JOptionPane.showConfirmDialog(
				        		buttonQuit, "Quitting; Save?","Quit", JOptionPane.YES_NO_OPTION);
				        
				        if (choice == JOptionPane.YES_OPTION) {
				        	
				        	// STILL NEED TO WRITE THE SAVE FUNCTION
				        	
				        	// Close Function here
				        	/*
				        	 *  This has something to do with the EXIT_ON_CLOSE thing but not sure how
				        	 *  this is supposed to link with the button that i just made. 
				        	 */
				        	
				        	
				        } 
				        else if (choice == JOptionPane.NO_OPTION){
				        	
				        	// Exit close function here. no saving
				        	
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

	
	


