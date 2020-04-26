package testform;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyForm12 extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyForm12 form = new MyForm12();
				form.setVisible(true);
			}
		});
	}
	
	
	public MyForm12() {
            
		// Create Form Frame
		super("ThaiCreate.Com Tutorial");
		setSize(450, 300);
		setLocation(500, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Create Label
		JLabel label = new JLabel("Form 2");
		label.setBounds(200, 53, 60, 20);
		getContentPane().add(label);	
			
                
	}	 

}