/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleofwizards;

/**
 * class for the battle between the wizards
 *
 * @author Meeth
 */
public class BattleOfWizards {

    static Strategy s = new Strategy();// s is the reference of the object of type Strategy
    public static int gwins = 0,// wins of Gandalf

            /**
             * wins of Merlin
             */
            mwins = 0,
            /**
             * wins of Dumbledore
             */
            dwins = 0;

    /**
     * get the wins of Gandalf
     *
     * @return wins of Gandalf
     */
    public static int getGwins() {
        return gwins;
    }

    /**
     * set the wins of Gandalf
     *
     * @param gwins
     */
    public static void setGwins(int gwins) {
        BattleOfWizards.gwins = gwins;
    }

    /**
     * get the wins of Merlin
     *
     * @return wins of Merlin
     */
    public static int getMwins() {
        return mwins;
    }

    /**
     * set the wins of Merlin
     *
     * @param mwins
     */
    public static void setMwins(int mwins) {
        BattleOfWizards.mwins = mwins;
    }

    /**
     * get the wins of Dumbledore
     *
     * @return wins of Dumbledore
     */
    public static int getDwins() {
        return dwins;
    }

    /**
     * set the wins of Dumbledore
     *
     * @param dwins
     */
    public static void setDwins(int dwins) {
        BattleOfWizards.dwins = dwins;
    }

    /**
     * main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Original Strategy");
        s.battle(s.l.targets);// call battle to simulate fight with original strategy
        s.l.displayBoard();// display leader board
        System.out.println();
        System.out.println("***********************************************************");
        System.out.println("Alternate Strategy");
        s.alternate(s.l.targets);// call alternate to simulate the fight with alternate strategy
        s.l.displayBoard();// display leader board
        System.out.println();
        System.out.println("***********************************************************");

    }// end of main

} //end of BattleOfWizards

