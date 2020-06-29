package com.kaleb.templatepattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version Tamer, v 0.1 2019-09-16 13:26 by Billy Kaleb Hananto
 */
public class Tamer extends CharacterCreation {

    @Override
    void weaponUsed() {
        System.out.println("Random Weapon");
    }

    @Override
    void racePicked() {
        System.out.println("Human");
    }

    @Override
    void abillities() {
        System.out.println("Taming");
    }

    @Override
    boolean needWeapon() {
        return false;
    }
}
