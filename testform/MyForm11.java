package testform;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyForm11 extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyForm11 form = new MyForm11();
				form.setVisible(true);
			}
		});
	}
	
	
	public MyForm11() {
            
		// Create Form Frame
		super("ThaiCreate.Com Tutorial");
		setSize(450, 300);
		setLocation(500, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Create Label
		JLabel label = new JLabel("Form 1");
		label.setBounds(200, 53, 60, 14);
		getContentPane().add(label);	
		
		// Create Button
		JButton btnOpen = new JButton("Open Form");
		btnOpen.setBounds(171, 95, 100, 23);
		// Create Event for Button
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 // New Form
				 MyForm12 form2 = new MyForm12();
				 form2.setVisible(true);
				 
				 // Hide Current Form
				 setVisible(false);
			}
		});		
		getContentPane().add(btnOpen);	
                
	}	 

}