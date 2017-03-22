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
 * this is a class for Strategies having LeaderBoard as the attribute
 *
 * @author Meeth
 */
public class Strategy {

    LeaderBoard l;// l is the reference of the object of type LeaderBoard

    /**
     * constructor of strategy
     */
    public Strategy() {
        l = new LeaderBoard();// l is initialized
    }

    /**
     * chooses the target who is still alive with greatest accuracy
     *
     * @param targets
     * @param shooter
     * @return target
     */
    public static Fighter chooseTarget(Fighter[] targets, Fighter shooter) {

        Fighter target = null;

        for (int i = targets.length - 1; i >= 0; i--) {

            if (targets[i].getAlive()) {
                if (!targets[i].getName().equals(shooter.getName())) {
                    target = targets[i];
                    break;
                }
            }
        }

        return target;
    }

    /**
     * method to simulate the battle between the wizards using original strategy
     *
     * @param targets
     */
    public void battle(Fighter[] targets) {
        for (int j = 1; j <= 10000; j++) {
            targets[0].setAlive(true);
            targets[1].setAlive(true);
            targets[2].setAlive(true);
            int trials = 3;

            while (trials > 1) {
                Fighter target;

                for (int i = 0; i < 3; i++) {
                    if (targets[i].getAlive()) {

                        target = chooseTarget(targets, targets[i]);
                        targets[i].shootAtTarget(target);
                        if (!target.getAlive()) {
                            trials--;
                        }

                    }
                }

            }
            if (targets[0].getAlive()) {
                gwins++;

            } else if (targets[1].getAlive()) {
                mwins++;

            } else {
                dwins++;

            }
        }
    }

    /**
     * simulates the battle between the wizards using alternate strategy
     *
     * @param targets
     */
    public void alternate(Fighter[] targets) {
        gwins = 0;
        mwins = 0;
        dwins = 0;
        for (int j = 1; j <= 10000; j++) {
            targets[0].setAlive(true);
            targets[1].setAlive(true);
            targets[2].setAlive(true);
            int trials = 3;
            boolean flag = true;
            while (trials > 1) {
                Fighter target;
                for (int i = 0; i < 3; i++) {
                    if (flag) {
                        target = chooseTarget(targets, targets[i]);
                        flag = false;

                    } else if (targets[i].getAlive()) {
                        target = chooseTarget(targets, targets[i]);
                        targets[i].shootAtTarget(target);
                        if (!target.getAlive()) {
                            trials--;

                        }
                    }
                }

            }
            if (targets[0].getAlive()) {
                gwins++;

            } else if (targets[1].getAlive()) {
                mwins++;

            } else {
                dwins++;

            }
        }
    }
}
