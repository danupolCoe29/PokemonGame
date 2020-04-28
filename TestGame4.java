import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Scanner;
import Pokemon.*;
public class TestGame4 {
    private Scanner scanner;
    private boolean running;
    private static Treecko pokemon;
    private JPanel status;
    private JPanel command;
    private JProgressBar monsterhealthpointbar;
    private JFrame gameGUI;
    private Container gameUI;
    //action listener
    JButton statusbt;
    public TestGame4(){
        scanner = new Scanner(System.in);
        running = false;

        gameGUI = new JFrame();
        gameGUI.setTitle("My Java Game");
        gameGUI.setSize(600,400);
        gameGUI.setLocationRelativeTo(null);
        gameGUI.setResizable(false);
        gameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gameUI = gameGUI.getContentPane();
        gameUI.setLayout(new BorderLayout());
    }

    public void createCharacter(){
        pokemon = new Treecko();
    }
    public void showStatus(){
        JOptionPane statusDialog = new JOptionPane();
        String text = "Name : "+pokemon.status.getName()+"\n"+
                    "LV : "+pokemon.status.getLv()+"\n"+
                    "Max HP : "+pokemon.status.getMaxhp()+"\n"+
                    "Exp : " +pokemon.status.getExp()+"\n"+
                    "Exp next LV : "+pokemon.status.getExplvup();

        JOptionPane.showMessageDialog(statusDialog,text,"Status",JOptionPane.INFORMATION_MESSAGE);

    }
    public void makeGUI(){
        statusbt = new JButton();
        statusbt.setPreferredSize(new Dimension(130,30));
        statusbt.setText("Show Status");

        statusbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Status is pressed");
                showStatus();
            }
        });
        JButton useredpotionbt = new JButton();
        useredpotionbt.setPreferredSize(new Dimension(130,30));
        useredpotionbt.setText("Lv UP");
        useredpotionbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pokemon.status.addExp(100);
                pokemon.checklvup();
                makeGUI();
            }
        });
        command = new JPanel();
        command.setLayout(new FlowLayout());
        command.add(statusbt);
        command.add(useredpotionbt);
        gameUI.add(command,BorderLayout.CENTER);
        gameGUI.setVisible(true);
    }
}