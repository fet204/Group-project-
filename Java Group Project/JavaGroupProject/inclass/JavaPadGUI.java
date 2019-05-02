package inclass;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JavaPadGUI {
		public static void main(String[] args) {
			JFrame window = new JFrame();
			JPanel southPanel=new JPanel(new FlowLayout());
			JPanel northPanel = new JPanel(new FlowLayout());
			
			window.setTitle("Microsoft JavaPad XP");
			window.setLocation(new Point(0,0));
			window.setSize(new Dimension(500,500));
			window.setVisible(true);
			
			
			// NEW BUTTON
			JButton buttonNew = new JButton();
			buttonNew.setText("New");
			buttonNew.setSize(new Dimension(200, 200));
			northPanel.add(buttonNew);
			
			
			// SAVE BUTTON 
			JButton buttonSave = new JButton();
			buttonSave.setText("Save");
			northPanel.add(buttonSave);
			
			
			// LOAD BUTTON
			JButton buttonLoad = new JButton();
			buttonLoad.setText("Load");
			northPanel.add(buttonLoad);
			
			
			// QUIT BUTTON 
			JButton buttonQuit = new JButton();
			buttonQuit.setText("Quit");
			northPanel.add(buttonQuit);
			
			// Vince action
			buttonQuit.addActionListener(new ActionListener(){
				 @Override
				    public void actionPerformed(ActionEvent e) {
				        int choice = JOptionPane.showConfirmDialog(null, "Quitting; Save?");
				        
				        /*
				        if (JOptionPane.YES_OPTION) {
				        	JOptionPane.showMessageDialog(null,  "message", title, messageType);
				        }
				        */
				    }
			});
			
			
			
			window.add(northPanel, BorderLayout.NORTH);
			
			
			// Fatimas bottom text.
			southPanel.add(new JLabel("Microsoft: Resistance is frutile"));
	        window.add(southPanel,BorderLayout.SOUTH);
	        southPanel.setVisible(true);
	        
	        
			
			
			
			
			
		}
		
		//public void actionPerformed(ActionEvent event) {
			
		//}
		

	}

	
	


