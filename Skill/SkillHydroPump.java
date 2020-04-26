package Skill;
import java.util.Random;

public class SkillHydroPump extends ModelSkill{
    private String name = "Hydro Pump";
    private String type = "WATER";
    private String category = "Special";
    private int maxPP = 5;
    private int pp = 5;
    private int power = 110;
    private int accuracy = 80;

    public String nameSkill(){
        return this.name;
    }
    public int getPower(){
        return this.power;
    }
    public int getmaxPP(){
        return this.maxPP;
    }
    public int getPP(){
        return this.pp;
    }
    public String getType(){
        return this.type;
    }
    public String getCategory(){
        return this.category;
    }
    public int getAccuracy(){
        return this.accuracy;
    }
    public void addPP(int add){
        this.pp+=add;
        if(this.pp>=this.maxPP)
            this.pp=this.maxPP;
    }
    public int attack(){
        if(pp>0){
        this.pp-=1;
        Random rate = new Random();
        int rateatk = rate.nextInt(100);
        if(rateatk<=accuracy)
            return this.power;
        else 
            return 0;
        }
        else
            return -1;
    }
}