/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import model.Game;
import model.Item;
import model.Warehouse;
import model.ItemType;
import model.ZombieCrusher;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author brycelaptop
 */
public class ZombieCrusherView extends View {

    public ZombieCrusherView() {

        super("\n"
                + "\n---------------------"
                + "\n| This is our melee vehicle. If you have faith|"
                + "\n| you will obliterate the path of the wicked. |"
                + "\n---------------------"
                + "\nC - Check ZombieCrusher Status"
                + "\nH - Leave to Haven"
                + "\nQ - Quit-Go back to Warehouse"
                + "\n---------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "C":
                this.displayCrusherStatus();
                if (TrailOfZombies.getCurrentGame().isGameOver())
                        return true;
                break;
            case "H":
                this.viewHaven();
                break;
            default:
                this.console.println("\n***Invalid selection *** Try again.");
                break;
        }

        return false;
    }

    private void displayCrusherStatus() {

        Game game = TrailOfZombies.getCurrentGame();
        ZombieCrusher zombieCrusher = game.getZombieCrusher();
        ArrayList<Item> zombieCrusherItems = zombieCrusher.getItems();

        if (!GameControl.containsItem(zombieCrusherItems, ItemType.food)) {
            this.console.println("You haven't put food in the Zombie Crusher yet. Keep looking!");
        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.weapon)) {
            this.console.println("You haven't put weapons in the Zombie Crusher yet. Keep looking!");
        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.water)) {
            this.console.println("You haven't put water the Zombie Crusher yet. Keep looking!");
        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.fuel)) {
            this.console.println("You don't have enough fuel yet for the Zombie Crusher. Keep looking!");
        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.carparts)) {
            this.console.println("You don't have all the carpart for the Zombie Crusher yet. Keep looking!");
        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.medicine)) {
            this.console.println("You haven't put any medicine in the Zombie Crusher yet. Keep looking!");
        }
        if (zombieCrusherItems.size() < 20) {
            this.console.println("You have not gathered enough items to leave with the zombie crusher");
        }
        if (zombieCrusherItems.size() >= 20) {
            this.console.println("You can now travel to the Haven");
        }

        int count = 0;
        if (zombieCrusherItems != null) {

            GameControl.sortItemsByName(zombieCrusherItems);
            for (Item item : zombieCrusherItems) {
                this.console.println(count + " - " + item.getDescription());

                count++;

            }
        } else {
            this.console.println("Your crate is empty.");
        }

    }

    private void viewHaven() {
        Game game = TrailOfZombies.getCurrentGame();
        ZombieCrusher zombieCrusher = game.getZombieCrusher();
        ArrayList<Item> zombieCrusherItems = zombieCrusher.getItems();

        if (!GameControl.containsItem(zombieCrusherItems, ItemType.food)) {

        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.weapon)) {

        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.water)) {

        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.fuel)) {
        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.carparts)) {

        }
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.medicine)) {

        }
        if (zombieCrusherItems.size() < 20) {
            this.console.println("Make sure you have gathered everything you need!");
        }
        if (zombieCrusherItems.size() >= 20) {
            this.console.println("--------------------------------WELCOME TO HAVEN!-------------------------------"
+"\n                                                                              "
+"\n.........=MMZ =M::M MM7. ......... ..........................................."
+"\n.......MM . M.7D+M O.$M ...... . . ........................................ " 
+"\n . MMI:8MM ?MMM.,+ M Z. ..... . ......................................... "
+"\n ..M8 :. +MM.. .. ,O....... . . ........................................ " 
+"\n. .8MMDDDNMIM. ......................,:.,~:............................... " 
+"\n. MD ......M. .. .. ..... . .Z.I...$...= .= ,........................ "
+"\n M7.:MMMOOMM. . .. . ... O ... ?..M..+...?....ZN~. M...+............. " 
+"\n +M~MZ..... .M. . . . ..M = + M?ZMMMMMMMM?. M .. .7... ~ ............ "
+"\n MMM ....:MMMMI . . . =$ ? MMMMMMMMMMMMMMMMMM,.N+.M.: MI.............. " 
+"\n MM . MM,. ~MM. . . .~. $MMMMMMMMMMMMMMMMMMMMMMM..O.OZ.O...N.......... "
+"\n M...DM... ?MMZ:~MMMMMN$~MM8 ..,DMMMMMMMMMMMMMMMMMMMMMMMMMM:.MZ.8 M.$......... " 
+"\n M MN... MN ..MM~. MN~ MD .$..MMMMMI..MMMMMMMMMMMMMMMMMMMM .M..?M.I .......... " 
+"\n M.MD...NM,..IM . NM, MM77..,=.......MM DMMMMMMMMMMMMMM,MMM..N..O.,,MM.........."
+"\n MMM...8M...MM...OM..MM. 8.M....... ..=MMMMMMMMMMMMMMM MM ...$ M.M..........."
+"\n MMM..+M ..NM...IM .,M ....O............~MMMMMMMMMMMM,NM.7M........N............"
+"\n MM MZ . M...,M...M.$... $............MMMMMMMMMM...,... MI$+ . .M ............."
+"\n 7M NM . M+ . M+..MM.$ ..?.. ,~,.....N:.....OMM......+D~.... ..+M .............."
+"\n .M+MM...M...$M . M...?..MI+.....=O~,.........8 .... I. .? .M: O.~~ ............"
+"\n .MMM..MM.. M:. MM ....N?.........,+..........N...,,.O~ M =O ,7 .:.. NMM, ...."
+"\n .MM .MM.. M...MZ..Z: ............+ ..........?. M.? .8..M,.O?.$ M .MMMM=....."
+"\n MM,MM..7M.. M..8 .,M............:..........N.= ,.~. MO M8....~MMM~......."
+"\n . MMMM..MM...M ..7 . ~.......... :......... ,.NMZ..,..N .M .M ..MMM........."
+"\n ...MMM .MM..:M.... O~.........+++ .........M..N7M.O .?. .M .=.IMMO........."
+"\n ......MO MM..,M ..M.. .....=D .. 7:...... D...+. N .,..,M+ ?N .+MM,DM,......"
+"\n ...... NMMM...M..M 7,NI~Z.M........ M=~IM8.....,DZ=M .Z8..$7 .. ...... MM...."
+"\n.. .........?M7. M..N.M... M.......... . 87=+M7I. =. .:N.,,D. .8 ........ M:+.."
+"\n..............MM$MM .M ~MMZM ...........N ... 8M~~..=..~= , +..Z .......D..?.?+."
+"\n.. ............ ZMMM MM,...M............M... M. ~8 . .MM M M.. ?........O.. ?.M."
+"\n. .............. MMMMM?MM ............7...7 ..M.I=..+::. M..M.........O...?.M="
+"\n ................. :DMMN ............= ...M...~.I =.M.O O=. M.........M..?. MN"
+"\n ....................+............NIM. 7. ~= .$ D.M M..:N M .M M. MD"
+"\n.......................= ........D?.....M....N?DM..NMN,NM.M..77.....M..=O.,D?:M:"
+"\n. .................. DMM.. .M$..........=MM.. +,,. . MM M+.Z7....M...M. M.OMM "
+"\n.. ...................,~ +,... +...... . $~....MM ..MZM M.IM .,M..N: $~MMM.."
+"\n.. ............................. M ......D, M ..:MZ..8MM. MMM:M...M O.MMMMN .."
+"\n. .............................. ,ODD?.....DMMMD NMN, ... DMMZZM,:MMMMMM7....."
+"\n ................................... . . . . =ZNN8?.. ..."
+"\n------------------------------(ZOMBIES NOT ALLOWED!)-----------------------------"
                  
+ "\n Game is over!  You will be redirected to the main menu.");
        
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }

        TrailOfZombies.getCurrentGame().setGameOver(true);
        }
    }

        
}
