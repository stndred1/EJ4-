
import java.util.Scanner;
import java.util.Random;
public class Menu{
    private static Scanner s = new Scanner(System.in);
    static Brawler b = new Brawler(Name, 150, 0);
    static BlackKnight bk = ("Black Knight", 200, 0);
    static Demon d = new Demon("Demon", 200, 0);
    static Devil D = new Devil("Devil", 300, 0);
    static String Name;
    static Mage m = new Mage(Name, 100, 0);
    static Knight k = new Knight("Knight", 150, 0);
    private static boolean inProgress;
    private static int place = 0, act = 1;
    public static void PAC(){
        System.out.println("Presione cualquier boton para continuar");
        s.next();
    }
    public static void startGame(){
        //try{
        System.out.println("Bienvenido a Tierra de Magia");
        System.out.println("Director: Edgar 211133 \n");
        int opt;
        boolean pName = false;
        System.out.println("Te gustaria ser: \n 1. un mago \n 2. un batallador?");
        opt = s.nextInt(3);
        if (opt ==1){
            do{
                System.out.println("Cul es tu nombre, valiente aventurero? \n");
                Name = s.next();
                System.out.println("Tu nombre es " + Name + "?\n");
                System.out.println("1. Si\n");
                System.out.println("2. No\n");
                int N = s.nextInt(3);
                if (N == 1)
                    pName = true;   
            }
                while(!pName);  
                    Story.introM();
                    m = new Mage(Name, 100, 0);  
                    inProgress = true;
                    while(inProgress = true){
                        printMenu();
                        int N = s.nextInt(4);
                        if (N == 1){
                            if (place != 5){
                                storyModem();
                            }
                        }     
                        else if (N == 2){
                            pInfo();
                        }       
                        else inProgress = false;
                    }     
        }
        else if (opt == 2){
            Name = s.nextLine();
            b = new Brawler(Name, 150, 0);
            inProgress = true;
            public static void storyModeb(){
                Story.firstBattle();
        
                battle();
                if(m.XP >= 10 && act ==1){
                    act = 2;
                    place = 1;
                }
                else if (m.XP >= 35 && act == 2){
                    act = 3;
                    place = 2;
                    Story.blackKnightsStronghold();
                    battleb();
                }
                else if (m.XP >= 60 && act == 3){
                    act = 4;
                    place = 3;
                    Story.castleBossBattle();
                    castleBossBattleb();
                    m.HP = 100;
                }
                else if (m.XP >= 85 && act == 4){
                    act = 5;
                    place = 4;
                    Story.roadtoHell();
                    Demonb();
                    m.HP = 100;
                }
                else if (m.XP >= 110 && act == 5){
                    act = 6;
                    place = 5;
                    Story.Hell();
        
                    m.HP = 100;
                }
                else if (m.XP >= 140 && act == 6){
                    act = 7;
                    place = 6;
                    Story.deviloftheTreeStars();
                    finalBattleb();
                }
            }
        }
//}
    //catch(Exception e){
        //System.out.println("Ingrese una de las opciones disponibles");
   // }
}
    public static void pInfo(){
        System.out.println(m.name + "\t HP " + m.HP + "\t XP " + m.XP + "\n");
    }
    public static void pInfoB(){
        System.out.println(b.name + "\t HP " + b.HP + "\t XP " + b.XP);
        System.out.println("\n");
    }
    public static void printMenu(){
        System.out.println("Que deseas hacer: \n");
        System.out.println("1. Empezar tu aventura\n");
        System.out.println("2. Ver las caracteristicas de tu mago\n");
        System.out.println("3. Salir del juego\n");
    }
    public static void begin(){
        while(inProgress = true){
            printMenu();
            int N = s.nextInt(4);
            if (N == 1){
                if (place != 5){
                    storyModem();
                }
            }
                 
            else if (N == 2){
                pInfo();
            }       
            else inProgress = false;
        }
    }
    public static void storyModem(){
        Story.firstBattle();

        battle();
        if(m.XP >= 10 && act ==1){
            act = 2;
            place = 1;
        }
        else if (m.XP >= 35 && act == 2){
            act = 3;
            place = 2;
            Story.blackKnightsStronghold();
            battle();
        }
        else if (m.XP >= 60 && act == 3){
            act = 4;
            place = 3;
            Story.castleBossBattle();
            castleBossBattle();
            m.HP = 100;
        }
        else if (m.XP >= 85 && act == 4){
            act = 5;
            place = 4;
            Story.roadtoHell();
            Demon();
            m.HP = 100;
        }
        else if (m.XP >= 110 && act == 5){
            act = 6;
            place = 5;
            Story.Hell();

            m.HP = 100;
        }
        else if (m.XP >= 140 && act == 6){
            act = 7;
            place = 6;
            Story.deviloftheTreeStars();
            finalBattle();
        }
    }
    public static void battle(){
        while (true){
            //try{
            int n;
            int damage;
            k.kname = "Knight";
            m.HP = m.HP;
            k.HP = k.HP;
            m = new Mage(Name, 100, 0);
            System.out.println(Name + "\t HP " + m.HP + "\n");
            System.out.println(k.kname + "\t HP " + k.HP + "\n");
            System.out.println(Name + " que vas hacer?");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu item \n3. Correr\n");
            n = s.nextInt(4);
                if (n == 1){
                      damage = k.HP - m.Attack();
                     if (damage < 0){
                        damage = 60;
                    }
                        System.out.println("Has hecho " + damage + " de dano\n");
                        k.HP = k.HP - damage;
                        System.out.println("El caballero tiene " + k.HP + " HP!\n");                      
                     if (k.HP <= 0){
                        System.out.println("Has derrotado al caballero!\n");
                        m.XP = m.XP + 15;
                        System.out.println("Has ganado " + m.XP + " XP\n");
                        break;
                    }
                    else if (k.HP > 0){
                        battleknight();
                    }
                }
                if (n == 2){
                        m.ability();
                }
                else if (n ==3){
                        Random r = new Random();
                        if(r.nextInt(15) > 10){
                            System.out.println("Has escapado!!\n");
                            PAC();
                            storyModem();
                        }
                        else if (r.nextInt(15) <= 10){
                            System.out.println("No podes escapar!");
                            PAC();
                            break;
                        }
                    }
        }
    }
        
        //catch (Exception e){
        //    System.out.println("Por favor elige un numero entre 1 - 3 ");
        //}
        public static void battleknight(){
            int kdamage = 0;
            int n;
            System.out.println("Caballero que vas hacer");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu habilidad \n3. Correr\n");
            n = s.nextInt(4);
            if (n == 1){
                kdamage = m.HP - k.Attack();
               if (kdamage < 0){
                  kdamage = 0;
              }
                  System.out.println("Has hecho " + kdamage + " de dano\n");
                  m.HP = m.HP - kdamage;
                  System.out.println("El caballero tiene " + m.HP + " HP!\n");                      
               if (m.HP <= 0){
                  System.out.println("Has derrotado al mago!\n");
                  //mdied();
              }
              else if (m.HP > 0){
                  battle();
              }
          }
          if (n == 2){
                  k.Ability();
          }
          else if (n ==3){
                  Random r = new Random();
                  if(r.nextInt(15) > 10){
                      System.out.println("Has escapado!!\n");
                      PAC();
                      storyModem();
                  }
                  else if (r.nextInt(15) <= 10){
                      System.out.println("No podes escapar!");
                      PAC();
                  }
              }
    }
    public static void battleb(){
        while (true){
            //try{
            int n;
            int damage;
            k.kname = "Knight";
            b.HP = b.HP;
            k.HP = k.HP;
            b = new Brawler(Name, 150, 0);
            System.out.println(Name + "\t HP " + b.HP + "\n");
            System.out.println(k.kname + "\t HP " + k.HP + "\n");
            System.out.println(Name + " que vas hacer?");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu item \n3. Correr\n");
            n = s.nextInt(4);
                if (n == 1){
                      damage = k.HP - b.Attack();
                     if (damage < 0){
                        damage = 60;
                    }
                        System.out.println("Has hecho " + damage + " de dano\n");
                        k.HP = k.HP - damage;
                        System.out.println("El caballero tiene " + k.HP + " HP!\n");                      
                     if (k.HP <= 0){
                        System.out.println("Has derrotado al caballero!\n");
                        m.XP = m.XP + 15;
                        System.out.println("Has ganado " + b.XP + " XP\n");
                        break;
                    }
                    else if (k.HP > 0){
                        battleknight();
                    }
                }
                if (n == 2){
                        b.ability();
                }
                else if (n ==3){
                        Random r = new Random();
                        if(r.nextInt(15) > 10){
                            System.out.println("Has escapado!!\n");
                            PAC();
                            storyModem();
                        }
                        else if (r.nextInt(15) <= 10){
                            System.out.println("No podes escapar!");
                            PAC();
                            break;
                        }
                    }
        }
    }
        
        //catch (Exception e){
        //    System.out.println("Por favor elige un numero entre 1 - 3 ");
        //}
        public static void battleknightb(){
            int kdamage = 0;
            int n;
            System.out.println("Caballero que vas hacer");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu habilidad \n3. Correr\n");
            n = s.nextInt(4);
            if (n == 1){
                kdamage = b.HP - k.Attack();
               if (kdamage < 0){
                  kdamage = 0;
              }
                  System.out.println("Has hecho " + kdamage + " de dano\n");
                  m.HP = m.HP - kdamage;
                  System.out.println("El caballero tiene " + b.HP + " HP!\n");                      
               if (m.HP <= 0){
                  System.out.println("Has derrotado al mago!\n");
                  //mdied();
              }
              else if (b.HP > 0){
                  battle();
              }
          }
          if (n == 2){
                  k.Ability();
          }
          else if (n ==3){
                  Random r = new Random();
                  if(r.nextInt(15) > 10){
                      System.out.println("Has escapado!!\n");
                      PAC();
                      storyModem();
                  }
                  else if (r.nextInt(15) <= 10){
                      System.out.println("No podes escapar!");
                      PAC();
                  }
              }
    }
    public static void castleBossBattle(){
        while (true){
            //try{
            int n;
            int damage;
            bk.kname = "Black Knight";
            m.HP = m.HP;
            bk.HP = bk.HP;
            System.out.println(Name + "\t HP " + m.HP + "\n");
            System.out.println(bk.kname + "\t HP " + bk.HP + "\n");
            System.out.println(Name + " que vas hacer?");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu item \n3. Correr\n");
            n = s.nextInt(4);
                if (n == 1){
                      damage = bk.HP - m.Attack();
                     if (damage < 0){
                        damage = 60;
                    }
                        System.out.println("Has hecho " + damage + " de dano\n");
                        bk.HP = bk.HP - damage;
                        System.out.println("El caballero tiene " + bk.HP + " HP!\n");                      
                     if (bk.HP <= 0){
                        System.out.println("Has derrotado al caballero!\n");
                        m.XP = m.XP + 15;
                        System.out.println("Has ganado " + m.XP + " XP\n");
                        break;
                    }
                    else if (bk.HP > 0){
                        castleBossBattle1();
                    }
                }
                if (n == 2){
                        m.ability();
                }
                else if (n ==3){
                        Random r = new Random();
                        if(r.nextInt(15) > 10){
                            System.out.println("Has escapado!!\n");
                            PAC();
                            storyModem();
                        }
                        else if (r.nextInt(15) <= 10){
                            System.out.println("No podes escapar!");
                            PAC();
                            break;
                        }
                    }
        }
    }
        
        //catch (Exception e){
        //    System.out.println("Por favor elige un numero entre 1 - 3 ");
        //}
        public static void castleBossBattle1(){
            int bkdamage = 0;
            int n;
            System.out.println("Caballero Negro que vas hacer");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu habilidad \n3. Correr\n");
            n = s.nextInt(4);
            if (n == 1){
                bkdamage = bk.HP - m.Attack();
               if (bkdamage < 0){
                  bkdamage = 0;
              }
                  System.out.println("Has hecho " + bkdamage + " de dano\n");
                  m.HP = m.HP - bkdamage;
                  System.out.println("El caballero tiene " + m.HP + " HP!\n");                      
               if (m.HP <= 0){
                  System.out.println("Has derrotado al mago!\n");
                  //mdied();
              }
              else if (m.HP > 0){
                  battle();
              }
          }
          if (n == 2){
                  bk.Ability();
          }
          else if (n ==3){
                  Random r = new Random();
                  if(r.nextInt(15) > 10){
                      System.out.println("Has escapado!!\n");
                      PAC();
                      storyModem();
                  }
                  else if (r.nextInt(15) <= 10){
                      System.out.println("No podes escapar!");
                      PAC();
                  }
              }
    }
    public static void castleBossBattleb(){
        while (true){
            //try{
            int n;
            int damage;
            bk.kname = "Black Knight";
            b.HP = b.HP;
            bk.HP = bk.HP;
            System.out.println(Name + "\t HP " + b.HP + "\n");
            System.out.println(bk.kname + "\t HP " + bk.HP + "\n");
            System.out.println(Name + " que vas hacer?");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu item \n3. Correr\n");
            n = s.nextInt(4);
                if (n == 1){
                      damage = bk.HP - b.Attack();
                     if (damage < 0){
                        damage = 60;
                    }
                        System.out.println("Has hecho " + damage + " de dano\n");
                        bk.HP = bk.HP - damage;
                        System.out.println("El caballero tiene " + bk.HP + " HP!\n");                      
                     if (bk.HP <= 0){
                        System.out.println("Has derrotado al caballero!\n");
                        b.XP = m.XP + 15;
                        System.out.println("Has ganado " + b.XP + " XP\n");
                        break;
                    }
                    else if (bk.HP > 0){
                        castleBossBattle1();
                    }
                }
                if (n == 2){
                        b.ability();
                }
                else if (n ==3){
                        Random r = new Random();
                        if(r.nextInt(15) > 10){
                            System.out.println("Has escapado!!\n");
                            PAC();
                            storyModem();
                        }
                        else if (r.nextInt(15) <= 10){
                            System.out.println("No podes escapar!");
                            PAC();
                            break;
                        }
                    }
        }
    }
        
        //catch (Exception e){
        //    System.out.println("Por favor elige un numero entre 1 - 3 ");
        //}
        public static void castleBossBattle1b(){
            int bkdamage = 0;
            int n;
            System.out.println("Caballero Negro que vas hacer");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu habilidad \n3. Correr\n");
            n = s.nextInt(4);
            if (n == 1){
                bkdamage = bk.kHP - m.Attack();
               if (bkdamage < 0){
                  bkdamage = 0;
              }
                  System.out.println("Has hecho " + bkdamage + " de dano\n");
                  b.HP = b.HP - bkdamage;
                  System.out.println("El caballero tiene " + mb.HP + " HP!\n");                      
               if (b.HP <= 0){
                  System.out.println("Has derrotado al mago!\n");
                  //mdied();
              }
              else if (b.HP > 0){
                  battle();
              }
          }
          if (n == 2){
                  bk.Ability();
          }
          else if (n ==3){
                  Random r = new Random();
                  if(r.nextInt(15) > 10){
                      System.out.println("Has escapado!!\n");
                      PAC();
                      storyModem();
                  }
                  else if (r.nextInt(15) <= 10){
                      System.out.println("No podes escapar!");
                      PAC();
                  }
              }
    }
    public static void finalBattle(){
        while (true){
            //try{
            int n;
            int damage;
            D.name = "Devil";
            m.HP = m.HP;
            D.HP = D.HP;
            System.out.println(Name + "\t HP " + m.HP + "\n");
            System.out.println(D.name + "\t HP " + D.HP + "\n");
            System.out.println(Name + " que vas hacer?");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu item \n3. Correr\n");
            n = s.nextInt(4);
                if (n == 1){
                      damage = D.HP - m.Attack();
                     if (damage < 0){
                        damage = 60;
                    }
                        System.out.println("Has hecho " + damage + " de dano\n");
                        D.HP = D.HP - damage;
                        System.out.println("El caballero tiene " + D.HP + " HP!\n");                      
                     if (D.HP <= 0){
                        System.out.println("Has derrotado al caballero!\n");
                        m.XP = m.XP + 15;
                        System.out.println("Has ganado " + m.XP + " XP\n");
                        break;
                    }
                    else if (D.HP > 0){
                        castleBossBattle1();
                    }
                }
                if (n == 2){
                        m.ability();
                }
                else if (n ==3){
                        Random r = new Random();
                        if(r.nextInt(15) > 10){
                            System.out.println("Has escapado!!\n");
                            PAC();
                            storyModem();
                        }
                        else if (r.nextInt(15) <= 10){
                            System.out.println("No podes escapar!");
                            PAC();
                            break;
                        }
                    }
        }
    }
        
        //catch (Exception e){
        //    System.out.println("Por favor elige un numero entre 1 - 3 ");
        //}
        public static void finalBattle1(){
            int Ddamage = 0;
            int n;
            System.out.println("Caballero Negro que vas hacer");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu habilidad \n3. Correr\n");
            n = s.nextInt(4);
            if (n == 1){
                Ddamage = m.HP - D.Attack();
               if (Ddamage < 0){
                Ddamage = 0;
              }
                  System.out.println("Has hecho " + Ddamage + " de dano\n");
                  m.HP = m.HP - Ddamage;
                  System.out.println("El caballero tiene " + m.HP + " HP!\n");                      
               if (m.HP <= 0){
                  System.out.println("Has derrotado al mago!\n");
                  //mdied();
              }
              else if (D.HP > 0){
                  battle();
              }
          }
          if (n == 2){
            D.Ability();
          }
          else if (n ==3){
                  Random r = new Random();
                  if(r.nextInt(15) > 10){
                      System.out.println("Has escapado!!\n");
                      PAC();
                      storyModem();
                  }
                  else if (r.nextInt(15) <= 10){
                      System.out.println("No podes escapar!");
                      PAC();
                  }
              }
    }
    public static void finalBattleb(){
        while (true){
            //try{
            int n;
            int damage;
            D.name = "Devil";
            b.HP = b.HP;
            D.HP = D.HP;
            System.out.println(Name + "\t HP " + b.HP + "\n");
            System.out.println(D.name + "\t HP " + D.HP + "\n");
            System.out.println(Name + " que vas hacer?");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu item \n3. Correr\n");
            n = s.nextInt(4);
                if (n == 1){
                      damage = D.HP - b.Attack();
                     if (damage < 0){
                        damage = 60;
                    }
                        System.out.println("Has hecho " + damage + " de dano\n");
                        D.HP = D.HP - damage;
                        System.out.println("El caballero tiene " + D.HP + " HP!\n");                      
                     if (D.HP <= 0){
                        System.out.println("Has derrotado al caballero!\n");
                        m.XP = m.XP + 15;
                        System.out.println("Has ganado " + b.XP + " XP\n");
                        Win();
                        break;
                    }
                    else if (D.HP > 0){
                        castleBossBattle1();
                    }
                }
                if (n == 2){
                        b.ability();
                }
                else if (n ==3){
                        Random r = new Random();
                        if(r.nextInt(15) > 10){
                            System.out.println("Has escapado!!\n");
                            PAC();
                            storyModem();
                        }
                        else if (r.nextInt(15) <= 10){
                            System.out.println("No podes escapar!");
                            PAC();
                            break;
                        }
                    }
        }
    }
        
        //catch (Exception e){
        //    System.out.println("Por favor elige un numero entre 1 - 3 ");
        //}
        public static void finalBattle1b(){
            int Ddamage = 0;
            int n;
            System.out.println("Caballero Negro que vas hacer");
            System.out.println("Elija su proxima accion \n");
            System.out.println("1. Atacar \n2. Usar tu habilidad \n3. Correr\n");
            n = s.nextInt(4);
            if (n == 1){
                Ddamage = b.HP - D.Attack();
               if (Ddamage < 0){
                Ddamage = 0;
              }
                  System.out.println("Has hecho " + Ddamage + " de dano\n");
                  b.HP = b.HP - Ddamage;
                  System.out.println("El caballero tiene " + b.HP + " HP!\n");                      
               if (D.HP <= 0){
                  System.out.println("Has derrotado al mago!\n");
                  mdied();
              }
              else if (b.HP > 0){
                  battle();
              }
          }
          if (n == 2){
            D.Ability();
          }
          else if (n ==3){
                  Random r = new Random();
                  if(r.nextInt(15) > 10){
                      System.out.println("Has escapado!!\n");
                      PAC();
                      storyModem();
                  }
                  else if (r.nextInt(15) <= 10){
                      System.out.println("No podes escapar!");
                      PAC();
                  }
              }
    }

    public static void Win(){
        System.out.println("Ganaste?!")
    }
    public static void mdied(){
        System.out.println("Game over Perdiste!")
        System.exit(0);
    }
    public static void bdied(){
        System.out.println("Game over Perdiste!")
        System.exit(0);
    }
}

