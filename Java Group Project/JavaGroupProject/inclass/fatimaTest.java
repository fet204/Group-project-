package inclass;
import java.awt.*;
import javax.swing.*;

public class fatimaTest {
	public static void main(String[] args) {
		 JFrame window=new JFrame();
		 JPanel southPanel=new JPanel(new FlowLayout());
		 JTextArea textArea = new JTextArea();
		 JScrollPane areaScrollPane = new JScrollPane(textArea);
		 textArea.setFont(new Font("Serif", Font.ITALIC, 16));
		 textArea.setLineWrap(true);
		 textArea.setWrapStyleWord(true);

        window.setForeground(Color.blue);
        window.setLocation(new Point(0,0));
        window.setSize(new Dimension(700,700));
        window.setTitle("Microsoft JavaPad XP");
        window.setVisible(true);
        window.setLayout(new BorderLayout());
        
       
       
      
        areaScrollPane.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(400, 400));
      
        
        
        southPanel.add(new JLabel("Microsoft: Resistance is frutile"));
        window.add(southPanel,BorderLayout.SOUTH);
        southPanel.setVisible(true);
        
        
		 
		
		
	}
}

/*JPanel centerPanel = new JPanel(new GridLayout(25,10)); 
window.add(centerPanel, BorderLayout.CENTER);*/