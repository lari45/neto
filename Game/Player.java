package Полиформизм;

import Полиформизм.Weapons.*;


class Player {

    private Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[]{
                new Agan(),   // TODO заполнить слоты оружием
                new Gan(),
                new Pistol()
        };
    }

    public int getSlotsCount() {

      return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= 0 && slot <= weaponSlots.length) {
            Weapon weapon = weaponSlots[slot - 1];
            weapon.gunDev();
            weapon.shot();
        } else System.out.println("Нет такого слота с оружием ");
    }

    public void printWeapont() {
        for (int x = 0; x <= weaponSlots.length - 1; x++) {
            Weapon weapon = weaponSlots[x];
            System.out.print("Слот №" + (x + 1) + " ");
            weapon.gunDev();

        }
    }
}
