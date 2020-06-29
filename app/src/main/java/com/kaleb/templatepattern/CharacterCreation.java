package com.kaleb.templatepattern;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version CharacterCreation, v 0.1 2019-09-16 13:17 by Billy Kaleb Hananto
 */
public abstract class CharacterCreation {

    final void characterCreated() {
        pickingCharacter();
        pickingRace();
        racePicked();
        if (needWeapon()) {
            pickingWeapon();
            weaponUsed();
        }
        abillities();
    }

    abstract void weaponUsed();

    abstract void racePicked();

    abstract void abillities();

    void characterCreation() {
        System.out.println();
        System.out.println("CHARACTER CREATIOOOON");
        System.out.println("=============================");
    }

    void pickingCharacter() {
        System.out.println("Picking Character...");
    }

    void pickingRace() {
        System.out.println("Picking Race...");
    }

    void pickingWeapon() {
        System.out.println("Picking Weapon...");
    }

    boolean needWeapon() {
        return true;
    }
}
