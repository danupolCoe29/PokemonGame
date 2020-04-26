import Pokemon.*;
public class Player {
    public String name;
    public int gold=1000;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void addGold(int gold){
        this.gold+=gold;
    }
    public int getGold(){
        return this.gold;
    }
    public void delGold(int gold){
        this.gold-=gold;
    }
}