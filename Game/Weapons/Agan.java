package Полиформизм.Weapons;

import Полиформизм.Weapon;

public class Agan extends Weapon {
    @Override
    public void shot() {

        System.out.println("Пушка стреляет ба бах ");
    }

    public void gunDev() {
        System.out.println("Пушка пехотная 45мм ");

    }
}
