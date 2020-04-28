import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Random;
import Pokemon.*;
import item.*;
public class MudkipGame extends JFrame{
    public Mudkip pokemon;
    private Poochyenalv9 monster;
    private JFrame gameGUI;
    private Container gameUI;
    private JPanel status;
    private JPanel command;
    private int numPotion=10;
    private Potion potion;
    private int money=1000;
    // public static void main(String[] args) {
	// 	EventQueue.invokeLater(new Runnable() {
	// 		public void run() {
	// 			MudkipGame t2 = new MudkipGame();
	// 			t2.setVisible(true);;
	// 		}
	// 	});
	// }

    public MudkipGame(){
        setTitle("Mudkip");
		setSize(300, 300);
        setLocation(97, 162);
        gameGUI = new JFrame();
        gameGUI.setTitle("Game controller");
        gameGUI.setSize(600,400);
        gameGUI.setLocationRelativeTo(null);
        gameGUI.setResizable(false);
        gameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gameUI = gameGUI.getContentPane();
        gameUI.setLayout(new BorderLayout());
        
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //getContentPane().setLayout(null);
        pokemon = new Mudkip();
        monster = new Poochyenalv9();
        potion = new Potion();
        makeGUI();
        }

    public void checkAll(){
        System.out.println("Check a;; is used");
        checklevelUp();
        if (pokemon.checkdie() == 1){
            JOptionPane gameOver = new JOptionPane();
            JOptionPane.showMessageDialog(gameOver,"GAME OVER! \n You are dead!!");
            System.exit(0);
        }

        System.out.println(pokemon.status.getHp());

    }

    public void checklevelUp(){
        pokemon.checklvup();
        if(pokemon.status.getLv()==7)
            evo();
        
    }
    
    public void showStatus(){
        JOptionPane statusDialog = new JOptionPane();
        String text = "Name : "+pokemon.status.getName()+"\n"+
                    "Number : " +pokemon.status.getNumber() + "\n"+
                    "LV : "+pokemon.status.getLv()+"\n"+
                    "Max HP : "+pokemon.status.getMaxhp()+"\n"+
                    "HP : " +pokemon.status.getHp() +"\n" +
                    "Attack : "+pokemon.status.getAtk() +"\n"+
                    "Defense : " +pokemon.status.getDef() +"\n"+
                    "Sp.Atk : " +pokemon.status.getSpatk()+"\n"+
                    "Sp.Def : " + pokemon.status.getSpdef()+"\n"+
                    "Speed : " +pokemon.status.getSpeed()+"\n"+
                    "Exp : " +pokemon.status.getExp()+"\n"+
                    "Exp next LV : "+pokemon.status.getExplvup();

        JOptionPane.showMessageDialog(statusDialog,text,"Status",JOptionPane.INFORMATION_MESSAGE);

    }   

    public void makeGUI(){
        checkAll();
        JLabel namelb = new JLabel(pokemon.status.getName().toUpperCase() + "    "+"Lv. : " +pokemon.status.getLv()+ "       Money : "+money + "       Postion : " + numPotion);
        getContentPane().add(namelb);
        status = new JPanel();
        status.setLayout(new BoxLayout(status,BoxLayout.Y_AXIS));
        namelb.setFont(new Font("Serif",Font.PLAIN,20));

        ImagePanel panel = new ImagePanel(new ImageIcon("Mudkip.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(50, 150, 600, 500);//x y w h
        this.getContentPane().add(panel);

        //pokemon health progress bar
        JProgressBar pokemonHPbar = new JProgressBar();
        pokemonHPbar.setString("HP : "+ pokemon.status.getHp()+"/"+ pokemon.status.getMaxhp());
        pokemonHPbar.setForeground(Color.RED);
        pokemonHPbar.setStringPainted(true);
        pokemonHPbar.setValue(pokemon.status.getHp());

        //monster health progress bar
        JProgressBar monsterhealthpointbar = new JProgressBar();
        monsterhealthpointbar.setString("HP : "+monster.status.getHp() +"/"+ monster.status.getMaxhp());
        monsterhealthpointbar.setForeground(Color.GREEN);
        monsterhealthpointbar.setStringPainted(true);
        monsterhealthpointbar.setValue(monster.status.getHp());

        //Show status button
        JButton statusbt = new JButton();
        statusbt.setPreferredSize(new Dimension(130,30));
        statusbt.setText("Show Status");

        statusbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Status is pressed");
                showStatus();
            }
        });

        //use potion button
        JButton useredpotionbt = new JButton();
        useredpotionbt.setPreferredSize(new Dimension(130,30));
        useredpotionbt.setText("Use Potion");
        useredpotionbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Use potion is press");
                if(numPotion>0 && pokemon.status.getHp() != pokemon.status.getMaxhp()) {
                    numPotion--;
                    pokemon.status.addHp(potion.rehp);
                }
                makeGUI();
                
            }
        });
        
        //buy potion button
        JButton buypotionbt = new JButton();
        buypotionbt.setPreferredSize(new Dimension(130,30));
        buypotionbt.setText("Buy Potion");
        buypotionbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Buy Potion");
                try {
                    String buy = JOptionPane.showInputDialog("Price :300. \nHow many pieces will you buy? ");
                    int pieces = Integer.parseInt(buy);
                    if (money>=potion.price* pieces){
                        money-=potion.price* pieces;
                        numPotion+=pieces;
                    }
                    else{
                        JOptionPane statusDialog = new JOptionPane();
                        String text = "You don't have enough money.";
                        JOptionPane.showMessageDialog(statusDialog,text,"Error",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane statusDialog = new JOptionPane();
                    String text = "Please enter numbers.";
                    JOptionPane.showMessageDialog(statusDialog,text,"Error",JOptionPane.INFORMATION_MESSAGE);
                    makeGUI();
                }
                
              
                makeGUI();
                checkAll();
            }
        });

        //buy lv potion button
        JButton buylvbt = new JButton();
        buylvbt.setPreferredSize(new Dimension(130,30));
        buylvbt.setText("Buy LV ");
        buylvbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Buy Level");
                JOptionPane askAgain = new JOptionPane();
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(askAgain, "Up 1 Level Price :1000 Gold. \n Do you want to buy?","Buy Level", dialogButton);
                if(dialogResult == 0){
                    if(money>=1000){
                        money-=1000;
                        pokemon.status.lvup();
                        showStatus();
                        checklevelUp();
                    }
                    else{
                        JOptionPane statusDialog = new JOptionPane();
                        String text = "You don't have enough money.";
                        JOptionPane.showMessageDialog(statusDialog,text,"Error",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
                //makeGUI();
                
            }
        });

        JButton attackmonsterbt = new JButton();
        attackmonsterbt.setPreferredSize(new Dimension(130,30));
        attackmonsterbt.setText("Attack monster");

        attackmonsterbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Attack monster is press");
                attackMonster();
                makeGUI();
            }
        });
        status.add(namelb);
        status.add(pokemonHPbar);

        command = new JPanel();
        command.setLayout(new FlowLayout());
        command.add(statusbt);
        command.add(useredpotionbt);
        command.add(buypotionbt);
        command.add(buylvbt);
        command.add(attackmonsterbt);

        //add component
        gameUI.add(status,BorderLayout.NORTH);
        gameUI.add(command,BorderLayout.CENTER);
        gameUI.add(monsterhealthpointbar,BorderLayout.SOUTH);

        gameGUI.setVisible(true);
    }

    private void attackMonster(){
        while(pokemon.checkdie()==0 && monster.checkdie() ==0){
            monster.defense(pokemon.damage(20));
            checkAll();
            if(monster.checkdie()==0){
                pokemon.defense(monster.damage(10));
                checkAll();
            }
            else{
                JOptionPane msg1 = new JOptionPane();
                JOptionPane.showMessageDialog(msg1,"Monster is dead!");
                Random rate = new Random();
                int Exp = rate.nextInt(20)*monster.status.getLv();
                pokemon.status.addExp(Exp);
                int moneykill = rate.nextInt(100)*monster.status.getLv();
                money+=moneykill;
                checkAll();
                monster = new Poochyenalv9();
                break;
            }
            JOptionPane attackAgain = new JOptionPane();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(attackAgain, "Monster is not dead! \n Attack Again", "Attack!", dialogButton);
            checkAll();
            makeGUI();
            if(dialogResult != 0){
                monster = new Poochyenalv9();
                break;
                
            }
        }
    }

    public void evo(){
        MudkipEvo t1 =new MudkipEvo(money,numPotion);

         setVisible(false);
        gameGUI.setVisible(false);
     
        JOptionPane statusDialog = new JOptionPane();
        String text = "Wowww !!!\n" + pokemon.status.getName() + " Evolve into a Marshtomp ";
        JOptionPane.showMessageDialog(statusDialog,text,"Evolution",JOptionPane.INFORMATION_MESSAGE);
         t1.setVisible(true);
         setVisible(false);
    }
}

    
    
    
