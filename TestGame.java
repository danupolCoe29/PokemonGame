import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;

import Pokemon.*;

public class TestGame extends JFrame{
    public Treecko treecko;
    public Torchic torchic;
    public Mudkip mudkip;
    private JPanel status;
    //private ImagePanel panel;
    //private ImagePanel panel;
    public static void main(String[] args) {
        TestGame t1 = new TestGame();
        t1.setVisible(true);
    }
    public TestGame(){
        setTitle("Pokemon Game");
		setSize(1000, 600);
        setLocation(400, 280);
        JButton buttonTreecko = new JButton("Treecko");
        buttonTreecko.setBounds(100, 100, 160, 40);
        getContentPane().add(buttonTreecko);
        //buttonTreecko.setVisible(true);

        JButton buttonTorchic = new JButton("Torchic");
        buttonTorchic.setBounds(200, 100, 160, 40);
        getContentPane().add(buttonTorchic);
        //buttonTorchic.setVisible(true);

        JButton buttonMudkip = new JButton("Mudkip");
        buttonMudkip.setBounds(300, 100, 160, 40);
        getContentPane().add(buttonMudkip);
        //buttonMudkip.setVisible(true);

    }
}