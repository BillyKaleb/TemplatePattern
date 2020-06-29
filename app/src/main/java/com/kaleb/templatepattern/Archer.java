package com.kaleb.templatepattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version Archer, v 0.1 2019-09-16 13:21 by Billy Kaleb Hananto
 */
public class Archer extends CharacterCreation {

    @Override
    void weaponUsed() {
        System.out.println("Bow and Arrow");
    }

    @Override
    void racePicked() {
        System.out.println("Elf");
    }

    @Override
    void abillities() {
        System.out.println("Bow stuff");
    }
}
