package inclass;
import java.awt.*;
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
			
			//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			/*test*/
			JButton buttonNew = new JButton();
			buttonNew.setText("New");
			buttonNew.setSize(new Dimension(200, 200));
			northPanel.add(buttonNew);
			
			JButton buttonSave = new JButton();
			buttonSave.setText("Save");
			northPanel.add(buttonSave);
			
			JButton buttonLoad = new JButton();
			buttonLoad.setText("Load");
			northPanel.add(buttonLoad);
			
			JButton buttonQuit = new JButton();
			buttonQuit.setText("Quit");
			//buttonQuit.addActionListener( );
			northPanel.add(buttonQuit);
			
			window.add(northPanel, BorderLayout.NORTH);
			
			southPanel.add(new JLabel("Microsoft: Resistance is frutile"));
	        window.add(southPanel,BorderLayout.SOUTH);
	        southPanel.setVisible(true);
	        
	        
			//window.setLayout(new FlowLayout());
			
			
			
			
		}
		
		//public void actionPerformed(ActionEvent event) {
			
		//}
		

	}

	
	


