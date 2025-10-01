package java1001;

import java.awt.Button;
import java.awt.Container;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame {

	public JButton btn_left;
	public JButton btn_right;
	public JButton btn_down;
	public JButton btn_up;
	public JButton btn1;
	
	public Button() {
	     setSize(600,600);
	     setVisible(true);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setLayout(null); 
		
	      Container c = getContentPane();
	    
	      btn1 = new JButton("MOVE");
	      btn1.setLocation(10, 10); 
	      btn1.setSize(100,100);
	      c.add(btn1);
	      
	      int default_x = 50;
	      int default_y = 450;
	      int btn_width  = 80;
	      int btn_height = 40;
	      
	      btn_left = new JButton("LEFT");
	      btn_left.setLocation(default_x, default_y);
	      btn_left.setSize(btn_width,btn_height);
	      btn_left.addActionListener(new ClickEvent()); 
	      c.add(btn_left);
	    
	      btn_right = new JButton("RIGHT");
	      btn_right.setLocation(default_x+(btn_width*2), default_y  );
	      btn_right.setSize(btn_width,btn_height);
	      btn_right.addActionListener(new ClickEvent());
	      c.add(btn_right);
	    
	      btn_down = new JButton("DOWN");
	      btn_down.setLocation(default_x+btn_width, default_y+btn_height );
	      btn_down.setSize(btn_width,btn_height);
	      btn_down.addActionListener(new ClickEvent());
	      c.add(btn_down);
	    
	      btn_up = new JButton("UP");
	      btn_up.setLocation(default_x+btn_width, default_y-btn_height);
	      btn_up.setSize(btn_width,btn_height);
	      btn_up.addActionListener(new ClickEvent());  // Click Event Listener등록
	      c.add(btn_up);

	      this.setFocusable(true);
          this.requestFocusInWindow();
          }
	
	public static void main(String[] args) {
		new Button();
	}
	class ClickEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			
			if( btn == btn_left ) {
				btn1.setLocation(btn1.getLocation().x -10 , btn1.getLocation().y);
			}else if( btn == btn_right ) {
				btn1.setLocation(btn1.getLocation().x +10 , btn1.getLocation().y);
			}else if( btn == btn_up ) {
				btn1.setLocation(btn1.getLocation().x , btn1.getLocation().y-10 );
			}else if( btn == btn_down ) {
				btn1.setLocation(btn1.getLocation().x , btn1.getLocation().y+10 );
			}
		}
		class KeyEvent implements KeyListener{ // 키 이벤트 구현
			@Override
			public void keyTyped(java.awt.event.KeyEvent e) {
			}
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				System.out.println(e.getKeyChar()+" keyReleased key");
				System.out.println(e.getKeyCode()+" getKeyCode key");
				
				if( e.getKeyCode() == 37 ) {
					btn1.setLocation(btn1.getLocation().x -10 , btn1.getLocation().y);
				}else if( e.getKeyCode() == 39 ) {
					btn1.setLocation(btn1.getLocation().x +10 , btn1.getLocation().y);
				}else if( e.getKeyCode() == 38 ) {
					btn1.setLocation(btn1.getLocation().x , btn1.getLocation().y-10 );
				}else if( e.getKeyCode() == 40 ) {
					btn1.setLocation(btn1.getLocation().x , btn1.getLocation().y+10 );
				}
			}
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				
			}
		}
	}
}

