import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;

import Pokemon.*;

public class PokemonGame extends JFrame{
    public Treecko treecko;
    public Torchic torchic;
    public Mudkip mudkip;
    private JPanel choose;
    private Container gameUI;
	private ImagePanel panel;
    //private ImagePanel panel;
    //private ImagePanel panel;
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PokemonGame t1 = new PokemonGame();
				t1.setVisible(true);
			}
		});
	}
    public PokemonGame(){
        setTitle("Pokemon Game");
		setSize(1000, 600);
        setLocation(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel = new ImagePanel(new ImageIcon("Treecko.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(50, 150, 600, 500);//x y w h
        this.getContentPane().add(panel);

        panel = new ImagePanel(new ImageIcon("Torchic.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(400, 140, 600, 500);//x y w h
        this.getContentPane().add(panel);

        panel = new ImagePanel(new ImageIcon("Mudkip.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(650, 150, 600, 500);//x y w h
        this.getContentPane().add(panel);

        panel = new ImagePanel(new ImageIcon("choose.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(200, 0, 600, 500);//x y w h
        this.getContentPane().add(panel);

        JButton btnButton = new JButton("Treecko");
        btnButton.setBounds(100, 95, 100, 40);
        getContentPane().add(btnButton);
        btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                TreeckoGame t2 = new TreeckoGame();
                t2.setVisible(true);
                setVisible(false);
			}
        });
        
        JButton btnButton2 = new JButton("Torchic");
        btnButton2.setBounds(450, 95, 100, 40);
        getContentPane().add(btnButton2);
        btnButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               
                TorchicGame t3 = new TorchicGame();
                t3.setVisible(true);
                setVisible(false);
                
			
				
			}
        });
        JButton btnButton3 = new JButton("Mudkip");
        btnButton3.setBounds(750, 95, 100, 40);
        getContentPane().add(btnButton3);
        btnButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                MudkipGame t4 = new MudkipGame();
                t4.setVisible(true);
                setVisible(false);
			
				
			}
		});
    }
}