package java2;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(4,2,0,5));
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
