package org;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.*;

/*
 * This is the Java Group project by:
 * Vince 
 * Frank
 * Fatima
 * from Java 2 - Computer Science 143
 * Professor: Nizami
 */

public class JavaPadGUI {

	
		
		public static void main(String[] args) {

			//Eye candy. This will make the gui look like the native version
			try {
				  UIManager.setLookAndFeel(
				    UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {}
			
			//SEPERATE PANELS FOR HOLDING THE PANELS
			JFrame window = new JFrame();
			JPanel southPanel = new JPanel(new FlowLayout());
			JPanel northPanel = new JPanel(new FlowLayout());

			// Main window
			window.setTitle("Macrosoft JavaPad XP");
			window.setLocation(new Point(0,0));
			window.setSize(new Dimension(800,800));
			window.setVisible(true);
			// Adding Panel to the window on north
			window.add(northPanel, BorderLayout.NORTH);
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
			buttonSave.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent saveFile) {

					String text = "text";
					String lastFileName = "hardcode.txt";
					try {

						PrintWriter out = new PrintWriter(lastFileName);
						String textInWindow = textWindow.getText();
						System.out.println(textInWindow);
						out.write(textInWindow);
						out.close();

						System.out.println("------------------SAVED--------------");

						}
					catch (Exception e) {
						}


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

					String text = "text";
					String lastFileName = "hardcode.txt";

					BufferedReader in = null;
					try {
						textWindow.setText("");
					    in = new BufferedReader(new FileReader("hardcode.txt"));
					    Scanner scan = new Scanner(new File("hardcode.txt"));
					    ArrayList<String> list = new ArrayList<String>();
					    while ( scan.hasNextLine()) {
					    	String word = scan.nextLine();
					    	list.add(word);
					    }
					    for(int i = 0; i < list.size(); i++) {
					    	System.out.print(list.get(i));
					    	textWindow.append(list.get(i));
					    	textWindow.append("\n");
					    }
					    scan.close();
					} catch (IOException e) {
						e.printStackTrace();
						int err = JOptionPane.showConfirmDialog(null, "Could not acess file hardcode.txt", "I/O Error", JOptionPane.DEFAULT_OPTION);
						System.out.println(err);
					} finally {
					    try { in.close(); } catch (Exception ex) { }
					}


				}
			});


			// QUIT BUTTON
			JButton buttonQuit = new JButton();
			buttonQuit.setText("Quit");
			northPanel.add(buttonQuit);

			buttonQuit.addActionListener(new ActionListener(){
				 @Override
				    public void actionPerformed(ActionEvent saveAndQuit) {
				        int choice = JOptionPane.showConfirmDialog(
				        		buttonQuit, "Quitting; Save?","Quit", JOptionPane.YES_NO_OPTION);

				        if (choice == JOptionPane.YES_OPTION) {

				        	// Save function
							String lastFileName = "hardcode.txt";
							try {

								PrintWriter out = new PrintWriter(lastFileName);
								String textInWindow = textWindow.getText();
								System.out.println(textInWindow);
								out.write(textInWindow);
								out.close();

								System.out.println("------------------SAVED--------------");
								}

							catch (Exception e) {
								e.printStackTrace();
								}
				        	// Close Function here
				        	System.exit(0);

				        }
				    }
			});

			// Fatimas bottom text.
			southPanel.add(new JLabel("Macrosoft: Resistance is futile"));
	        window.add(southPanel,BorderLayout.SOUTH);
	        southPanel.setVisible(true);
	        
		}
	}