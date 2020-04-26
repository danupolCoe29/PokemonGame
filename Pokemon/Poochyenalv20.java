package Pokemon;
import Skill.*;
import java.util.concurrent.ThreadLocalRandom;
public class Poochyenalv20 implements ModelPokemon{
    public String name="Poochyena";
    public int lv;
    public int basehp=35;
    public int baseatk=55;
    public int basedef=35;
    public int basespatk=30;
    public int basespdef=30;
    public int basespeed=35;
    public int hpperlv=1;
    public int atkperlv=2;
    public int defperlv=1;
    public int speedperlv=1;
    public int spatkperlv=1;
    public int spdefperlv=1;
    public Status status = new Status();
    public ModelSkill skill1 = new SkillTackle();
    public ModelSkill skill2 = new SkillBite();
    public Poochyenalv20(){
        lv=ThreadLocalRandom.current().nextInt(9, 20);
        status.setName(name);
        status.setMaxhp(basehp+(hpperlv*lv));
        status.setHp(basehp+(hpperlv*lv));
        status.setAtk(baseatk+(atkperlv*lv));
        status.setDef(basedef+(defperlv*lv));
        status.setSpeed(basespeed+(speedperlv*lv));
        status.setSpatk(basespatk+(spatkperlv*lv));
        status.setSpdef(basespdef+(spdefperlv*lv));
        status.setNumber(10);
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