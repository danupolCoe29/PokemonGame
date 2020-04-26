

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyForm extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyForm form = new MyForm();
				form.setVisible(true);
			}
		});
	}
	
	
	public MyForm() {
            
		// Create Form Frame
		super("ThaiCreate.Com Tutorial");
		setSize(450, 300);
		setLocation(500, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Create Dialog
		JButton btnButton = new JButton("Submit");
		btnButton.setBounds(171, 95, 89, 23);
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField name = new JTextField();
				JTextField username = new JTextField();
				JPasswordField password = new JPasswordField();
				final JComponent[] inputs = new JComponent[] {
						new JLabel("Name"),
						name,
						new JLabel("Username"),
						username,
						new JLabel("Password"),
						password
				};
				JOptionPane.showMessageDialog(null, inputs, "My custom dialog", JOptionPane.PLAIN_MESSAGE);
				System.out.println("You entered " +
						name.getText() + ", " +
						username.getText() + ", " +
						password.getText());
				
			}
		});
		
		getContentPane().add(btnButton);
					
	}

}