import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Random;
import Pokemon.*;
import item.*;
public class TestEvo extends JFrame{
    private ImagePanel panel;
    public TestEvo(){
        setTitle("Pokemon Game");
		setSize(1000, 1000);
        setLocation(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel = new ImagePanel(new ImageIcon("Treecko.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(50, 50, 600, 500);//x y w h
        this.getContentPane().add(panel);

        JButton btnButton = new JButton("OK");
        btnButton.setBounds(0, 0, 100, 40);
        getContentPane().add(btnButton);
        btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               

			}
        });

    }

}