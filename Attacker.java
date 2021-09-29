public class Attacker{

    public static String name;
    public static  int HP;
    public static int XP;
    public boolean ability = true;

    public Attacker(String name, int HP, int XP){
        this.name = name;
        this.HP = HP;
        this.XP = XP;
    }

    public int Attack(){
        return 0;
    }
}