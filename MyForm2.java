

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JDialog;

public class MyForm2 extends JFrame {
    public String sName;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyForm2 form = new MyForm2();
				form.setVisible(true);
			}
		});
	}
	
	
	public MyForm2() {
            
        setBounds(100, 100, 296, 175);
		setResizable(false);
		setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
        
		JLabel label = new JLabel("Player Name :");
		label.setBounds(20, 20, 175, 14);
		getContentPane().add(label);	
		// Create Input 
		final JTextField name = new JTextField();
		name.setBounds(57, 36, 175, 20);
		getContentPane().add(name);
		
		// Button OK
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sName = name.getText();
				 MyForm3 form3 = new MyForm3();
				  form3.setVisible(true);
				 
				 // Hide Current Form
				 setVisible(false);
			}
		});
		btnOK.setBounds(70, 93, 78, 23);
		getContentPane().add(btnOK);
		
		// Button Cancel

			
			
                
	}	 

}