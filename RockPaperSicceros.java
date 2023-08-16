//
//
//

import java.util.*;
public class RockPaperSicceros
{
 static Scanner in = new Scanner(System.in);
 public  static void main (String[] args)
 {
  pic1VS1();
  pic1VS2();
  pic1VS3();
  pic2VS1();
  pic2VS2();
  pic2VS3();
  pic3VS1();
  pic3VS2();
  pic3VS3();
  int lose_counter = 0;
  int win_counter = 0;
while(win_counter > -1)
{ 
  showChoice();
  sop("your choice is?");
  int user_choice = in.nextInt();
  int cpu_choice = (int)(Math.random()*3)+1;
  VisualProccesingUnite(user_choice,cpu_choice);
  ResultProccessor_DeclareResult_ShowState ( user_choice , cpu_choice);
}


 }
 
 
public static void sop (String x)
  {
   System.out.print(x);
  }
  
public static void sopln (String x)
  {
   System.out.println(x);
  }
public static void showChoice ()
  {
   sopln("*************************************************************************************");
   sopln("                        CHOOSE: \n");
   sopln("     ROCK               PAPER         scissors");
   sopln("       1                  2             3 ");
  }
public static void VisualProccesingUnite(int user_choice,int cpu_choice)
  {
  sop("\n\n");
  if (user_choice==1 && cpu_choice==1){sopln(" ROCK VS ROCK");};
  if (user_choice==1 && cpu_choice==2){sopln(" ROCK VS PAPER");};
  if (user_choice==1 && cpu_choice==3){sopln(" ROCK VS SICCEORS");};
  
  if (user_choice==2 && cpu_choice==1){sopln(" PAPER VS ROCK");};
  if (user_choice==2 && cpu_choice==2){sopln(" PAPER VS PAPER");};
  if (user_choice==2 && cpu_choice==3){sopln(" PAPER VS SICCEORS");};
 
  if (user_choice==3 && cpu_choice==1){sopln(" SICCEORS VS ROCK");};
  if (user_choice==3 && cpu_choice==2){sopln(" SICCEORS VS PAPER");};
  if (user_choice==3 && cpu_choice==3){sopln(" SICCEORS VS SICCEORS");};
  }
public static void pic1VS1()
 {
  sopln("");
  sopln("       _____                    _____         ");
  sopln("      /  _  \\___            ___/  _  \\      ");
  sopln("_____/  ) |_/___)          (___\\_| (  \\_____");
  sopln("          (_____)          (_____)            ");
  sopln("          (_____)          (_____)            ");
  sopln("____\\_____(____)           (____)_____/_____ ");
  sopln("\n        YOU                       CPU       ");
  sopln("");
 }
public static void pic1VS2()
 {
  sopln("                                              ");
  sopln("                                     _        ");
  sopln("                                    ( |       ");
  sopln("       _____                        | |       ");
  sopln("      /  _  \\___        ____________|  \\    ");
  sopln("_____/  ) |_/___)      (________(   (   )_____");
  sopln("          (_____)      (_______ (       |     ");
  sopln("          (_____)      (________(             ");
  sopln("____\\_____(____)        (______________/_____");
  sopln("\n        YOU                       CPU       ");
  sopln("");
 }
public static void pic1VS3()
 {
 }
public static void pic2VS1()
 {
 }
public static void pic2VS2()
 {
  sopln("        _                             _  ");
  sopln("       | )                           ( |        ");
  sopln("       | |                           | |       ");
  sopln("      /  |____________   ____________|  \\    ");
  sopln("_____(   )   )________) (________(   (   )_____");
  sopln("     |       ) _______) (_______ (       |     ");
  sopln("             )________) (________(             ");
  sopln("_____\\_______________)   (______________/______");
  sopln("                        ");
 }
public static void pic2VS3()
 {
 }
public static void pic3VS1()
 {
 }
public static void pic3VS2()
 {
 }
public static void pic3VS3()
 {
 }
 
public static void ResultProccessor_DeclareResult_ShowState (int user_choice , int cpu_choice)
  { 
  if ((user_choice==1 && cpu_choice==3)||
     (user_choice==2 && cpu_choice==1)||
     (user_choice==3 && cpu_choice==2)){sopln("********YOU WIN"); /*win_counter ++;*/}
  
  if ((user_choice==1 && cpu_choice==2)||
     (user_choice==2 && cpu_choice==3)||
     (user_choice==3 && cpu_choice==1)){sopln("********YOU LOSE"); /*lose_counter++;*/}
 
  if ((user_choice==1 && cpu_choice==1)||
     (user_choice==2 && cpu_choice==2)||
     (user_choice==3 && cpu_choice==3)){sopln("********NO ONE WINS");}
  
   //System.out.println("STATS:\nWINS: " + win_counter + "\nLOSES: "+lose_counter);
  }
}
/*NOTES:

number resembles plays:
Rock-1
Paper-2
Sicceors-3

*/