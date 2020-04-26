package Pokemon;
import Skill.*;
import java.util.concurrent.ThreadLocalRandom;
public class Zigzagoonlv5 implements ModelPokemon{
    public String name="Zigzagoon";
    public int lv;
    public int basehp=38;
    public int baseatk=30;
    public int basedef=41;
    public int basespatk=30;
    public int basespdef=41;
    public int basespeed=60;
    public int hpperlv=2;
    public int atkperlv=1;
    public int defperlv=2;
    public int speedperlv=3;
    public int spatkperlv=1;
    public int spdefperlv=2;
    public Status status = new Status();
    public ModelSkill skill1 = new SkillTackle();
    public Zigzagoonlv5(){
        lv=ThreadLocalRandom.current().nextInt(1, 6);
        status.setName(name);
        status.setMaxhp(basehp+(hpperlv*lv));
        status.setHp(basehp+(hpperlv*lv));
        status.setAtk(baseatk+(atkperlv*lv));
        status.setDef(basedef+(defperlv*lv));
        status.setSpeed(basespeed+(speedperlv*lv));
        status.setSpatk(basespatk+(spatkperlv*lv));
        status.setSpdef(basespdef+(spdefperlv*lv));
        status.setNumber(12);
        status.setLv(lv);
    }
    public void showstastu(){}
    public void upSkill(int lv){}
    public void checklvup(){}
    public void showNameAllSkill(){}
    public void showSkill1(){}
    public void showSkill2(){}
    public void showSkill3(){}
    public void showSkill4(){}
    public void evo(int lv){}
    public void defense(int damage){
        status.painHp(damage-status.getDef());
    }
    public int damage(int damage){
        return damage+status.getAtk();
    }
    public int checkdie(){
        if(status.getHp()<=0)
            return 1;
        else
            return 0;
    }
    public void getExp(int exp){}
}