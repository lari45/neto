package Полиформизм;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        game();
    }//main

    public static void game() {
        try (Scanner scanner = new Scanner(System.in)) {
            Player player = new Player();
            System.out.println("");
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()
            );
            player.printWeapont();

            while (true) {
                if (scanner.hasNextInt()) {
                    int slot = scanner.nextInt();
                    if (slot == -1) {
                        System.out.println("Game over!");
                        break;
                    } else player.shotWithWeapon(slot);
                } else {
                    System.out.println("Некорректный ввод  ");
                }
                game();
            }//while
        }
    }//game
}//class