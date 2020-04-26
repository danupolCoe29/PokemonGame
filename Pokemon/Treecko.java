package Pokemon;
import Skill.*;
public class Treecko implements ModelPokemon{
    public String name="Treecko";
    public int lv=5;
    public int basehp=40;
    public int baseatk=45;
    public int basedef=35;
    public int basespatk=65;
    public int basespdef=55;
    public int basespeed=70;
    public int baseexp=65;
    public int hpperlv=2;
    public int atkperlv=2;
    public int defperlv=1;
    public int speedperlv=3;
    public int spatkperlv=3;
    public int spdefperlv=2;
    public Status status = new Status();
    public ModelSkill skill1 = new SkillPound();
    public ModelSkill skill2 = new ModelSkill();
    public ModelSkill skill3 = new ModelSkill();
    public ModelSkill skill4 = new ModelSkill();
    public Grovyle evogrovyle ;
    public Treecko(){
        status.setName(name);
        status.setMaxhp(basehp+(hpperlv*lv));
        status.setHp(basehp+(hpperlv*lv));
        status.setAtk(baseatk+(atkperlv*lv));
        status.setDef(basedef+(defperlv*lv));
        status.setSpeed(basespeed+(speedperlv*lv));
        status.setSpatk(basespatk+(spatkperlv*lv));
        status.setSpdef(basespdef+(spdefperlv*lv));
        status.setExp(baseexp*(lv-1));
        status.setExpuplv((int)(baseexp*lv+((baseexp*lv)*0.2)));
        status.setNumber(1);
        status.setLv(lv);
    }
    public void showstastu(){
        System.out.println("Name : " +status.getName());
        System.out.println("Number : " + status.getNumber());
        System.out.println("Lv : " + status.getLv());
        System.out.println("MaxHP : " + status.getMaxhp());
        System.out.println("HP : " + status.getHp());
        System.out.println("Attack : " + status.getAtk());
        System.out.println("Defense : " +status.getDef());
        System.out.println("Sp.Atk : " + status.getSpatk());
        System.out.println("Sp.Def : " + status.getSpdef());
        System.out.println("Speed : " + status.getSpeed());
        System.out.println("Exp. : " + status.getExp());
        System.out.println("Exp. next Lv : " + status.getExplvup());
    }

        public void upSkill(int lv){
            if(lv==6)
                skill2 = new SkillAbsorb();
            if (lv==11)
                skill3 = new SkillQuickAttack();
            if (lv==16)
                skill4 = new SkillPursuit();
            
        }
        public void checklvup(){
            if(status.getExp()>=status.getExplvup()){
                status.lvup();
                status.addMaxhp(hpperlv);
                status.addHp(hpperlv);
                status.addAtk(atkperlv);
                status.addDef(defperlv);
                status.addSpeed(speedperlv);
                status.addExplvup((int)(baseexp+(status.getExplvup()*0.2)));
                status.addSpatk(spatkperlv);
                status.addSpdef(spdefperlv);
                upSkill(status.getLv());
                evo(status.getLv());
            }
        }
        public void showNameAllSkill(){
            System.out.println("Skill1 Name  : " + skill1.nameSkill());
            System.out.println("Skill2 Name  : " + skill2.nameSkill());
            System.out.println("Skill3 Name  : " + skill3.nameSkill());
            System.out.println("Skill4 Name  : " + skill4.nameSkill());
        }
        public void showSkill1(){
            System.out.println("Skill Name : " + skill1.nameSkill());
            System.out.println("Skill Type : " + skill1.getType());
            System.out.println("Skill Category : " + skill1.getCategory());
            System.out.println("Skill Power : " + skill1.getPower());
            System.out.println("Skill Accuracy : " + skill1.getAccuracy());
            System.out.println("Skill PP : " + skill1.getPP());
            System.out.println("Skill MaxPP : " + skill1.getmaxPP());
        }
        public void showSkill2(){
            System.out.println("Skill Name : " + skill2.nameSkill());
            System.out.println("Skill Type : " + skill2.getType());
            System.out.println("Skill Category : " + skill2.getCategory());
            System.out.println("Skill Power : " + skill2.getPower());
            System.out.println("Skill Accuracy : " + skill2.getAccuracy());
            System.out.println("Skill PP : " + skill2.getPP());
            System.out.println("Skill MaxPP : " + skill2.getmaxPP());
        }
        public void showSkill3(){
            System.out.println("Skill Name : " + skill3.nameSkill());
            System.out.println("Skill Type : " + skill3.getType());
            System.out.println("Skill Category : " + skill3.getCategory());
            System.out.println("Skill Power : " + skill3.getPower());
            System.out.println("Skill Accuracy : " + skill3.getAccuracy());
            System.out.println("Skill PP : " + skill3.getPP());
            System.out.println("Skill MaxPP : " + skill3.getmaxPP());
        }
        public void showSkill4(){
            System.out.println("Skill Name : " + skill4.nameSkill());
            System.out.println("Skill Type : " + skill4.getType());
            System.out.println("Skill Category : " + skill4.getCategory());
            System.out.println("Skill Power : " + skill4.getPower());
            System.out.println("Skill Accuracy : " + skill4.getAccuracy());
            System.out.println("Skill PP : " + skill4.getPP());
            System.out.println("Skill MaxPP : " + skill4.getmaxPP());
        }
        

        public void evo(int lv){
            if(lv==16){
                this.evogrovyle = new Grovyle(skill1, skill2, skill3, skill4);
            }
        }

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
        public void getExp(int exp){
            status.addExp(exp);
        }
}