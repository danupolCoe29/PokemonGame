package Pokemon;
public class Status {
    public String name;
    public int maxhp;
    public int hp;
    public int atk;
    public int def;
    public int speed;
    public int exp;
    public int explvup;
    public int number;
    public int spatk;
    public int spdef;
    public int lv;
    //set
    public void setName(String name){
        this.name=name;
    }
    public void setMaxhp(int maxhp){
        this.maxhp=maxhp;
    }
    public void setHp(int hp){
        this.hp=hp;
    }
    public void setAtk(int atk){
        this.atk=atk;
    }
    public void setDef(int def){
        this.def=def;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setExp(int exp){
        this.exp=exp;
    }
    public void setExpuplv(int explvup){
        this.explvup=explvup;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setSpatk(int spatk){
        this.spatk=spatk;
    }
    public void setSpdef(int spdef){
        this.spdef=spdef;
    }
    public void setLv(int lv){
        this.lv=lv;
    }

    //get
    public String getName(){
        return this.name;
    }
    public int getMaxhp(){
        return this.maxhp;
    }
    public int getHp(){
        return this.hp;
    }
    public int getAtk(){
        return this.atk;
    }
    public int getDef(){
        return this.def;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getExp(){
        return this.exp;
    }
    public int getExplvup(){
        return this.explvup;
    }
    public int getNumber(){
        return this.number;
    }
    public int getSpatk(){
        return this.spatk;
    }
    public int getSpdef(){
        return this.spdef;
    }
    public int getLv(){
        return this.lv;
    }

    //addstatus
    public void addMaxhp(int add){
        this.maxhp+=add;
    }
    public void addHp(int add){
        this.hp+=add;
        if(this.hp>=this.maxhp)
            this.hp=this.maxhp;
    }
    public void addAtk(int add){
        this.atk+=add;
    }
    public void addDef(int add){
        this.def+=add;
    }
    public void addSpeed(int add){
        this.def+=add;
    }
    public void addExp(int add){
        this.exp+=add;
    }
    public void addExplvup(int add){
        this.explvup+=add;
    }
    public void addSpatk(int add){
        this.spatk+=add;
    }
    public void addSpdef(int add){
        this.spdef+=add;
    }
    public void lvup(){
        this.lv++;
    }

    //regeneration
    public void reHp(){
        this.hp=this.maxhp;
    }

    //pain
    public void painHp(int damage){
        if(damage>0)
            this.hp-=damage;
        else
            this.hp-=1;
    }
}