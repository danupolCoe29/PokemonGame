package test;
import java.util.Random;
public class Test2 extends Test{
  String name = "Ember";
    String type = "FIRE";
    String category = "Special";
    int maxPP = 25;
    int pp = 25;
    int power = 40;
    int accuracy = 100;
    public String nameSkill(){
        return name;
    }
    public int getPower(){
        return power;
    }
    public int getmaxPP(){
        return maxPP;
    }
    public int getPP(){
        return pp;
    }
    public String getType(){
        return type;
    }
    public String getCategory(){
        return category;
    }
    public int getAccuracy(){
        return accuracy;
    }
    public int attack(){
        this.pp-=1;
        Random rate = new Random();
        int rateatk = rate.nextInt(100);
        if(rateatk<=accuracy)
            return power;
        else 
            return 0;
    }
}