package org.project;
import java.awt.*;
import javax.swing.*;

public class frankTest {
	public static void main(String[] args) {
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
		
		JButton buttonQuit = new JButton();
		buttonQuit.setText("Quit");
		//buttonQuit.addActionListener( );
		window.add(buttonQuit);
		
		//ActionListener listener = new MyActionLIstener();
		
		window.setLayout(new FlowLayout());
		
		
	}
	
	//public void actionPerformed(ActionEvent event) {
		
	//}
	

}
