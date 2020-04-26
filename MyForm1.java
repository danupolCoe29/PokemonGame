

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyForm1 extends JFrame {
	public Player player = new Player();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyForm1 form = new MyForm1();
				form.setVisible(true);
			}
		});
	}
	
	
	public MyForm1() {
            
		// Create Form Frame
		super("1");
		setSize(450, 300);
		setLocation(500, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Create Label
		ImageIcon ii = new ImageIcon("Lotad.png");
		JLabel label = new JLabel(ii);
		label.setBounds(200, 53, 60, 60);
		getContentPane().add(label);	
		
		// Create Button
		JButton btnOpen = new JButton("Play Game");
		btnOpen.setBounds(171, 95, 100, 23);
		// Create Event for Button
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 player.setName(JOptionPane.showInputDialog("Enter you character name"));
				 System.out.println(player.getName());
			}
		});		
		getContentPane().add(btnOpen);	
                
	}	 

}