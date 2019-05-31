package org;
import java.awt.*;
import javax.swing.*;

public class fatima {
	public static void main(String[] args) {
		 JFrame window=new JFrame();
		 JPanel southPanel=new JPanel(new FlowLayout());
		 //JScrollPane areaScrollPane = new JScrollPane(textArea);

        window.setForeground(Color.blue);
        window.setLocation(new Point(0,0));
        window.setSize(new Dimension(700,700));
        window.setTitle("Microsoft JavaPad XP");
        window.setVisible(true);
        window.setLayout(new BorderLayout());
        JPanel centerPanel = new JPanel(new GridLayout(25,10));


        window.add(centerPanel, BorderLayout.CENTER);



        southPanel.add(new JLabel("Microsoft: Resistance is frutile"));
        window.add(southPanel,BorderLayout.SOUTH);
        southPanel.setVisible(true);

//        areaScrollPane.setVerticalScrollBarPolicy(
//                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        areaScrollPane.setPreferredSize(new Dimension(250, 250));



	}
}
