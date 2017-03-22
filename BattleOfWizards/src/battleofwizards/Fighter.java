/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleofwizards;

import java.util.Random;

import java.util.*;

/**
 * this is a class for fighters
 *
 * @author Meeth
 */
public class Fighter {
// attributes of the class Fighter

    private String name;
    private double shootAccuracy;
    private boolean alive = true;
    Random rnd = new Random();

    /**
     * default constructor of Fighter
     */
    public Fighter() {

    }

    /**
     * get the shooting accuracy of the wizard
     *
     * @return shooting accuracy of the wizard
     */
    public double getShootAccuracy() {
        return shootAccuracy;
    }

    /**
     * get the is alive status of the wizard
     *
     * @return true if wizard is alive
     */
    public boolean getAlive() {
        return alive;
    }

    /**
     * set the alive status of wizard
     *
     * @param alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * constructor of class Fighter
     *
     * @param name
     * @param shootAccuracy
     */
    public Fighter(String name, double shootAccuracy) {

        this.name = name;
        this.shootAccuracy = shootAccuracy;
    }

    /**
     * get the name of the wizard
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set the name of wizard
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the shooting accuracy
     *
     * @return shoot accuracy
     */
    public double getAccuracy() {
        return this.shootAccuracy;
    }

    /**
     * method to shoot at the target selected
     *
     * @param target
     */
    public void shootAtTarget(Fighter target) {

        if (rnd.nextDouble() <= shootAccuracy) {

            if (target.getAlive()) {

                target.alive = false;

            }
        } else {

        }
    }

}
