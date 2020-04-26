package Pokemon;
import Skill.*;
public interface  ModelPokemon {
    public void showstastu();
    public void upSkill(int lv);
    public void checklvup();
    public void showNameAllSkill();
    public void showSkill1();
    public void showSkill2();
    public void showSkill3();
    public void showSkill4();
    public void evo(int lv);
    public void defense(int damage);
    public int damage(int damage);
    public int checkdie();
    public void getExp(int exp);


}