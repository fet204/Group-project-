package org;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

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


						}
					catch (Exception e) {
						//result = false;
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
					    }
					} catch (IOException e) {
					} finally {
					    try { in.close(); } catch (Exception ex) { }
					}


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

				        	// Save function
							String lastFileName = "hardcode.txt";
							try {

								PrintWriter out = new PrintWriter(lastFileName);
								String textInWindow = textWindow.getText();
								System.out.println(textInWindow);
								out.write(textInWindow);
								out.close();

								}

							catch (Exception e) {
								//result = false;
								}
				        	// Close Function here
				        	System.exit(0);

				        }
				        else if (choice == JOptionPane.NO_OPTION){
				        	System.exit(0);
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
