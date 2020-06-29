package com.kaleb.templatepattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version Healer, v 0.1 2019-09-17 16:33 by Billy Kaleb Hananto
 */
public class Healer extends CharacterCreation {

    @Override
    void weaponUsed() {
        System.out.println("Staff");
    }

    @Override
    void racePicked() {
        System.out.println("Dwarf");
    }

    @Override
    void abillities() {
        System.out.println("Healing");
    }
}
