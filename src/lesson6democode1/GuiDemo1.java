package lesson6democode1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiDemo1 implements ActionListener{
		 JButton button;
		   public static void main(String[] args) {
		        GuiDemo1 gui=new GuiDemo1();
		        gui.go();
		    }

		    public void go()
		    {
		        JFrame frame=new JFrame();
		        button=new JButton("Click");
		        frame.getContentPane().add(button);
		        button.addActionListener(this);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(300, 200);
		        frame.setTitle("Click Demo");
		        frame.setVisible(true);

		    }
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       button.setText("I've been clicked");
		        
		        
		    }
		}
