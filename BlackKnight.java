public class BlackKnight extends Knight{

    public BlackKnight(String name, int HP, int XP){
        super(name, 200, 0);
    }
    @Override
    public int Attack(){
        return (int) Math.random()*HP/2 + XP/2;
   }
   public void Ability(){
    int destroy = 3;
    if (ability = true && destroy > 0 ){
        System.out.println("Has tirado tu espada y has herido a tu enemigo\n");

        Mage.HP = Mage.HP - 40;
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
}