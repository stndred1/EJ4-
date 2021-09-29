public class Mage extends Attacker{
    public boolean ability = true;
    private int item;
    public Mage(String name, int HP, int XP){
        super(name, 100, 0);
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
        return 75 + XP/2;
    }
    public void ability(){
        if (ability = true && item >0){
                item  = 4;
                System.out.println("Usaste tu item x2 HP!\n");
                this.HP = HP + HP/2;
                item = item --;
        }
        else if (ability = false){
            System.out.println("No tenes items para usar!\n");
        }
    }
    public static void setName(String name){
        Mage.name = name;
    }
    public static void setHP(int HP){
        Mage.HP = HP;
    }
    public static void setXP(int XP){
        Mage.XP = XP;
    }
}

