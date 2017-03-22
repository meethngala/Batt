/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleofwizards;

import static battleofwizards.BattleOfWizards.dwins;
import static battleofwizards.BattleOfWizards.gwins;
import static battleofwizards.BattleOfWizards.mwins;

/**
 * this is class for leader board having fighters as the attributes
 *
 * @author Meeth
 */
public class LeaderBoard {
// array of objects of type Fighter

    Fighter[] targets = new Fighter[]{
        new Fighter("Gandalf", 0.33),
        new Fighter("Merlin", 0.5),
        new Fighter("Dumbledore", 1.0)};

    /**
     * displays the leader board with the results after the fight
     */
    public void displayBoard() {
        System.out.println("LEADERBOARD – AFTER 10000 DUELS ");
        System.out.printf("%-20s %-20s %-20s", "Contestant", "Number of Wins ", "Winning Percentage ");

        System.out.println();
        System.out.printf("%-20s %-20d %-4.2f%%", targets[0].getName(), gwins, ((gwins * 100.0) / 10000));
        System.out.println();
        System.out.printf("%-20s %-20d %-4.2f%%", targets[1].getName(), mwins, ((mwins * 100.0) / 10000));
        System.out.println();
        System.out.printf("%-20s %-20d %-4.2f%%", targets[2].getName(), dwins, ((dwins * 100.0) / 10000));

    }
}
