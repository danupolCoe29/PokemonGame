package Pokemon;
import Skill.*;
import java.util.concurrent.ThreadLocalRandom;
public class Wurmplelv20 implements ModelPokemon{
    public String name="Wurmple";
    public int lv;
    public int basehp=45;
    public int baseatk=45;
    public int basedef=35;
    public int basespatk=20;
    public int basespdef=30;
    public int basespeed=20;
    public int hpperlv=2;
    public int atkperlv=2;
    public int defperlv=1;
    public int speedperlv=1;
    public int spatkperlv=1;
    public int spdefperlv=1;
    public Status status = new Status();
    public ModelSkill skill1 = new SkillTackle();
    public ModelSkill skill2 = new SkillPoisonSting();
    public Wurmplelv20(){
        lv=ThreadLocalRandom.current().nextInt(10, 20);
        status.setName(name);
        status.setMaxhp(basehp+(hpperlv*lv));
        status.setHp(basehp+(hpperlv*lv));
        status.setAtk(baseatk+(atkperlv*lv));
        status.setDef(basedef+(defperlv*lv));
        status.setSpeed(basespeed+(speedperlv*lv));
        status.setSpatk(basespatk+(spatkperlv*lv));
        status.setSpdef(basespdef+(spdefperlv*lv));
        status.setNumber(14);
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