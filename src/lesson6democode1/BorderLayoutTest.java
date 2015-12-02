package lesson6democode1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.xml.internal.ws.api.server.Container;

public class BorderLayoutTest extends JFrame {
	JButton b1=new JButton("Red"),
	b2=new JButton("Green"),b3=new JButton("Blue"),
	b4=new JButton("Yellow"),b5=new JButton("Pink");
	public BorderLayoutTest() {
	setTitle("BorderLayout Test");
	java.awt.Container pane = getContentPane();
	pane.setLayout(new BorderLayout());
	setBounds(0,0,400,150);
	pane.add(b1,"North"); pane.add(b2,"South");
	pane.add(b3,"East");
	 pane.add(b4,"West"); pane.add(b5,"Center");
	}
	 public static void main(String args[]) {
	 JFrame f = new BorderLayoutTest();
	 f.setVisible(true);
	}
}
