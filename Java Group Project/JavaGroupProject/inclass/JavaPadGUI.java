package inclass;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JavaPadGUI {
	
	public JavaPadGUI() {
		showGUI();
	}
	
	public void showGUI() {
		JFrame window = new JFrame();
		
		window.setLocation(new Point(0,0));
		window.setSize(new Dimension(500,500));
		window.setVisible(true);
		
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton buttonNew = new JButton();
		buttonNew.setText("New");
		buttonNew.setSize(new Dimension(200, 200));
		window.add(buttonNew);
		
		JButton buttonSave = new JButton();
		buttonSave.setText("Save");
		window.add(buttonSave);
		
		JButton buttonLoad = new JButton();
		buttonLoad.setText("Load");
		window.add(buttonLoad);
		
		//Quit button. Onclick to close the app
		JButton buttonQuit = new JButton();
		buttonQuit.setText("Quit");
		//buttonQuit.addActionListener( );
		window.add(buttonQuit);
		buttonQuit.addActionListener(new ActionListener(){
			 @Override
			    public void actionPerformed(ActionEvent e) {
			        System.exit(1);
			    }
		});
		
		
		window.setLayout(new FlowLayout());
	}
}
