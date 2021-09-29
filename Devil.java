public class Devil extends Demon{

    public Devil(String name, int HP, int XP){
        super(name, 300, 0);
    }
    @Override
    public int Attack(){
        return (int) Math.random()*HP/4;
    }
    @Override
    public void Ability(){
        int weaken = 3;
        if (ability = true && weaken > 0 ){
            System.out.println("Has debilitado a tu enemigo  con tu maldicion\n");
            Mage.XP = Mage.XP - 50;
            Brawler.XP = Mage.XP - 50;
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
