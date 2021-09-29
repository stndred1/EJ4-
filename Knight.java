public class Knight extends Attacker{
    public String kname;
    public int kHP;
    public int kXP;
    public Knight(String name, int HP, int XP){
        super(name, 150, 0);        
    }
    @Override
    public int Attack(){
        return (int) Math.random()*HP/4 + XP/3;
   }
    public void Ability(){
        int destroy = 2;
        if (ability = true && destroy > 0 ){
            System.out.println("Has tirado tu espada y has herido a tu enemigo\n");
             Mage.HP = Mage.HP - 20;
             Brawler.HP = Brawler.HP - 20;
             destroy = destroy --;
             if (destroy > 0){
             }
             else if (destroy == 0){
             }
        }
        else if(ability == false | destroy == 0){
            System.out.println("No podes usar tus fuerzas!!\n");
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