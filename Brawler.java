public class Brawler extends Attacker{
    private int item;
    public Brawler(String name, int HP, int XP){
        super(name, 150, 0);
        if (XP == 15){
            HP = HP + 25;
        }
        if (XP == 35){
            HP = HP + 25;
        }
        if (XP == 60){
            HP = HP + 25;
        }
        if (XP == 100){
            HP = HP + 30;
        }
        if (XP >= 150){
            HP = HP ++;
        }       
    }
    @Override
    public int Attack(){
        return (int) Math.random()* HP/3 + XP/4;
    }
    public void ability(){
        if (ability = true && item >0){
                item  = 2;
                System.out.println("Usaste tu item x2 HP!\n");
                this.HP = HP + HP/2;
                item = item --;
                    if (item > 0){ 
                    }
                    else if (item < 0 ){
                    }
        }
        else if (ability = false | item == 0){
            System.out.println("No tenes items para usar!\n");
        }
    }
}