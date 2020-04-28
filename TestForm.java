import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;
public class TestForm extends JFrame{
    private JPanel status;
    private ImagePanel panel;
    
    public TestForm (){
        setTitle("Pokemon Game");
		setSize(1000, 600);
        setLocation(400, 280);
        panel = new ImagePanel(new ImageIcon("man.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(500, 15, 600, 500);//x y w h
        this.getContentPane().add(panel);
        
    }
}