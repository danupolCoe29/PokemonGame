import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyForm3 extends JFrame{
	public String name;
	public MyForm1 form1;
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				 MyForm3 form = new MyForm3();
				 form.setVisible(true);
			}
		});
    }
    public MyForm3() {
		super("3");
		form1 = new MyForm1();
		form1.setVisible(true);
}
}