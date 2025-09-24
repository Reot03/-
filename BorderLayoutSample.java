package java2;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutSample extends JFrame {
	BorderLayoutSample() {
		setTitle("BorderLayoutSample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add(new JButton("add"),BorderLayout.NORTH);
		add(new JButton("div"),BorderLayout.WEST);
		add(new JButton("mul"),BorderLayout.EAST);
		add(new JButton("sub"),BorderLayout.SOUTH);
		add(new JButton("Calculate"),BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutSample();
	}

}
