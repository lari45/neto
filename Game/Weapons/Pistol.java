package Полиформизм.Weapons;

import Полиформизм.Weapon;

public class Pistol extends Weapon {            //наследник класса weapon
    @Override
    public void shot() {
        System.out.println("Пистолет стреляет Пиф паф");
    }

    public void gunDev() {
        System.out.println("Пистолет калибра 45");
    }
}
