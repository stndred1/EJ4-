public class Demon extends Attacker{

   public Demon(String name, int HP, int XP){
       super(name, 200, 0);

   }
   @Override
   public int Attack(){
        return (int) Math.random()*HP/4;
   }
   public void Ability(){
       int weaken = 2;
       if (ability = true && weaken > 0 ){
           System.out.println("Has debilitado a tu enemigo con tu maldicion \n");
           Mage.XP = Mage.XP - 20;
           Brawler.XP = Brawler.XP - 20;
            weaken = weaken --;
            if (weaken > 0){
            }
            else if (weaken == 0){
            }
       }
       else if(ability == false | weaken == 0){
           System.out.println("No podes usar tu poder!!\n");
       }
   }

}