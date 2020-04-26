package test;

import java.util.Random;
public class Test {
    public String name ;
    String type ;
    String category ;
    int maxPP ;
    int pp ;
    int power ;
    int accuracy ;
    
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