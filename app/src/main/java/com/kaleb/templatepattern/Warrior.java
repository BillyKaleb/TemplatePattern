package com.kaleb.templatepattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version Warrior, v 0.1 2019-09-16 13:20 by Billy Kaleb Hananto
 */
public class Warrior extends CharacterCreation {

    @Override
    void weaponUsed() {
        System.out.println("Sword and Shield");
    }

    @Override
    void racePicked() {
        System.out.println("Human");
    }

    @Override
    void abillities() {
        System.out.println("Hitting");
    }
}
