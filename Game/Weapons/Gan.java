package Полиформизм.Weapons;

import Полиформизм.Weapon;

public class Gan extends Weapon {

    @Override
    public void shot() {

        System.out.println("Пулемет стреляет тра та та та та ");
    }

    public void gunDev() {
        System.out.println("Пулемет максим, патрон 7.62 ");

    }
}
